
import java.util.*;


public class B_Minor_Reduction{

	static Scanner sc = new Scanner(System.in);


	public static void main(String... args){
		int t = sc.nextInt();
		String number;


		MAIN_LOOP: while(t-- > 0){
			number = sc.next();
			
			if(number.length() == 1){
				System.out.println(number);
				continue;
			}


			// Solving
			//boolean state = false;
			int[] mem = new int[number.length()];

			for(int i = 0; i < number.length(); i++){
				mem[i] = Integer.parseInt(String.valueOf(number.charAt(i)));
				//System.out.print(mem[i]);
			}

			for(int i = mem.length-2; i >= 0; i--){
				int calc = mem[i] + mem[i+1];

				if(calc > 9){
					mem[i] = calc / 10;
					mem[i+1] = calc % 10;
					
					for(int r = 0; r < mem.length; r++){
						System.out.print(mem[r]);
					}
					System.out.println();
					continue MAIN_LOOP;
				}
			}

			int calc = mem[0] + mem[1];

			mem[0] = calc / 10;
			mem[1] = calc % 10;

			int r = 0;

			if(mem[0] == 0)
				r = 1;

			for(; r < mem.length; r++){
				System.out.print(mem[r]);
			}
			System.out.println();




			

			// END - Solving


		}


	}


}