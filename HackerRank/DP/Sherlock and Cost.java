import java.text.CollationElementIterator;
import java.util.*;

public class HR {

    static Scanner sc = new Scanner(System.in);

    static public void Solve(int n, int[] arr){
        int[][] mem = new int[101][n+1];
        int max = 0;

        for(int x = n-2; x >= 0; x--){
            for(int y = 1; y <= arr[x]; y++){
                int mn = 1, mx = arr[x+1], tmM;
                tmM = Math.max(Math.abs(y - mn) + mem[0][x+1], Math.abs(y - mx) + mem[arr[x+1]-1][x+1]);

                if(tmM >= max)
                    max = tmM;

                mem[y-1][x] = tmM;
            }

        }
        System.out.println(max);


    }

    static public void main(String... args){
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt(), a;
            int[] arr = new int[n];

            for(int i = 0; i < n; i++){
                a = sc.nextInt();
                arr[i] = a;
            }

            Solve(n, arr);
        }

    }




}
