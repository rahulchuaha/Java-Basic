import java.util.*;
public class PrintSeries2 {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        for(int i=n; i>=0;  i = i-k){
            
              
                System.out.println(i);
              
             
        }
         
    }
}