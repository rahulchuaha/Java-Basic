import java.util.*;

public class PrimeFactor   { 
    public static boolean isPrime(int n){
        if(n<=1) return false;
        int root = (int)Math.sqrt(n);
        for(int i=2; i<=root; i++){
            if(n%i == 0) 
                return false;
        } 
        return true;
    }
    public static void primeFactorization(int n){
        for(int i=1; i<=n; i++){
            if(n%i == 0 && isPrime(i) == true){
                System.out.println(i);
            }
        }
    }
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primeFactorization(n);
    }
}