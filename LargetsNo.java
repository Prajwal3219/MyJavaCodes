public class LargetsNo {
    public static void main(String[] args) {
        
  

    int arr[] = {2,7,9,4,10};
    int ans = Integer.MIN_VALUE;
    for(int i=0; i<arr.length; i++){
     ans = Math.max(ans, arr[i]);
    }

    System.out.println(ans);
 }

}
