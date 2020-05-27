import java.util.*;
import java.lang.*;
 
class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Main main = new Main();
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
 
        for(int i = 0; i < k; i++) {
            float t = scan.nextFloat();
            System.out.println(main.floatToHexStr(t));
        }
    }
 
    String floatToHexStr(float number) {
        String tHexString = Integer.toHexString(Float.floatToIntBits(number));
 
        StringBuilder result = new StringBuilder();
 
        // you need create answear for "0"
        if(tHexString.equals("0")) {
            return "0 0 0 0";
        }
 
        // 2 first numbers
        // next in loop " " and another 2 numbers and next ...
        result.append(tHexString.charAt(0));
        result.append(tHexString.charAt(1));
 
        for (int i = 2; i < 8; i = i +2) {
            result.append(" ");
            // if we have 00 change to 0
            if((tHexString.charAt(i) == '0') && (tHexString.charAt(i + 1) == '0')){
                result.append("0");
            }
            else if ((tHexString.charAt(i) == '0') && (tHexString.charAt(i + 1) != '0')) {
                result.append(tHexString.charAt(i + 1));
            }
            else {
                result.append(tHexString.charAt(i));
                result.append(tHexString.charAt(i + 1));
            }
        }
 
 
        String finalResult = String.valueOf(result);
 
        return finalResult;
    }
}
