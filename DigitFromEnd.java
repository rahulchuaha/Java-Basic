import java.util.*;
public class DigitFromEnd  {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n; i>=1;){
            int lastDigit = i%10;
            System.out.println(lastDigit);
            i = i/10;
        }
    }
}