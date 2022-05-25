import java.util.*;


class Project_Euler_31_Coin_sums{


    static Scanner sc = new Scanner(System.in);
    //static int ans = 1;


    static public long[][] Solve(int N){

        int[] pounds = {0, 1, 2, 5, 10, 20, 50, 100, 200};
        long[][] mem = new long[9][N+1];
        
        
        for(int i = 0; i < 9; i++)
            mem[i][0] = 1;


        for(int i = 1; i <= N; i++)
            mem[0][i] = 0;

        

        for(int row = 1; row < 9; row++){

            for(int col = 1; col <= N; col++){

                int sub = col - pounds[row];
                //System.out.println(col + " SUB: " + sub);

                if(sub == 0)
                    mem[row][col] = (long)(mem[row-1][col] + 1) % (long)(Math.pow(10, 9) + 7);

                else if(sub > 0){
                    mem[row][col] = (long)(mem[row][sub] + mem[row-1][col]) % (long)(Math.pow(10, 9) + 7);
                }

                else{
                    mem[row][col] = (long)mem[row-1][col] % (long)(Math.pow(10, 9) + 7);
                }

            }
            //System.out.println("-------------------------");

        }

/*
        // ============ READ =============
        for(int row = 0; row < 9; row++){

            for(int col = 0; col <= N; col++){
                System.out.print(mem[row][col] + "\t");
            }
            System.out.println();

        }
        // ============= END - READ ============
*/

        return mem;

    }


    public static void main(String... args){

        int T = sc.nextInt();
        long[][] mem = Solve(10000+1);

        while(T-- > 0){
            
            long N = sc.nextInt();

            N = (int)(N % Math.pow(10,9) + 7);
            
            System.out.println(mem[8][(int)N]);
            

        }
    }

}