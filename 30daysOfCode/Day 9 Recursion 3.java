import java.util.*;
class Result {
    public static int factorial(int n) {
    // Write your code here
        if(n==0){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int sum=0;
     for(int i=0;i<=n;i++){
         sum = Result.factorial(i);
     }
     System.out.println(sum);
    }
}
