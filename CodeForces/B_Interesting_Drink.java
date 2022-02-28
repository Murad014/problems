import java.util.*;

public class B_Interesting_Drink{

	static Scanner sc = new Scanner(System.in);
	static List<Integer> list = new ArrayList<>();


	static int[] mem = new int[100009];

	
	static public void Solve(){

		for(int i = 0; i < list.size(); i++){
			mem[list.get(i)] += 1;
		}

		for(int i = 1; i < 100009; i++){
			mem[i] += mem[i-1];
		}
	
	}


	public static void main(String... args){
		int n = sc.nextInt();



		while(n-- > 0){
			int a = sc.nextInt();
			list.add(a);

		}
		
		int q = sc.nextInt();


		Solve();

		while(q-- > 0){
			int m = sc.nextInt();

			if(m >= 100000)
				System.out.println(mem[100000]);

			else   
				System.out.println(mem[m]);
		}


	}


}