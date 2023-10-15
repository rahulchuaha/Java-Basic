import java.util.*;
public class TribonacciNumber  {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0,b=1, c=1;
            for(int i=0; i<n; i++){
                int d = a+b+c;
                a=b;
                b=c; 
                c=d;
            }
        System.out.println(a);
    }
}