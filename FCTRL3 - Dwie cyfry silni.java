import java.util.*;
import java.lang.*;
 
class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
 
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int n[] = new int[k];
        int d[] = new int[k];
        int j[] = new int[k];
 
        for(int i = 0; i<k; i++){
            n[i] = scan.nextInt();
            if(n[i] >= 10){
                d[i] = 0;
                j[i] = 0;
            }
            else if(n[i] >= 5){
                j[i] = 0;
                switch (n[i]) {
                    case 9: d[i] = 8;   break;
                    case 8: d[i] = 2;   break;
                    case 7: d[i] = 4;   break;
                    case 6: d[i] = 2;   break;
                    case 5: d[i] = 2;   break; }
            }
            else{
                d[i] = 0;
                switch(n[i]){
                    case 0: j[i] = 1; break;
                    case 1: j[i] = 1; break;
                    case 2: j[i] = 2; break;
                    case 3: j[i] = 6; break;
                    case 4: j[i] = 4;   d[i] = 2; break;
                }
            }
        }
        for(int i = 0; i<k; i++){
            System.out.println(d[i]);
            System.out.println(j[i]);
        }
    }
} 
