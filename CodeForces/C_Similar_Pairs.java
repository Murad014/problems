
import java.util.*;


public class C_Similar_Pairs{


	static Scanner sc = new Scanner(System.in);

	public static String solve(int n, List<Integer> list){
		int even = 0, odd = 0;

		for(Integer i: list){
			
			if((int) i % 2 == 0)
				even++;
			else
				odd++;
		}


		Collections.sort(list);
		int df = 0;
		for(int i = 0; i < list.size()-1; i++){

			int a = list.get(i), b = list.get(i+1);
			if(Math.abs(a - b) == 1)
				df++;
		}

		if(even % 2 == 0 && odd % 2 == 0)
			return "YES";

		if(even % 2 != 0 && odd % 2 != 0){
			if(df > 0)
				return "YES";
		}

		return "NO";



	}

	public static void main(String... args){

		int t = sc.nextInt();


		while(t-- > 0){
			int n = sc.nextInt();

			List<Integer> list = new ArrayList<>();

			for(int i = 0; i < n; i++){
				int a = sc.nextInt();
				list.add(a);
			}

			Collections.sort(list);

			// Solving

			String ans = solve(n, list);
			System.out.println(ans);
			// END - Solving




		}




	}





}