import java.util.*;
import java.lang.*;

public class Main
{
    public static void main (String[] args) throws java.lang.Exception {

        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        for(int i = 0; i < t; i++) {
            int n = scan.nextInt();

            ArrayList<Integer> score = new ArrayList<>();
            for(int i2 = 0; i2 < n; i2++) {
                score.add(scan.nextInt());
            }
            concursJudge(score);
        }
    }

    static void concursJudge(ArrayList<Integer> score) {
        score.sort(Integer::compareTo);
        int size = score.size();
        int max = score.get(size-1);


        ArrayList<Integer> scoreBufor = new ArrayList<>();
        for(int i = size-1; i > -1 ; i--) {
            if(score.get(i) >= max) {
                scoreBufor.add(score.get(i));
            }
        }

        int sizeBuf = scoreBufor.size();
        for (int i = sizeBuf; i < size; i++ ) {
            scoreBufor.add(i, score.get(i - sizeBuf));
        }

        for (int i = 0; i < size; i++) {
            System.out.print(scoreBufor.get(i) + " ");
        }
        System.out.println();
    }

}

