import java.util.*;

public class FindGcd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        while(x != y){
            if(x>y)
                x = x-y;
             else 
                 y = y-x;
        }  
           System.out.println(y); 
    }
}