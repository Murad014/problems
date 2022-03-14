import java.util.*;

public class IlyaAndQueries{

	static public Scanner sc = new Scanner(System.in);


	public static int[] calcMem(String s){
		int[] arr = new int[s.length() + 1];

		for(int i = 1; i < arr.length-1; i++){
			if(s.charAt(i-1) == s.charAt(i))
				arr[i] = arr[i-1] + 1;

			else  
				arr[i] = arr[i-1];
		}

		return arr;

	}



	public static void main(String... args){
		String s = sc.next();
		int n = sc.nextInt();

		int[] arr = calcMem(s);

		while(n-- > 0){
			int Li = sc.nextInt(), Ri = sc.nextInt();
			
			int ans = arr[(Ri - 1)] - arr[(Li - 1)];

			System.out.println(ans);




		}




	}




}