
import java.util.*;


public class A_Dungeon{

	static Scanner sc = new Scanner(System.in);



	public static void main(String... args){
		int t = sc.nextInt();


		while(t-- > 0){
			long a = sc.nextLong(), b = sc.nextLong(), c = sc.nextLong();

			if((a + b + c) % 9 != 0)
				System.out.println("NO");
			else {
				System.out.println("YES");
			}




		}




	}




}