import java.util.*;

public class A_Theatre_Square{

	static Scanner sc = new Scanner(System.in);


	public static void main(String... args){

		long n = sc.nextInt(), m = sc.nextInt(), a = sc.nextInt();

		long nn = 0, mm = 0, aa = 0;


		if(n <= a){
			nn = 1;
		}
		else{
			long rem = n % a;

			if(rem != 0)
				nn = (n / a) + 1;
			else
				nn = n / a;
		}
		
		if(m <= a){
			mm = 1;
		}
		else{

			long rem = m % a;

			if(rem != 0)
				mm = (m / a) + 1;
			else 
				mm = m / a;
		}


		System.out.println(nn * mm);


		//System.out.println(n + " " + m + " = " + a);


	}


}