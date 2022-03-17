
import java.util.*;


public class A_Sum_of_Odd_Integers{

	static Scanner sc = new Scanner(System.in);

	public static void main(String... args){

		long t = sc.nextInt();

		while(t-- > 0){
			long n = sc.nextInt(), k = sc.nextInt(); 

			if(n % 2 == 0 && k % 2 == 0 && k <= n)
				System.out.println("YES");

			else if (n % 2 != 0 && k % 2 != 0 && k <= n)
				System.out.println("YES");


			else 
				System.out.println("NO");


		}



	}




}