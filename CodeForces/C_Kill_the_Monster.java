
import java.util.*;


public class C_Kill_the_Monster{

	static Scanner sc = new Scanner(System.in);

	public static void main(String... args){
		int t = sc.nextInt();
		long hC, dC, hM, dM;
		long k, w, a;

		MAIN_LOOP: while(t-- > 0){

			hC = sc.nextLong();		dC = sc.nextLong();
			hM = sc.nextLong();		dM = sc.nextLong();

			k = sc.nextLong();		w = sc.nextLong();		a = sc.nextLong();

			long j = k;
			
			for(long i = 0; i <= k; i++){

				long wep = i, arm = j - i; // 0 - 4
				wep *= w;
				arm *= a;
				long toHM = (long)Math.ceil(( (double)hM / ( (double)dC + wep ) ));
				long toDC = (long)Math.ceil(( ( (double)hC + arm ) / (double)dM ));

				if(toDC >= toHM){
					System.out.println("YES"); 
					continue MAIN_LOOP;
				}

			}

			System.out.println("NO");
			

			

		}

	}



}