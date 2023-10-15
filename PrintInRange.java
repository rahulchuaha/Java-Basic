import java.util.*;
public class PrintInRange {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        for(int i=x; i<=n; i++){
            System.out.println(i);
        }
    }
}