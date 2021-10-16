import java.util.*;

public class HR {

    static Scanner sc = new Scanner(System.in);


    static public void Solve(int n, int[] arr){
        int poss[] = new int[5];

        int min = arr[0], minReq = 0, diff;
        int oneP = min - (min % 5), twoP = (min) + (5 - (min % 5));

        for(int i = 0; i < 5; i++) {
            int mm1 = 0;
            for (int m : arr) {

                diff = m - min;
                minReq = (diff / 5) + (diff % 5) / 2 + ((diff % 5) % 2);
                mm1 += minReq;
            }
            poss[i] = mm1;

            min--;
        }

        Arrays.sort(poss);

        System.out.println(poss[0]);

        return;
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
            Arrays.sort(arr);
            Solve(n, arr);
        }



    }




}
