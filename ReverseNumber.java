 import java.util.*;

public class ReverseNumber {
    public static int reverse(int n){
        int res = 0;
        while(n > 0){
            int digit = n%10;
            res = res*10+digit;
            n /= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = reverse(n);
        System.out.println(rev);
    }
}