import java.util.*;
import java.lang.*;

public class Main
{
    public static void main (String[] args) throws java.lang.Exception {

        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()) {


            double a = scan.nextDouble();
            double b = scan.nextDouble();
            double c = scan.nextDouble();
            
            //  ax + b = c
            //  x = ?

            if (a == 0) {
                if (c == b) {
                    System.out.println("NWR");
                } else {
                    System.out.println("BR");
                }
            } else {
                double x = (c - b) / a;
                x = Math.round(x * 100);
                // x = x / 100  return wrong data: 1.0
                // this code return 1.00
                long xLong = (long) x;
                String xStr = Long.toString(xLong);
                int size = xStr.length();

                if(size == 3) {
                    System.out.println(xStr.charAt(0) + "." + xStr.substring(size - 2, size));
                }
                else {
                    System.out.println(xStr.substring(0, size - 2) + "." + xStr.substring(size-2, size));
                }
            }
        }

    }
  
    
}
