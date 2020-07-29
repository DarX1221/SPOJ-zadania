import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
 
public class Main {
 
    public static void main(String[] args) {
 
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s;
        ArrayList<String> lines = new ArrayList<>();
        try {
            while ((s = r.readLine()) != null) {
                lines.add(s);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
 
        for (int i = 0; i < lines.size(); i++) {
            int firstSignBufor = 0;
            int secondSignBufor = 0;
            String text = lines.get(i);
            for (int i2 = 0; i2 < text.length(); i2++) {
 
                if (text.charAt(i2) == '<') {
                    firstSignBufor = i2;
                }
                if (text.charAt(i2) == '>') {
                    secondSignBufor = i2;
                    String bufer[] = new String[3];
                    bufer[0] = text.substring(0, firstSignBufor);
                    bufer[1] = text.substring(firstSignBufor, secondSignBufor);
                    bufer[2] = text.substring(secondSignBufor);
 
                    bufer[1] = bufer[1].toUpperCase();
 
                    text = bufer[0] + bufer[1] + bufer[2];
                }
            }
            System.out.println(text);
        }
    }
}
