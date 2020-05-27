import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
 
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
 
        for(int i = 0; i < t; i++){
            int n = scan.nextInt();
            int sum[] = new int[n];
            int sumAll = 0;
            for(int i2 = 0; i2 < n; i2++){
                sum[i2] = scan.nextInt();
                sumAll = sumAll + sum[i2];
            }
            System.out.println(sumAll);
 
 
 
        }
    }
}
 
