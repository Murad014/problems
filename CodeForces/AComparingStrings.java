import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Lesson {
    static Scanner scan = new Scanner(System.in);

    public static String solve(String dw01, String dw02){

        if(dw01.length() != dw02.length())
            return "NO";

        int indFirst = -1, indSecond = -1, cnt = 0;
        for(int i = 0; i < dw01.length(); i++){
            if(dw01.charAt(i) != dw02.charAt(i)){
                cnt++;
                if(indFirst == -1)
                    indFirst = i;
                else
                    indSecond = i;
            }

            if(cnt > 2)
                return "NO";

        }

        if(indFirst == -1 || indSecond == -1)
            return "NO";

        if(dw01.charAt(indSecond) == dw02.charAt(indFirst) && dw01.charAt(indFirst) == dw02.charAt(indSecond))
            return "YES";



        return "NO";
    }


    public static void main(String... args){
        String dw01 = scan.next();
        String dw02 = scan.next();


        String ans = solve(dw01, dw02);

        System.out.println(ans);

    }


}
