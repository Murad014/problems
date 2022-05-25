import java.util.*;


public class KnapSackTabulation{
	
	static Scanner sc = new Scanner(System.in);

	static public void Solve(int n, int k, List<Integer> list){

		int maxIndex = Math.max(k, list.size());

		int[][] arr = new int[maxIndex+1][maxIndex+1];
		int max = 0;


		for(int col = 1; col <= k; col++){
			for(int row = 1; row <= list.size(); row++){

				int minus = col - list.get(row-1);
				//System.out.println( col + " - " + minus);

				if(minus == 0){
					max = Math.max(max, col);
					arr[row][col] = col;
				}

				else if(minus > 0){

					int get = arr[list.size()][minus];

					if(get == minus){
						arr[row][col] = col;
					}

					else if(get == 0){
						arr[row][col] = arr[row-1][col];
					}
					else{
						arr[row][col] = arr[row-1][col];
					}

				}
				else{
					arr[row][col] = arr[row-1][col];
				}

			
			max = Math.max(max, arr[row][col]);


			}

		}

		//System.out.println("ANS: " + max);
		System.out.println(max);


		
		
		// Read arr
		/*
		for(int i = 0; i <= k; i++){
			for(int j = 0; j <= k; j++){
				System.out.print(arr[i][j] + "\t");
			}

			System.out.println();
		}*/
		// END - Read arr

	}


	static public void main(String... args){

		int t = sc.nextInt();

		while(t-- > 0){

			int n = sc.nextInt(), k = sc.nextInt();
			List<Integer> arr = new ArrayList<>();

			for(int i = 0; i < n; i++){
				int m = sc.nextInt();

				arr.add(m);

			}

			Collections.sort(arr);
			Solve(n, k, arr);


		}






	}

}