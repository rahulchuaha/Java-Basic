import java.util.*;
public class Rotate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n%1000;
        int b = n/1000;
        int output = a*10000+b;
        System.out.println(output);
    }
}
