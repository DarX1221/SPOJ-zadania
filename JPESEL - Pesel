import java.util.*;
import java.lang.*;
 
public class Main {
    public static void main(String[] args) throws java.lang.Exception {
 
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        Main Pesel = new Main();
        Boolean check = false;
 
        for (int i = 0; i < k; i++) {
 
 
            try {
                long PESEL = scan.nextLong();
                check = Pesel.checkPesel(PESEL);
            } catch (Exception ex) {
            }
            if (check)
                System.out.println("D");
            else
                System.out.println("N");
        }
    }
 
 
        boolean checkPesel ( long PESEL){
            String PESELchar = String.valueOf(PESEL);
 
            int number1 = PESELchar.charAt(0) * 1;
            int number2 = PESELchar.charAt(1) * 3;
            int number3 = PESELchar.charAt(2) * 7;
            int number4 = PESELchar.charAt(3) * 9;
            int number5 = PESELchar.charAt(4) * 1;
            int number6 = PESELchar.charAt(5) * 3;
            int number7 = PESELchar.charAt(6) * 7;
            int number8 = PESELchar.charAt(7) * 9;
            int number9 = PESELchar.charAt(8) * 1;
            int number10 = PESELchar.charAt(9) * 3;
            int number11 = PESELchar.charAt(10) * 1;
 
            int sum = number1 + number2 + number3 + number4 + number5 + number6 +
                    number7 + number8 + number9 + number10 + number11;
 
            if (sum > 0 && (sum % 10 == 0)){
                return true;}
            else{
                return false;}
        }
}
