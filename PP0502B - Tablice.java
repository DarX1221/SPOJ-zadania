    import java.util.*;
    import java.lang.*;
     
    class Main
    {
        public static void main (String[] args) throws java.lang.Exception
        {
     
     
     
            Scanner scan = new Scanner(System.in);
            int k = scan.nextInt();
     
            for(int i = 0; i < k; i++) {
                int sizeIN = scan.nextInt();
                int IN[] = new int[sizeIN];
                for (int i2 = 0 ; i2 < sizeIN; i2++) {
                    IN[i2] = scan.nextInt();
                }
                for(int i3 = (sizeIN-1); i3 >= 0; i3--){
                    System.out.println(IN[i3]);
                }
            }
     
     
        }
    } 
