import java.util.*;
public class Solution {

    static Scanner sc = new Scanner(System.in);
    static List<Integer> results = new ArrayList<>();

    private int findAllPath(int[][] grid, int m, int n, int i, int j, int sum){
       //System.out.println(m + " / " + n);
        System.out.println(grid[i][j] + " " + i + " " + j + " = " + sum);

        if(i == m-1 && j == n-1) {
            sum += grid[i][j];
            System.out.println("--------------------------" + sum);
            results.add(sum);
            return 0;
        }

        if(i < m-1)
            findAllPath(grid, m, n, i+1, j, sum+grid[i][j]);

        if(j < n-1)
            findAllPath(grid, m, n, i, j+1, sum+grid[i][j]);


        return 0;
    }

    public int minPathSum(int[][] grid){
        results.clear();
        int m = grid.length;
        int n = grid[0].length;
        int i = 0, j = 0, sum = 0;

        findAllPath(grid, m, n, i, j, sum);

        Collections.sort(results);
        System.out.println(results);

        return results.get(0);
    }


    public static void main(String[] args){
        int m = 2, n = 3;

        int[][] grid = new int[m][n];

        grid[0][0] = 1;
        grid[0][1] = 2;
        grid[0][2] = 3;

        grid[1][0] = 4;
        grid[1][1] = 5;
        grid[1][2] = 6;


        Solution sol = new Solution();
        System.out.println(sol.minPathSum(grid));
        //sol.minPathSum(grid);
    }

}
