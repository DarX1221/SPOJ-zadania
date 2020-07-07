import java.util.*;
import java.lang.*;

public class Main
{
    public static void main (String[] args) throws java.lang.Exception {

        Scanner scan = new Scanner(System.in);

        // scan number of tests
        int t = scan.nextInt();

        for (int i = 0; i < t; i++) {
            // scan size of tab
            int xSize = scan.nextInt();
            int ySize = scan.nextInt();

            int[][] tab = new int[xSize][ySize];

            // scan tab
            for (int x = 0; x < xSize; x++) {
                for (int y = 0; y < ySize; y++) {
                    tab[x][y] = scan.nextInt();
                }
            }

            // edit tab
            int[][] resultTab = new int[xSize][ySize];

            // First line of tab
            for (int i2 = 0; i2 < ySize - 1; i2++) {
                resultTab[0][i2] = tab[0][i2 + 1];
            }

            resultTab[0][ySize - 1] = tab[1][ySize - 1];      // last in this line

            // Lines inside tab
            for (int x = 1; x < xSize-1; x++) {
                resultTab[x][0] = tab[x - 1][0];      // first in line

                for (int y = 1; y < ySize; y++) {
                    resultTab[x][y] = tab[x][y];
                }

                resultTab[x][ySize-1] = tab[x + 1][ySize-1];      // last in this line
            }


            // Last lines in tab
            resultTab[xSize-1][0] = tab[xSize-2][0];      // first in line

            for (int i2 = 1; i2 < ySize; i2++) {
                resultTab[xSize-1][i2] = tab[xSize-1][i2 - 1];
            }

            for (int x = 0; x < xSize; x++) {
                for (int y = 0; y < ySize; y++) {
                    System.out.print(resultTab[x][y] + " ");
                }
                System.out.println();
            }


        }



    }

}


