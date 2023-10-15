import java.util.*;
public class PrintSeries  {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=2; i<=n; i=i+7){
            System.out.println(i);
        }
    }
}