import java.util.*;
public class Armstong1 {
    public static boolean isArmstrong(int n){
        int sum = 0;
        for(int i=n; i>0; i/=10){
            int digit = i%10;
            int cube = digit * digit * digit;
            sum += cube;
        }
        return (sum == n);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans =  isArmstrong(n);
        System.out.println(ans);
    }
}