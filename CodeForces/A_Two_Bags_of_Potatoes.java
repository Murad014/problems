
import java.util.*;

public class A_Two_Bags_of_Potatoes{

	public static Scanner sc = new Scanner(System.in);

	public static void main(String... args){
		long y = sc.nextInt(), k = sc.nextInt(), n = sc.nextInt();
		List<Long> list = new ArrayList<>();


		long calc = k - (y % k);
		long z = calc;



		while(z + y <= n){
			list.add(z);
			//System.out.println(list);
			z += k;
		}
		
		

		for(int i = 0; i < list.size(); i++){
			if(i == list.size() - 1){
				System.out.print(list.get(i));
				break;
			}
			System.out.print(list.get(i)+ " ");
		}
		//System.out.println(list);
		if(list.size() == 0)
			System.out.println("-1");

		//System.out.println(z);
		//System.out.println(calc);




	}


}