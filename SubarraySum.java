import java.util.HashMap;

public class SubarraySum {
    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int k = 33;

        findSubarray(arr, k);
    }

    public static void findSubarray(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // Case 1: subarray from start
            if (sum == k) {
                System.out.println("Found between index 0 and " + i);
                return;
            }

            // Case 2: subarray in middle
            if (map.containsKey(sum - k)) {
                int start = map.get(sum - k) + 1;
                System.out.println("Found between index " + start + " and " + i);
                return;
            }

            map.put(sum, i);
        }

        System.out.println("Not Found");
    }
}