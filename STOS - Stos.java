import java.util.*;
import java.lang.*;

public class Main
{
    static int[] stosTab = new int[10];
    static int position = -1;
    
    public static void main (String[] args) throws java.lang.Exception {
        
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String sign = in.next();

            if(sign.equals("+")) {
                addStos(in.next());
            }
            if(sign.equals("-")) {
                removeStos();
            }
        }
        
    }

    static void addStos(String bufor) {
        int number = Integer.valueOf(bufor);
        if(position < stosTab.length-1) {
            position++;
            stosTab[position] = number;
            System.out.println(":)");
        }
        else {
            System.out.println(":(");
        }
    }

    static void removeStos() {
        if(position >= 0) {
            System.out.println(stosTab[position]);
            stosTab[position] = 0;
            position--;
        }
        else {
            System.out.println(":(");
        }
    }

}

