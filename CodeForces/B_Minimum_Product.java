
import java.util.*;


public class B_Minimum_Product{

	static Scanner sc = new Scanner(System.in);
	static long m1, m2;



	static long Solve(long aa, long bb, long x, long y, long n){
		if(aa - n < x){
			bb -= x - (aa - n);
			if(bb < y)
				bb = y;

			aa = x;
		}else{
			aa -= n;
		}

		long prd = aa * bb;

		return prd;
	}

	public static void main(String... args){
		long t = sc.nextInt();
		long a, b, x, y, n;

		while(t-- > 0){
			a = sc.nextInt();
			b = sc.nextInt();
			x = sc.nextInt();
			y = sc.nextInt();
			n = sc.nextInt();

			long aa = a, bb = b, prd, prd2;

			prd = Solve(aa, bb, x, y, n);
			prd2 = Solve(bb, aa, y, x, n);

			System.out.println(Math.min(prd, prd2));




			
		}

	}



}