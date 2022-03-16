
import java.util.*;


public class B_Sereja_and_Suffixes{

	public static Scanner sc = new Scanner(System.in);


	public static int[] calcArr(List<Integer> list){
		int[] mem = new int[100000+2];
		int[] dp = new int[100000+2];

		
		int x = list.size();

		for(int i = list.size()-1; i >= 0; i--){

			if(mem[list.get(i)] == 0)
				dp[x] = dp[x+1] + 1;
			else 
				dp[x] = dp[x+1];

			mem[list.get(i)]++;

			x--;


		}

		return dp;

	}


	public static void main(String... args){
		int n = sc.nextInt(), m = sc.nextInt();
		int org = n;

		List<Integer> list = new ArrayList<>();

		while(n-- > 0){
			int a = sc.nextInt();
			list.add(a);
		}

		int[] dp = calcArr(list);

		while(m-- > 0){
			int a = sc.nextInt();

			System.out.println(dp[a]);

		}




		/*
		for(int r = 0; r <= org; r++){
			System.out.print(dp[r] + ", ");

		}
		*/






	}




}
