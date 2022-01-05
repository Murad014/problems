import java.util.*;

public class HR {

    static Scanner sc = new Scanner(System.in);



    static private String Solve(String mS, String eS){ // daBcd, ABC

        int[][] mem = new int[eS.length() + 1][mS.length() + 1];

        /*          FOR INITIALIZE          */
        for(int i = 0; i < eS.length(); i++){
            if(i == 0)
                mem[0][0] = 1;
            else
                mem[i][0] = 0;
        }

        for(int i = 1; i < mS.length(); i++){
            if(Character.isLowerCase(mS.charAt(i-1)) && mem[0][i-1] == 1)
                mem[0][i] = 1;
        }
        /*         END FOR INITIALIZE          */




        /*                 SOLVING                */
        for(int i = 1; i <= mS.length(); i++){ // daBcd  mS
            for(int j = 1; j <= eS.length(); j++){ // ABC eS
//                System.out.println(eS.charAt(j-1) + " " + mS.charAt(i-1));

                boolean lowerCase = Character.isLowerCase(mS.charAt(i - 1));
                if(mS.charAt(i-1) == eS.charAt(j-1) || eS.charAt(j-1) == Character.toUpperCase(mS.charAt(i-1))) {
//                    System.out.print(" " + "----");

                    if(mem[j-1][i-1] == 1)
                        mem[j][i] = 1;

                    else if(lowerCase)
                        mem[j][i] = mem[j][i-1];
                }
                else{
                    if(lowerCase)
                        mem[j][i] = mem[j][i - 1];

                    else
                        mem[j][i] = 0;
                }

            }
            
        }
        /*                END SOLVING             */

        /*              RESULT                      */
        if(mem[mem.length-1][mem[0].length-1] == 0)
            return "NO";

        return "YES";
        /*             END RESULT                  */

    }


    static public void main(String... args){
        int n = sc.nextInt();
        String s1, s2;

        while(n > 0){
            s1 = sc.next();
            s2 = sc.next();

            System.out.println(Solve(s1, s2));
            //System.out.println("--------------------");

            n--;
        }


    }


}
