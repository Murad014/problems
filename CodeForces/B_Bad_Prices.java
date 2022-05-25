
import java.util.*;

public class B_Bad_Prices{

	static Scanner sc = new Scanner(System.in);

	static int solve(int n, List<Integer> list){
		int down = list.get(0);
		int up = Integer.MAX_VALUE;
		int cnt = 1	, count = 0;
		for(int i = 0; i < list.size()-1; i++){
			
			if(list.get(i) > list.get(i+1)){
				count += cnt;

				cnt = 0;
			}
			
			cnt++;

		}


		return count;
	}

	public static void main(String... args){
		int t = sc.nextInt();

		while(t-- > 0){
			int n = sc.nextInt();
			List<Integer> list = new ArrayList<>();

			while(n-- > 0)
				list.add(sc.nextInt());

			

			int ans = solve(n, list);
 
			System.out.println(ans);



		}

	}



}