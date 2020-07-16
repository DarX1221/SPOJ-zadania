import java.util.*;
import java.lang.*;

public class Main
{
    public static void main (String[] args) throws java.lang.Exception  {

        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        scan.nextLine();

        String[] lines  = new String[t];
        for(int i = 0; i < t; i++) {
            lines[i] = scan.nextLine();
        }

        HashMap<Character, Integer> amountOfLetters = new HashMap<>();
        ArrayList<Character> lettersSort = new ArrayList<>();

        for(int i = 0; i < t; i++) {
            for (int i2 = 0; i2 < lines[i].length(); i2++) {
                Character letter = lines[i].charAt(i2);
                if (letter != ' ') {
                    if (amountOfLetters.containsKey(letter)) {
                        Integer value = amountOfLetters.get(letter);
                        amountOfLetters.put(letter, value + 1);
                    } else {
                        amountOfLetters.put(letter, 1);
                        lettersSort.add(letter);
                    }

                }
            }
        }
        
        lettersSort.sort((o1, o2) -> {
            Integer i1 = o1.hashCode();
            if(i1 < 91) { i1 += 100;}

            Integer i2 = o2.hashCode();
            if(i2 < 91) { i2 += 100;}

            return i1.compareTo(i2);
        });
        for(int i = 0; i < amountOfLetters.size(); i++) {
            Character key = lettersSort.get(i);
            Integer value = amountOfLetters.get(key);
            System.out.println(key + " " + value);
        }



    }
}

