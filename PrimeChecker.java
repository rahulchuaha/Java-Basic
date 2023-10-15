import java.util.*;

public class PrimeChecker { 
    public static String isPrime(int n){
        for(int i=2; i<n; i++){
            if(n % i == 0)
            return "No";
        } 
        return "Yes";
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n));
    }
}