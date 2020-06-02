
import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) throws java.lang.Exception {

        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            double A = in.nextDouble();
            double B = in.nextDouble();
            double C = in.nextDouble();
            System.out.println(deltaAmountOfResults(A, B, C));
        }
    }

    static int deltaAmountOfResults(double A, double B, double C) {
        double delta = B * B - ( 4 * A * C);
        if(delta == 0) {
            return 1;
        }
        if(delta > 0) {
            return 2;
        }
        else {
            return 0;
        }
    }
}

