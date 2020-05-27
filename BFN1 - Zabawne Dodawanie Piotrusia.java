import java.util.*;
import java.lang.*;
 
class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
 
 
        Scanner scan = new Scanner(System.in);
        Main main = new Main();
 
        int k = scan.nextInt();
        int number[] = new int[k];
 
        for(int i = 0; i < k; i++){
            number[i] = scan.nextInt();
            int sum = number[i];
            int counter = 0;
 
            if(main.palindrom(sum) != 0){
                do {
                    sum = main.palindrom(sum);
                    counter++; }
                while (main.palindrom(sum) != 0);   }
            else    sum = number[i];
 
            System.out.println(sum +  " " + counter);
 
 
 
        }
    }
    int palindrom(int pal){
        String palS = String.valueOf(pal);
        StringBuilder palSBehind = new StringBuilder();
        int length = palS.length();
        int iR = length;
 
        for (int i = 0; i < length; i++){
            palSBehind.append(palS.substring(iR - 1, iR));
            iR--;
        }
        String palSBeh = palSBehind.toString();
 
        if(palS.equals(palSBeh))     {
            return 0;}
        else {
            int i1 = Integer.parseInt(palS);
            int i2 = Integer.parseInt(palSBeh);
            return i1 + i2;
        }
 
    }
} 
