    public static List<Integer> longestCommonSubsequence(List<Integer> a, List<Integer> b) {
        List<Integer> res = new ArrayList<>();
        int[][] mem = new int[a.size()+1][b.size()+1];
        int[][] mem2 = new int[a.size()+1][b.size()+1];
        int temp = 0;

        a.add(0, -1);
        b.add(0, -2);

        for(int i = 1; i < a.size(); i++){
            for(int j = 1; j < b.size(); j++){
                if(a.get(i).equals(b.get(j))) {
                    mem[i][j]  = 1 + mem[i - 1][j - 1];
                    mem2[i][j] = -2;
                }
                else{
                    int x = mem[i-1][j], y = mem[i][j-1];
                    if(x > y)
                        mem2[i][j] = 1;
                    else
                        mem2[i][j] = -1;


                    mem[i][j] = Math.max(mem[i-1][j], mem[i][j-1]);
                }
            }
        }

        int i = mem.length - 1, j = mem[0].length - 1;

        while(i > 0 && j > 0){
            if(mem2[i][j] == -2){
                res.add(a.get(i));
                i--;
                j--;
            }else if(mem2[i][j] == -1){
                j--;
            }else if(mem2[i][j] == 1){
                i--;
            }

        }



//        for(int ii = 0; ii < mem.length; ii++){
//            for(int jj = 0; jj < mem[0].length; jj++){
//                System.out.print(mem2[ii][jj] + " ");
//            }
//            System.out.println();
//        }

//        System.out.println("--------------");
//        for(int ii = 0; ii < mem.length; ii++){
//            for(int jj = 0; jj < mem[0].length; jj++){
//                System.out.print(mem[ii][jj] + " ");
//            }
//            System.out.println();
//        }

//
//        System.out.println(a);
//        System.out.println(b);
        Collections.reverse(res);
        return res;
    }
