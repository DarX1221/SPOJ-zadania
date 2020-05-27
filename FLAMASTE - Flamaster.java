import java.util.*;
import java.lang.*;
 
public class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scan = new Scanner(System.in);
        Main main = new Main();
 
        int k = scan.nextInt();
        scan.nextLine();
 
        for(int i = 0; i < k; i++) {
            System.out.println(main.countRepeatOfLetters(scan.nextLine()));
        }
    }
 
 
    String countRepeatOfLetters(String inputText) {
        if(inputText.length() == 1) {
            return inputText;
        }
 
        String text = inputText + ";";  //I add ";" because it let me compare last char, and i ";" is not letter
        StringBuilder textBldr = new StringBuilder();
        int amountOfLetter = 1;
 
        for(int i = 0; i < text.length()-1; i++) {
 
            if(text.charAt(i) == text.charAt(i + 1)){
                amountOfLetter++;
            }
            else {
                textBldr.append(text.charAt(i));
                if (amountOfLetter > 2) {
                    textBldr.append(amountOfLetter);
                }
                else if (amountOfLetter == 2) {
                    textBldr.append(text.charAt(i));
                }
                amountOfLetter = 1;
            }
        }
        amountOfLetter = 1;
        return textBldr.toString();
    }
 
}
