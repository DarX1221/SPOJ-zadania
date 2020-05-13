import java.util.*;
import java.lang.*;
import java.math.BigInteger;
 
 
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
        int k;
 
        Scanner scan = new Scanner(System.in);
        k = scan.nextInt();
        scan.nextLine();
 
        for (int i = 0; i < k; i++ ) {
            String line = scan.nextLine();
            String splitLine[] = line.split(" ");
 
            String number1 = splitLine[0];
            String number2 = splitLine[1];
 
            BigInteger number1BI = new BigInteger(number1);
            BigInteger number2BI = new BigInteger(number2);
 
 
            boolean divisibility = false;
            divisibility = (number1BI.mod(number2BI) == BigInteger.ZERO);
 
            if (divisibility) {
                System.out.println("TAK");
            }
            if (!divisibility) {
                System.out.println("NIE");
            }
 
        }
    }
}
