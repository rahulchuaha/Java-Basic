import java.util.*;
public class AddIfDigit  {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch >= '0' && ch <= '9'){
             int num =  Character.getNumericValue(ch);
             num += 100;
            System.out.println(num);
        } else{
            System.out.println("This is not a digit");
        }
    }
}
