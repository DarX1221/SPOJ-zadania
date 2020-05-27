    import java.util.*;
    import java.lang.*;
     
    class Main
    {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner scanner = new Scanner(System.in);
            int k = scanner.nextInt();
            int w[] = new int[k];
            int wOstCyf[] = new int[k];
            int p[] = new int[k];
            int ostLicz[] = new int[k];
            for(int n = 0; n < k; n++) {
                w[n] = scanner.nextInt();
                p[n] = scanner.nextInt();
                String numberString = Integer.toString(w[n]);
                String lastDigitString;
                int lastDigit = Integer.parseInt(lastDigitString = numberString.substring(numberString.length() - 1));
                wOstCyf[n] = lastDigit;
            }
            int reszta;
            for(int n = 0; n < k; n++) {
                if(p[n] == 0) ostLicz[n] = 1;
                else{switch (wOstCyf[n]) {
                        case 1:ostLicz[n] = 1;break;
                        case 2: {
                            reszta = p[n] % 4;
                            switch (reszta) {
                                case 1:ostLicz[n] = 2;break;
                                case 2:ostLicz[n] = 4;break;
                                case 3:ostLicz[n] = 8;break;
                                case 0:ostLicz[n] = 6;break; }
                            break; }
                        case 3: {
                            reszta = p[n] % 4;
                            switch (reszta) {
                                case 1:ostLicz[n] = 3;break;
                                case 2:ostLicz[n] = 9;break;
                                case 3: ostLicz[n] = 7;break;
                                case 0: ostLicz[n] = 1;break;
                            }break;}
                        case 4: {
                            reszta = p[n] % 2;
                            switch (reszta) {
                                case 1: ostLicz[n] = 4;break;
                                case 0: ostLicz[n] = 6;break;
                            }break;}
                        case 5: ostLicz[n] = 5;break;
                        case 6: ostLicz[n] = 6;break;
                        case 7: {
                            reszta = p[n] % 4;
                            switch (reszta) {
                                case 1: ostLicz[n] = 7;break;
                                case 2: ostLicz[n] = 9;break;
                                case 3: ostLicz[n] = 3;break;
                                case 0: ostLicz[n] = 1; break;
                            }break; }
                        case 8: {
                            reszta = p[n] % 4;
                            switch (reszta) {
                                case 1: ostLicz[n] = 8;break;
                                case 2: ostLicz[n] = 4;break;
                                case 3: ostLicz[n] = 2;break;
                                case 0: ostLicz[n] = 6;break; }break;}
                        case 9: {
                            reszta = p[n] % 2;
                            switch (reszta) {
                                case 1: ostLicz[n] = 9;break;
                                case 0: ostLicz[n] = 1;break;
                            }break; }}}System.out.println(ostLicz[n]);}}} 
