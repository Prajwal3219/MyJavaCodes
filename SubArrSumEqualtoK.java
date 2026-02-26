public class SubArrSumEqualtoK {
    public static int checkSum(int[] arr, int n, int k, int count) {

int left =0, right =0; int sum =0;

while(right < n) {
    sum += arr[right];

        if (sum == k) {
            count++;
        }

        if(sum > k) {
            while(sum > k) {
                sum -= arr[left];
                left++;
            }
            if (sum == k) {
                count++;
            }
        }
        right++;
    }

    return count;
}
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int k = 9;
        int count = 0;  


       System.out.println(checkSum(arr, n, k, count));
        }
    
}