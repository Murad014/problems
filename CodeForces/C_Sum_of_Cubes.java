
import java.util.*;


public class C_Sum_of_Cubes{

	static Scanner sc = new Scanner(System.in);


	public static void main(String... args){

		HashMap<Long, Long> map = new HashMap<Long, Long>();
		List<Long> list = new ArrayList<>();

		long limit = 10000;
		
		for(long i = 1; i <= limit; i++){
			list.add((long)Math.pow(i, 3));
		}

		


		int t = sc.nextInt();

		while(t-- > 0){
			long n = sc.nextLong();
			boolean flag = false;

			for(long i = 1; i * i * i <= n; i++ ){
				long calc = n - i*i*i;
				//System.out.println(i + " " + calc);

				if(Collections.binarySearch(list, (long)calc) > -1){
					flag = true;
					break;
				}

			}

			if(flag)
				System.out.println("YES");

			else 
				System.out.println("NO");


			//long calc = (long)Math.floor(Math.pow(n, 1/3f));
			

		}



	}



}

