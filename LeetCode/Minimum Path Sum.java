// Dynamic Programming

import java.util.*;
public class Solution {

    static Scanner sc = new Scanner(System.in);
    static int min = Integer.MAX_VALUE;
    int[][] mem;
    static int m, n;


    private int findAllPath(int[][] grid){
        mem[0][0] = grid[0][0];

        for(int i = 1; i < grid[0].length; i++)
            mem[0][i] = mem[0][i-1] + grid[0][i];

        for(int i = 1; i < grid.length; i++)
            mem[i][0] = mem[i-1][0] + grid[i][0];

        for(int i = 1; i < mem.length; i++){
            for(int j = 1; j < mem[i].length; j++){
                mem[i][j] = grid[i][j] + Math.min(mem[i-1][j], mem[i][j-1]);

            }

        }

        return mem[mem.length-1][mem[0].length-1];
    }

    public int minPathSum(int[][] grid){
        min = Integer.MAX_VALUE;

        m = grid.length;
        n = grid[0].length;
        int i = 0, j = 0, sum = 0;

        mem = new int[m][n];

        int ans = findAllPath(grid);

//
//        for(int ii = 0; ii < m; ii++){
//            for(int jj = 0; jj < n; jj++){
//                System.out.print(mem[ii][jj] + " ");
//            }
//            System.out.println();
//        }
        return ans;
    }


    public static void main(String[] args){
        int m = 3, n = 3;

        int[][] grid = new int[m][n];

        grid[0][0] = 1;
        grid[0][1] = 3;
        grid[0][2] = 1;

        grid[1][0] = 1;
        grid[1][1] = 5;
        grid[1][2] = 1;

        grid[2][0] = 4;
        grid[2][1] = 2;
        grid[2][2] = 1;


        Solution sol = new Solution();
        System.out.println(sol.minPathSum(grid));
        //sol.minPathSum(grid);
    }

}
