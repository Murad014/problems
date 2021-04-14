    private static int solve(int n){
        if(n == 0 || n == 1)
            return 0;

        int down = n - 2;
        int up   = n;
        int fact = 1;
        for(int i = down + 1; i <= n; i++){
            fact *= i;
        }
        int res = fact / 2;
        return res;
    }
