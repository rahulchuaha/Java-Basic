import java.util.*;

public class CountDigit {
    public static int countDigit(int n){
        if(n/10 == 0)
            return 1;
        return 1 + countDigit(n / 10);
    }
    public static void printDigit(int n){
        while(n != 0){
            int digit = n%10;
            n = n/10;
            System.out.println(digit);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         System.out.println(countDigit(n));
        printDigit(n);
        
    }
}