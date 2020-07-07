import java.util.*;
import java.lang.*;

public class Main
{
    public static void main (String[] args) throws java.lang.Exception {

        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        for(int i = 0; i < t; i++) {
            int A = scan.nextInt();
            int B = scan.nextInt();
            int C = scan.nextInt();

            int M = (C * B) - B - A;
            int D =  C - 1;
            double x = (double) M / D;
            int result = abs(x * 12);


            System.out.println(result);
        }
    }

    static int abs(double number) {
        int numberInt = (int) number;

        if(number - numberInt >= 0.5) {
            return numberInt+1;
        }
        else {
            return numberInt;
        }
    }
}
