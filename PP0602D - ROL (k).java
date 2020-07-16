import java.util.*;
import java.lang.*;

public class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextByte();
        int k = scan.nextByte();

        int[] tab = new int[n];
        for(int i = 0; i < n; i++) {
            tab[i] = scan.nextInt();
        }

        for(int i = k; i < n; i++) {
            System.out.print(tab[i] + " ");
        }


        for(int i = 0; i < k; i++) {
            System.out.print(tab[i] + " ");
        }

    }
}

