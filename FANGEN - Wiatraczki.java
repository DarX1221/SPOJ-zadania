import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws java.lang.Exception {
 
        Main main = new Main();
 
        int number;
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            number = in.nextInt();
 
            if(number == 0) { break;}
 
            if(number < 0) {
                System.out.println(main.leftWindMill(Math.abs(number)));
            }
            else {
                System.out.println(main.leftWindMill(number));
            }
        }
        
        
 
 
 
 
 
    }
 
 
 
    StringBuilder rightWindMill(int number) {
        int size = number;
        int weigh = 2 * size;
        char[][] windmill = new char[weigh][weigh];
 
        for (int i = 0; i < weigh; i++) {
            for (int i2 = 0; i2 < weigh; i2++) {
                windmill[i][i2] = '*';
            }
        }
 
        int halfOfMatrix = size;
        int sizeOnLevel = 0;
        int amount = 0;
        for (int i = 1; i <= weigh; i++) {
 
            if (sizeOnLevel < size) {
                for (int i2 = 0; i2 < sizeOnLevel; i2++) {
                    windmill[size - i][size - i2 - 1] = '.';
                }
            }
            /*
             *...****
             **..****
             ***.****
             ********
             ********
             ********
             ********
             ********
             */
            if (sizeOnLevel < size) {
                for (int i2 = 0; i2 < sizeOnLevel; i2++) {
                    windmill[i - 1][weigh - i2 - 1] = '.';
                }
 
            }
            /*
             ********
             *******.
             ******..
             *****...
             ********
             ********
             ********
             ********
             */
 
            if (sizeOnLevel < size) {
                for (int i2 = 0; i2 < sizeOnLevel; i2++) {
                    windmill[weigh - i][i2] = '.';
                }
            }
            /*
            ********
            ********
            ********
            ********
            ...*****
            ..******
            .*******
            ********
             */
 
            if (sizeOnLevel < size) {
                for (int i2 = 0; i2 < sizeOnLevel; i2++) {
                    windmill[size + i - 1][size + i2] = '.';
                }
            }
            /*
             ********
             ********
             ********
             ********
             ********
             ****.***
             ****..**
             ****...*
             */
            sizeOnLevel++;
        }
 
        StringBuilder matrixString = new StringBuilder();
        for (int i = 0; i < weigh; i++) {
            for (int i2 = 0; i2 < weigh; i2++) {
                matrixString.append(windmill[i][i2]);
            }
            matrixString.append("\n");
        }
        return matrixString;
    }
 
 
 
    StringBuilder leftWindMill(int number) {
        int size = number;
        int weigh = 2 * size;
        char[][] windmill = new char[weigh][weigh];
        int sizeOnLevel = size - 1;
        int amount = 0;
 
        for (int i = 0; i < weigh; i++) {
            for (int i2 = 0; i2 < weigh; i2++) {
                windmill[i][i2] = '*';
            }
        }
 
        for (int i = 1; i <= weigh; i++) {
            for (int i2 = 0; i2 < sizeOnLevel; i2++) {
                windmill[size - i][i2] = '.';
                windmill[size][weigh - i2 - 1] = '.';
            }
            /*
            ********
            .*******
            ..******
            ...*****
            *****...
            ********
            ********
            ********
             */
 
            for (int i2 = 0; i2 < sizeOnLevel - 1; i2++) {
                windmill[size + i][weigh - i2 - 1] = '.';
            }
            /*
             ********
             ********
             ********
             ********
             ********
             ******..
             *******.
             ********
             */
 
            for (int i2 = 0; i2 < sizeOnLevel; i2++) {
                windmill[i - 1][size + i2] = '.';
            }
            /*
            ********
            .*******
            ..******
            ...*****
            *****...
            ********
            ********
            ********
             */
 
            if (i > size - 1 && amount < size) {
                for (int i2 = 0; i2 < amount; i2++) {
                    windmill[i][size - i2 - 1] = '.';
                }
                amount++;
            }
            /*
             ********
             ********
             ********
             ********
             ********
             ***.****
             **..****
             *...****
             */
            sizeOnLevel--;
        }
 
        // write String Builder
        StringBuilder matrixString = new StringBuilder();
        for(int i = 0; i < weigh; i++) {
            for(int i2 = 0; i2 < weigh; i2++) {
                matrixString.append(windmill[i][i2]);
            }
            matrixString.append("\n");
        }
        return matrixString;
    }
 
}
