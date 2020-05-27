import java.util.*;
import java.lang.*;
 
 
public class Main {
    public static void main(String[] args) throws java.lang.Exception {
 
        Scanner scan = new Scanner(System.in);
        Main main = new Main();
 
        int k = scan.nextInt();
        for (int i = 0; i < k; i++) {
 
            int[] co_ordinates = {0, 0};
            int direct;
            int steps;
            int k2 = scan.nextInt();
 
            for (int i2 = 0; i2 < k2; i2++) {
                direct = scan.nextInt();
                if(direct > 4){
                    throw new Exception();
                }
                steps = scan.nextInt();
                co_ordinates = main.move(co_ordinates, direct, steps);      //    co-ordinates(x, y)
            }
            if (co_ordinates[0] == 0 && co_ordinates[1] == 0) {
                System.out.println("studnia");
            } else {
                main.viewMap(co_ordinates);
            }
 
        }
 
    }
 
    int[] move(int[] co_ordinates, int direct, int steps) {
        switch (direct) {
            case 0:
                co_ordinates[1] += steps;
                break;
            case 1:
                co_ordinates[1] -= steps;
                break;
            case 2:
                co_ordinates[0] -= steps;
                break;
            case 3:
                co_ordinates[0] += steps;
                break;
        }
        return co_ordinates;
    }
 
    void viewMap(int[] co_ordinates) {
        int direct = 0;
        int steps = 0;
 
        if(co_ordinates[1] > 0) {
            direct = 0;
            steps = co_ordinates[1];
            System.out.println(direct + " " +  steps);
        }
        if(co_ordinates[1] < 0) {
            direct = 1;
            steps = Math.abs(co_ordinates[1]);
            System.out.println(direct + " " +  steps);
        }
        if(co_ordinates[0] > 0) {
            direct = 3;
            steps = co_ordinates[0];
            System.out.println(direct + " " + steps);
        }
        if(co_ordinates[0] < 0) {
            direct = 2;
            steps = Math.abs(co_ordinates[0]);
            System.out.println(direct + " " + steps);
        }
 
    }
}
