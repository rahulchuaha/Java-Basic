import java.util.*;
public class Pattern7 {
    public static void swap(int x, int y , int z){
        int c = x; 
        x = z;
        z = y;
        y = c;
         System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        swap(x,y,z);
    }
        
}
 