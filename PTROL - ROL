import java.util.*;
import java.lang.*;
 
public class Main
{
    public static void main (String[] args) throws java.lang.Exception {
 
        Main main = new Main();
        Scanner scan = new Scanner(System.in);
 
        int k = scan.nextInt();
        scan.nextLine();
        for(int i = 0; i < k; i++) {
 
            String line = scan.nextLine();
            System.out.println(main.cyclicMove(line));
        }
 
    }
 
    String cyclicMove(String line) {
        String[] numbers = line.split(" ");
        StringBuilder result = new StringBuilder();
 
        for(int i = 2; i < numbers.length; i++) {
            result.append(numbers[i]);
            result.append(" ");
        }
        result.append(numbers[1]);
 
        return String.valueOf(result);
    }
}
