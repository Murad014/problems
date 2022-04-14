
import java.util.*;


public class A_Shovels_and_Swords{

	static Scanner sc = new Scanner(System.in);

	static int Solve(int a, int b, int cnt){
		int ans = Math.min(a, b);
		ans = Math.min(ans, (a+b) / 3);


		return ans;
	}


	public static void main(String... args){

		int t = sc.nextInt();

		while(t-- > 0){
			int a = sc.nextInt(), b = sc.nextInt();

			int earn;

			earn = Solve(a, b, 0);

			System.out.println(earn); 	


		}

	}




}

