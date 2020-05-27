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
            String[] bufor = scan.nextLine().split(" ");
            int N = Integer.valueOf(bufor[0]);
            int M = Integer.valueOf(bufor[1]);
            int[] timeForOneCake = new int[N];
 
            for(int i2 = 0; i2 < N; i2++) {
                timeForOneCake[i2] = Integer.valueOf(scan.nextLine());
            }
            System.out.println(main.countNumberOfCakeBoxes(N, M, timeForOneCake));
        }
 
    }
 
    private int countNumberOfCakeBoxes(int N, int M, int[] time) {
        int size = time.length;
        int[] numberOfCakePerDay = new int[size];
        int sumCake = 0;
        for(int i = 0; i < size; i++) {
            numberOfCakePerDay[i] = 86400 / time[i];
            sumCake += numberOfCakePerDay[i];
 
        }
        if(sumCake % M == 0) {
            return sumCake / M;
        }
        else {
            return ((sumCake / M) + 1);
        }
 
    }
 
 
}
