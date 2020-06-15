package com.company;

import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {

        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();

            if (n == 0) {
                System.out.println("0");
            } else {
                int[] scanTab = new int[n];
                for (int i2 = 0; i2 < n; i2++) {
                    scanTab[i2] = scan.nextInt();
                }

                int[] result = new int[n];
                int y = 0;  // bufor of increment

                for (int i2 = 1; i2 < n; i2 += 2) {
                    result[y] = scanTab[i2];
                    y++;
                }
                for (int i2 = 0; i2 < n; i2 += 2) {
                    result[y] = scanTab[i2];
                    y++;
                }

                for (int i2 = 0; i2 < n; i2++) {
                    System.out.print(result[i2] + " ");
                }
                System.out.println();
            }
        }

    }

}
