
import java.util.*;


public class C_Paint_the_Array{


	static Scanner sc = new Scanner(System.in);

	static long GCD(long a, long b){
		if(a == 0)
			return b;

		return GCD(b%a, a);
	}


	public static void main(String... args){
		int t = sc.nextInt(), n;
		long a;

		MAIN_LOOP: while(t-- > 0){
			n = sc.nextInt();
			
			List<Long> arr = new ArrayList<>();

			List<Long> even = new ArrayList<>();
			List<Long> odd = new ArrayList<>();

			for(int i = 0; i < n; i++){
				a = sc.nextLong();
				arr.add(a);

				if(i % 2 == 0)
					even.add(a);
				else  
					odd.add(a);
			}

			long gcd_1 = odd.get(0), gcd_2 = even.get(0);

			
			for(int i = 1; i < odd.size(); i++){
				gcd_1 = GCD(gcd_1, odd.get(i));
			}

			for(int i = 1; i < even.size(); i++){
				gcd_2 = GCD(gcd_2, even.get(i));
			}



			// GCD 1			
			for(int i = 0; i < arr.size()-1; i++){
				if((arr.get(i) % gcd_1 == 0 && arr.get(i+1) % gcd_1 == 0) || (arr.get(i) % gcd_1 != 0 && arr.get(i+1) % gcd_1 != 0)){
					gcd_1 = -1;
					break;
				}
			}


			// GCD 2
			for(int i = 0; i < arr.size()-1; i++){
				if((arr.get(i) %  gcd_2 == 0 && arr.get(i+1) %  gcd_2 == 0) || (arr.get(i) % gcd_2 != 0 && arr.get(i+1) %  gcd_2 != 0)){
					gcd_2 = -1;
					break;
				}
			}

			if(gcd_1 == -1 && gcd_2 == -1){
				System.out.println("0");
			}else{
				long ans = Math.max(gcd_1, gcd_2);
				System.out.println(ans);
			}

		}



	}



}