import java.util.*;
public class PrintNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>0){
            System.out.print(n+" ");
            n /= 3;
        }
    }
}