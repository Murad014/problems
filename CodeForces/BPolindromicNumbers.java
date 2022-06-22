import java.util.*;


public class BPolindromicNumbers{

	static Scanner sc = new Scanner(System.in);

	public static void solve(int n, String num){
		int goal = 1;
		StringBuilder ans = new StringBuilder();

		if(Character.getNumericValue(num.charAt(0)) != 9)
			goal = 9;

		
		int calc, rm = 0;
		for(int i = num.length()-1; i >= 0; i--){
			int aa = Character.getNumericValue(num.charAt(i));

			if(goal == 9)
				calc = 9 - aa;

			else{

				if(rm == 0){

					if(aa == 0)
						calc = 1;

					else if(aa == 1)
						calc = 0;
					
					else {
						calc = 11 - aa;
						rm = 1;
					}

				}

				else {

					if(aa == 0){
						calc = 0;
						rm = 0;
					}else if(aa == 1){
						calc = 9;
						rm = 1;
					}else{
						calc = 10 - aa;
						rm = 1;
					}



				}
			}




			ans.append(String.valueOf(calc));

		}




		/* RESULT */
		ans.reverse();
		System.out.println(ans);

	}

	public static void main(String... args){
		
		int t = sc.nextInt();
		int n;
		String num;


		while(t-- > 0){
			n = sc.nextInt();
			num = sc.next();
			solve(n, num);

		}


	}

}