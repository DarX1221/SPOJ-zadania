    import java.util.*;
    import java.lang.*;
     
    public class Main {
        public static void main(String[] args) throws java.lang.Exception {
            char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
                    'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
                    'Y', 'Z'};
            int size = alphabet.length;
            Scanner scan = new Scanner(System.in);
     
            String line;
            while (scan.hasNextLine()) {
                line = scan.nextLine();
                char lineChar[] = line.toCharArray();
     
                for (int i = 0; i < lineChar.length; i++) {
                    for (int i2 = 0; i2 < size; i2++) {
                        if(lineChar[i] == ' ') {break;}
                        if (lineChar[i] == alphabet[i2]) {
                            if (i2 > (size - 4)) {
                                lineChar[i] = alphabet[i2 - size + 3];
                                break;
                            } else {
                                lineChar[i] = alphabet[i2 + 3];
                                break;
                            }
                        }
                    }
                }
                System.out.println(lineChar);
     
            }
     
        }
    } 
