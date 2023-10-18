import java.util.*;
public class Pattern9 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(j==1 || i==1 || j==m || i == n){
                    System.out.print("*");
                    
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
