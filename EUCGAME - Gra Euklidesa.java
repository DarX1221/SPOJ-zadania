import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws Exception{
 
        Scanner scan = new Scanner(System.in);
 
        int t = scan.nextInt();
 
        for (int i = 0; i < t; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
 
            int result = 0;
 
            while (a != 0 && b != 0) {
                if (a == b) {
                    result = a + b;
                    break;
                }
 
                if (a < b) {
                    b = b - a;
                } else {
                    a = a - b;
                }
            }
            System.out.println(result);
        }
    }
}
