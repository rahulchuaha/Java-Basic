import java.util.Scanner;

public  class Armstrong2{
   public static boolean findArmstrong(int n){
         if(n < 10) return true;
         int sum = 0;
         for(int i=n; i>0; i/=10){
             int digit = i%10;
             int cube = digit*digit*digit;
             sum += cube;
         }
         return (sum == n);
     }
    
      
    public static void main(String args[])
    {   Scanner sc = new Scanner(System.in);
        int left = sc.nextInt();
        int right = sc.nextInt();
     for(int idx=left; idx<=right; idx++){
         if(findArmstrong(idx) == true){
             System.out.println(idx);
         }
     }
        
         
    }
}
 