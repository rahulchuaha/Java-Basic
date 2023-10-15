import java.util.*;
public class toggleCharacters {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch >= 'a' && ch <= 'z'){
            char uc = (char) (ch - 'a' + 'A');
            System.out.println(uc);
        } else if(ch >= 'A' && ch <= 'Z'){
            char lc = ( char ) ( ch - 'A' + 'a' );
             System.out.println(lc);
        }
    }
}
