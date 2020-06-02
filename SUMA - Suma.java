    import java.util.Scanner;
     
    public class Main {
     
        public static void main(String[] args) {
            int result = 0;
     
            Scanner in = new Scanner(System.in);
            while (in.hasNext()){
                result += in.nextInt();
                System.out.println(result);
            }
     
        }
    }
     
