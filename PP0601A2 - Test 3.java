import java.util.*;
import java.lang.*;
 
public class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
 
        Scanner scan = new Scanner(System.in);
 
        int lastNumber = 42;
        int increment = 0;
        int number;
        while(increment < 3 && scan.hasNext()) {
            number = scan.nextInt();
			System.out.println(number);
 
            if(number == 42 && number != lastNumber) {
                increment++;
            }
            lastNumber = number;
 
        }
    }
}
