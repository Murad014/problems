import java.util.*;
public class Solution {

    static Scanner sc = new Scanner(System.in);

    public static void main(String... args){
        int T = sc.nextInt();

        int N = 10000;
        int[] ans = new int[10021];

        for(int i = 2; i <= N; i++){
            int[] mem = new int[100001];

            mem[0] = 0;
            mem[1] = 1;

            int num = 1, cnt = 1;
            boolean state = false;

            while(true) {
                while (num < i)
                    num *= 10;

                if(mem[num] > 0) {
                    state = true;
                    break;
                }

                mem[num]++;

                num = num % i;

                if(num == 0) 
                    break;
                
                cnt++;
            }

            if(state)
                ans[i] = cnt - 1;
        }


        while(T > 0){
            int n = sc.nextInt();

            int max = 0, res = 0;
            for(int r = n-1; r >= 0; r--){
                if(ans[r] >= max){
                    max = ans[r];
                    res = r;

                }
            }
            System.out.println(res);
            T--;
        }

    }



}
