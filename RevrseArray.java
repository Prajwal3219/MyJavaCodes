public class RevrseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int n = array.length;
        int[] reversedArray = new int[n];
        for (int i = 0; i < n; i++) {
            reversedArray[i] = array[n - 1 - i];
        }
        System.out.print("Reversed Array   : ");
        for (int num : reversedArray) {
            System.out.print(num + " heloo");
        }
    }
    
}
