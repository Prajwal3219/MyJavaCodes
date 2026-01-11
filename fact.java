public class fact {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int sum =1;
       for(int i=1 ; i<=n; i++){
              sum = sum * (i);
       }
       return sum;
    }
    public static void main(String[] args) {
        int number = 5; 
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
    
}
