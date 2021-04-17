import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

// Erotosfen Xelbirinden istifade edilib

public class Solution {
    private static List<Integer> primes = new ArrayList<>();
    private static int[] arr = new int[1000000];
    public static void erotosfen() {
        long prod = 1;
        for(int a = 2; a < 100000; a++){

            if(arr[a] != -1){
                prod *= a;
                if(prod > Math.pow(10, 18))
                    break;
                primes.add(a);
                for(int a2 = a + a; a2 <= 100000; a2 += a){
                    arr[a2] = -1;
                }
            }


        }
    }
    
    static int primeCount(long n) {
        if(n == 1)
            return 0;
            
        if(n == 2)
            return 1;
            
        int count = 0;
        long prod = 1;
        for(Integer numb: primes){
            prod *= numb;
            if(prod <= n)
                count++;
        }
        count--;
        return count;
        

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        erotosfen();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(scanner.nextLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            long n = Long.parseLong(scanner.nextLine().trim());

            int result = primeCount(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}
