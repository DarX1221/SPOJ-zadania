import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {

        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        scan.nextLine();

        String[] linesTab = new String[t];
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            
            int[] tab = new int[n];
            for (int i2 = 0; i2 < n; i2++) {
                tab[i2] = scan.nextInt();
            }
            System.out.println(returnNumberClosetAverage(tab));
        }
        
    }

    static int returnNumberClosetAverage(int[] numbersTab) {


        int[] numbers = numbersTab;
        int size = numbersTab.length;
        int sum = 0;

        for (int i = 0; i < size; i++) {
            sum += numbers[i];
        }
        
        double average = (double) sum / size;


        double difference = Math.abs(average - numbers[0]);
        int result = numbers[0];

        for (int i = 0; i < size; i++) {
            if (Math.abs(average - numbers[i]) < difference) {
                difference = Math.abs(average - numbers[i]);
                result = numbers[i];
            }
        }
        return result;
    }
}

