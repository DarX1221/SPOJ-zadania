import java.util.*;
import java.lang.*;
 
class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scan = new Scanner(System.in);
 
        double r = scan.nextDouble();
        double d = scan.nextDouble();
 
        double r2 = (r * r) - ((d * d) / 4);
        double s = Math.PI * r2;
        s = Math.round(s * 100);
        s = s / 100;
 
        System.out.println(s);
    }
}
