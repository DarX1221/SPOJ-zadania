 
import java.util.*;
import java.lang.*;
 
public class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);
 
        int k = scanner.nextInt();
 
        for (int i = 0; i < k; i++) {
            int a, b;
            a = scanner.nextInt();
            b = scanner.nextInt();
 
            // for correctly working of program "b" must be bigger than "a"
            if (a > b) {
                int bufor = a;
                a = b;
                b = bufor;
            }
 
            if (a == 1 && b > 0){
                System.out.print(b);
            }
            else if (a <= 0 || b <= 0){
                throw new Exception();
            }
            else {
                Main main = new Main();
                main.initializationOFPrimeNumbers();
 
                int[] aTab = main.factorization(a);
                int[] bTab = main.factorization(b);
 
                int[] mergeTabs = main.mergeTabs(aTab, bTab);
                int sumTab = main.sumTab(mergeTabs);
 
                System.out.println(sumTab);
            }
 
        }
    }
 
 
 
    // tab of prime numbeers and Map which pointing position of primen umber
    // remember about inititialization of map void initializationMapOfPrimeNumbers();
    int[] primeNumbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};
    HashMap<Integer, Integer> mapOfPositionPN = new HashMap<>();
 
    void initializationOFPrimeNumbers() {
        for (int i = 0; i < primeNumbers.length; i++) {
            mapOfPositionPN.put(primeNumbers[i], i);
        }
    }
 
 
     int[] factorization (int x) {
        Main main = new Main();
         int divisor = 1;
         ArrayList<Integer> listOfDivisors = new ArrayList<>();
         int biggestDivider = 1;
 
         while (true) {
             divisor = main.smallestDivisior(x);
             if(divisor <= 1) {
                 break;
             }
             listOfDivisors.add(divisor);
             if(divisor > biggestDivider) {
                 biggestDivider = divisor;
             }
             x = x / divisor;
         }
 
         // now i create tab for dividers, i need to know size
         int size = mapOfPositionPN.get(biggestDivider) + 1;
         int[] tabOfDividers = new int[size];
         for (int div:listOfDivisors) {
             int position = mapOfPositionPN.get(div);
             tabOfDividers[position]++;
         }
 
         return tabOfDividers;
    }
 
 
    int smallestDivisior(int x) {
        if(x == 1){
            return 1;
        }
        int divisor = 1;
        for(int i = 0; i <primeNumbers.length; i++) {
            if (x % primeNumbers[i] == 0) {
                divisor = primeNumbers[i];
                break;
            }
        }
        return divisor;
    }
 
 
    // take 2 tabs and and write bigger number on their positions
    //[1, 2, 3]         merge
    //[3, 2, 1]     [3, 2, 3]
    int[] mergeTabs (int[] tab1, int[] tab2) {
 
        int[][] tabs = {tab1, tab2};
 
        int lengthSmallerTab = 1;
        int lengthBiggerTab = 1;
 
        int wichTabIsBigger = 0;
        if (tab1.length > tab2.length){
            wichTabIsBigger = 0;
            lengthSmallerTab = tab2.length;
            lengthBiggerTab = tab1.length;
        }
        else {
            wichTabIsBigger = 1;
            lengthSmallerTab = tab1.length;
        lengthBiggerTab = tab2.length;}
 
        int[] mergeTab = new int[lengthBiggerTab];
 
        // take bigger value from tabs
        for (int i = 0; i < lengthSmallerTab; i++) {
            if (tab1[i] > tab2[i]) {
                mergeTab[i] = tab1[i];
            }
            else {mergeTab[i] = tab2[i];}
        }
 
        // and write values from longer tab
        for (int i = lengthSmallerTab; i < lengthBiggerTab; i++) {
            mergeTab[i] = tabs[wichTabIsBigger][i];
        }
        return mergeTab;
    }
 
 
    private int sumTab(int[] tab) {
 
        int length = tab.length;
        int pow = 0;
 
        for (int i = 0; i < length; i++) {
            if (tab[i] == 0) {
                tab[i] = 1;
            }
            else {
                pow = primeNumbers[i];
                for(int i3 = 0; i3 < tab[i]-1; i3++){
                    pow = pow * primeNumbers[i];
                }
                tab[i] = pow;
            }
 
        }
 
        int sum = 1;
        for (int i = 0; i < length; i++) {
            sum = sum * tab[i];
        }
        return sum;
    }
 
}
