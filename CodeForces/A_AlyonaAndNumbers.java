import java.util.*;


public class A_AlyonaAndNumbers{

	static Scanner sc = new Scanner(System.in);


	public static void main(String... args){
		
		long n = sc.nextInt(), m = sc.nextInt();
		long rn = n / 5, rm = m / 5; // 1 2
		long rrn = n % 5, rrm = m % 5; 

		long mn = rm * rn * 5;
		long mmnn = rrn * rm + rrm * rn;

		/* CHECK REMAIN SUMS */	
		long rnSt;
		if(rn == 0)
			rnSt = 1;
		else 
			rnSt = rn * 5;

		long rmSt;
		if(rm == 0)
			rmSt = 1;
		else 
			rmSt = rm * 5;

		
		long ans = mn+mmnn;

		if(rn != 0)
			rnSt++;

		if(rm != 0)
			rmSt++;

		for(long i = rnSt; i <= n; i++){
			for(long j = rmSt; j <= m; j++){
				if((i+j) % 5 == 0)
					ans++;
			}

		}


		/* END - CHECK REMAIN SUMS */	

		System.out.println(ans);



	}




}