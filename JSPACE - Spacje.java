/* "... a każdy wyraz rozpoczyna się wielką literą" - nie każdy, każdy poprzedzony spacją
jeżeli zdanie rozpoczyna się małaą literą -> zwracamy małą literę
! możliwa opcja więcej niż jednej spacji!!!
*/

//package com.company;

import java.util.*;
import java.lang.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {

        Scanner scan = new Scanner(System.in);

        ArrayList<String[]> lines = new ArrayList<>();
        String line = "example";

        while (line != null) {

            try {
                line = scan.nextLine();
                char[] text = line.toCharArray();
                int size = text.length;

                for (int i = 0; i < size; i++) {
                    int bufor;
                    if(text[i] == ' ') {
                        char sign = Character.toUpperCase(text[i+1]);
                        text[i+1] = sign;
                        continue;
                    }
                    System.out.print(text[i]);
                }
            } catch (Exception ex) {
                break;
            }
            System.out.println();
        }
    }
}
