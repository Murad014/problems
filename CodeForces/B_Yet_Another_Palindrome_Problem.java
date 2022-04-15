
import java.util.*;


public class B_Yet_Another_Palindrome_Problem{

	static Scanner sc = new Scanner(System.in);

	static void Solve(List<Integer> arr){
		boolean ans = false;

		for(int i = 0; i < arr.size(); i++){

			for(int j = i+2; j < arr.size(); j++){
				if((int)arr.get(i) == (int)arr.get(j))
					ans = true;
			}

		}

		if(ans)
			System.out.println("YES");
		else  
			System.out.println("NO");

	}

	public static void main(String... args){

		int t = sc.nextInt(), n, a;

		while(t-- > 0){
			n = sc.nextInt();
			List<Integer> arr = new ArrayList<>();

			for(int i = 0; i < n; i++){
				a = sc.nextInt();
				arr.add(a);
			}


			Solve(arr);

		}


	}

}


