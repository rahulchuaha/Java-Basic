import java.util.*;
public class Pattern13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i+j <= n){
                    System.out.print(" ");
                    
                } else if(j == n){
                    System.out.print("*");
                } else{
                    System.out.print("**");
                }
            }
            System.out.println();
        }
        for(int i=n-1; i>=1; i--){
            for(int j=1; j<=n; j++){
                if(i+j <= n){
                    System.out.print(" ");
                    
                } else if(j == n){
                    System.out.print("*");
                } else{
                    System.out.print("**");
                }
            }
            System.out.println();
        }
    }
}