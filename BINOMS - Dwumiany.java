import java.util.*;
import java.lang.*;
 
public class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scan = new Scanner(System.in);
 
        int t = scan.nextInt();
        for(int i = 0; i < t; i++) {
            double n = scan.nextDouble();
            double k = scan.nextDouble();
 
            double result = newton(n ,k);
            int resultInt = (int) result;
            System.out.println(resultInt);
        }
    }
 
    private static double newton(double n, double k) {
        double result = 1;
        for(int i = 1; i <= k; i++) {
            result = (result * (n - i + 1) / i);
        }
        return  Math.round(result);
    }
}
