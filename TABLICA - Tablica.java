import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
 
        Scanner scan = new Scanner(System.in);
 
        String line = scan.nextLine();
        String[] numbers = line.split(" ");
 
        for (int i = numbers.length-1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
