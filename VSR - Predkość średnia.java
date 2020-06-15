// UWAGA!! Dwie wersja zadania, zwracają poprawne odpowiedzi lecz nie mieszczą się wczasie


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.*;
 
public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine());
 
        while(tests-- > 0)
        {
            int a[] = new int[2];
            String line = br.readLine();
            String[] strs = line.trim().split("\\s+");
                int v1 = Integer.parseInt(strs[0]);
                int v2 = Integer.parseInt(strs[1]);
            System.out.println((2 * v1 * v2)/(v1 + v2));
        }
    }
}



    import java.util.*;
    import java.lang.*;
     
    public class Main {
        public static void main(String[] args) throws java.lang.Exception {
            Scanner scan = new Scanner(System.in);
            int t = scan.nextInt();
     
            for (int i = 0; i < t; i++) {
                int v1 = scan.nextInt();
                int v2 = scan.nextInt();
                int Vavrg = ((2 * v1 * v2) / (v2 + v1));
                System.out.println(Vavrg);
            }
        }
    } 
