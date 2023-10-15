import java.util.*;
public class PowerOf10 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 1;
        while(n>0){
            res *= 10;
            n--;
        }
        System.out.println(res);
    }
}
