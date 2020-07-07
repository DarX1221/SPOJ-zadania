import java.util.*;
import java.lang.*;

public class Main
{
    public static void main (String[] args) throws java.lang.Exception {

        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        for(int i = 0; i < t; i++) {
            int x = scan.nextInt();
            System.out.println(x * x);
        }
    }
}

