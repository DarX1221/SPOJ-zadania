import java.util.*;
import java.lang.*;
 
public  class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
 
        Main main = new Main();
        Scanner scan = new Scanner(System.in);
 
        int t = scan.nextInt();
        for(int i =0; i < t; i++) {
            int number = scan.nextInt();
            System.out.println(main.problemCollatza(number));
        }
 
    }
 
    private int counter = 0;
    private int bufor = 0;
    int problemCollatza(int number) {
        if(number == 1) {
            bufor = counter;
            counter = 0;
            return bufor;
        }
        if(number%2 == 0) {
            number = number / 2;
            counter++;
            problemCollatza(number);
        }
        else {
            number = ((number * 3) + 1);
            counter++;
            problemCollatza(number);
        }
 
        return bufor;
    }
 
}
