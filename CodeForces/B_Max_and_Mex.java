

import java.util.*;

public class B_Max_and_Mex{


	static Scanner sc = new Scanner(System.in);

	public static void main(String... args){
		int t = sc.nextInt(), n, k, a;


		while(t-- > 0){
			n = sc.nextInt();
			k = sc.nextInt();

			List<Integer> list = new ArrayList<>();
			HashMap<Integer, Integer> hash = new HashMap<>();
			int max = 0;

			for(int i = 0; i < n; i++){
				a = sc.nextInt();
				hash.put(a, 1);
				max = Math.max(max, a);

				list.add(a);
			}


			// Solving

			if(k == 0){
				System.out.println(list.size());
				continue;
			}

			// Find mex(S)
			Collections.sort(list);
			int mexS = list.get(list.size()-1) + 1;
			
			if(list.get(0) != 0)
				mexS = 0;

			else {

				for(int i = 0; i < list.size()-1; i++){
					if(list.get(i) + 1 != list.get(i+1)){
						mexS = list.get(i) + 1;
						break;
					}
				}

			}
			// END - Find mex(S)

			//System.out.println(mexS + ", " + max);
			if(mexS < max){
				int ans = list.size();
				double calc = Math.ceil((mexS + max) / 2d);
				//System.out.println(calc);
				if(Collections.binarySearch(list, (int)calc) < 0)
					ans++;

				System.out.println(ans);

			}else{
				System.out.println(list.size() + k);
			}
			// END - Solving



		}

	}




}