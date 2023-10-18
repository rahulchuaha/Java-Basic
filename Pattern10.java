
import java.util.*; 
public class Pattern10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        int row = sc.nextInt();
        for (int i = 1; i <=row; i++) {
            for (int j = 1; j <= row; j++) 
                if((  i==row) || (j==1 || j==row))
                    System.out.print("*");
                else
                    System.out.print(" ");
            
            System.out.println();
            
        }
    }
}
