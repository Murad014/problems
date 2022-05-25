
import java.util.*;


public class B_Caise_and_Pylons{

	static Scanner sc = new Scanner(System.in);

	public static void main(String... args){
		long n = sc.nextLong();
		List<Long> list = new ArrayList<>();
		list.add(0L);
		List<Long> neg = new ArrayList<>();


		while(n-- > 0){
			long m = sc.nextLong();
			list.add(m);
		}

		long enrg = 0L, pay = 0L ,ans = 0L;

		for(int i = 0; i < list.size()-1; i++){
			long calc = list.get(i) - list.get(i+1);

			pay += calc;
			if(pay < 0)
			{
				ans += Math.abs(pay);
				pay = 0;
			}


		}

		System.out.println(ans);


	}



}