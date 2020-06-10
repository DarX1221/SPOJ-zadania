import java.util.*;
import java.lang.*;

public class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {

        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        for(int i = 0; i < t; i++) {
            int number = scan.nextInt();
            String hex = convert(number, 16);
            String elvx = convert(number, 11);
            System.out.println(hex + " " + elvx);
        }

    }

    static String convert(int n, int v) {
        char[] tab = new char[50];
        char[] signs = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
        int index = 0;

        for(int i = 0; n != 0; n = n/v) {
            tab[index++] = signs[n % v];
        }

        String text = "";
        for(int i = 0; (i < tab.length && tab[i] != 0); i++) {
            text = tab[i] + text;
        }
        return text;
    }

}

