import java.util.*;
public class PrintSeries1 {

    public static void main(String[] args) {
          for (char SLet = 'A'; SLet < 'Z' + 1; SLet++) {
            char toPrint = SLet;
            if (SLet % 2 != 0)
                toPrint = Character.toLowerCase(toPrint);
            System.out.println(toPrint + " ");
        }

        System.out.println();
    }
    }