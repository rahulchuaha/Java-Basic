import java.util.*;
public class PrintNumber  {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         for(int i=1; i<=n; i++){
             if(i%3 == 0 ){
                 System.out.print(i+" ");
             }  else if(i%5 == 0){
                  System.out.print(i+" ");
             } else if(i%3 == 0 && i%5 == 0){
                  System.out.print(i+" ");
             }
         }
        
        
        
         
        }
    }
