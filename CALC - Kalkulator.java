    import java.util.*;
    import java.lang.*;
     
    public class Main
    {
    	public static void main (String[] args) throws java.lang.Exception
    	{
     
            Scanner scan = new Scanner(System.in);
            String line = "I am  not null";
     
     
            while (line != null){
     
                
     
                try {
                    line = scan.nextLine();
                    String[] output = line.split(" ");
                    char operation_sign = output[0].charAt(0);
                    int number1 = Integer.parseInt(output[1]);
                    int number2 = Integer.parseInt(output[2]);
     
                    Mathematical_operations math = new Mathematical_operations();
                    System.out.println(math.operation(operation_sign, number1, number2));
                }
                catch (Exception ex){
                    //System.out.println(ex);
                    break;
                
                }
            }
        }
    }
     
     
     
    class Mathematical_operations{
        int operation(char operation, int number1, int number2){
            int score = 0;
            switch (operation) {
                case '+': score = addition(number1, number2);       break;
                case '-': score = subtraction(number1, number2);    break;
                case '*': score = multiplication(number1, number2); break;
                case '/': score = division(number1, number2);       break;
                case '%': score = modulo(number1, number2);       break;
            }
            return score;
        }
        int addition(int number1, int number2){
            return number1 + number2;
        }
     
        int subtraction(int number1, int number2){
            return number1 - number2;
        }
     
        int multiplication(int number1, int number2){
            return number1 * number2;
        }
     
        int division(int number1, int number2){
            return number1/number2;
        }
     
        int modulo(int number1, int number2){return number1%number2;}
    } 
