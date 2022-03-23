
import java.util.*;


public class B_Odd_Swap_Sort{

	static Scanner sc = new Scanner(System.in);

	public static void main(String... args){
		int t = sc.nextInt(), n, a;

		while(t-- > 0){
			n = sc.nextInt();
			
			List<Integer> even = new ArrayList<>();
			List<Integer> odd = new ArrayList<>();

			for(int i = 0; i < n; i++){
				a = sc.nextInt();
				if(a % 2 == 0)
					even.add(a);
				else 
					odd.add(a);	
			}

			String ans = "YES";

			for(int i = 0; i < even.size()-1; i++){
				if(even.get(i) > even.get(i+1)){
					ans = "NO";
					break;
				}
			}

			
			for(int i = 0; i < odd.size()-1; i++){
				if(odd.get(i) > odd.get(i+1)){
					ans = "NO";
					break;
				}

			}

			System.out.println(ans);


		}


	}




}