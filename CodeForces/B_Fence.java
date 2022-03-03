import java.util.*; 


public class B_Fence{

	public static Scanner sc = new Scanner(System.in);


	public static void Solve(List<Integer> list, int k){
		List<Integer> mem = new ArrayList<>();
		List<Integer> res = new ArrayList<>();
		int[] map = new int[list.size() + 1];



		mem.add(list.get(0));

		for(int i = 1; i < list.size(); i++){
			mem.add(mem.get(i-1) + list.get(i));
		}

		//System.out.println(mem);


		int min = Integer.MAX_VALUE;
		int ans = 0;
		for(int i = 0; i <= list.size()-k; i++){
			//System.out.println("I: " + i);
			int calc = mem.get(i+k-1) - mem.get(i) + list.get(i);
			
			if(calc <= min){
				//System.out.println("OK");
				min = calc;
				ans = i;
			}

		}


		System.out.println(ans+1);
	}


	
	public static void main(String... args){

		int n = sc.nextInt(), k = sc.nextInt();
		List<Integer> list = new ArrayList<>();

		while(n-- > 0){
			list.add(sc.nextInt());
		}

		Solve(list, k);




	}



}