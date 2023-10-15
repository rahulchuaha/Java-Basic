import java.util.*;
public class NthPowerOfTwo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 1;
        while(n != 0){
            result *= 2;
            --n;
        }
        System.out.println(result);
    }
}