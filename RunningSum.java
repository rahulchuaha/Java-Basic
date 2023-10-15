import java.util.*;
public class RunningSum {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        int sum = 0;
         for(int i=0; i<n; i++){
             int t = sc.nextInt();
             sum += t;
             System.out.print(sum+" ");
         }
         
         
              
        }
           
    }

