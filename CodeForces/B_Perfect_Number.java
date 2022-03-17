import java.util.*;


public class B_Perfect_Number{

	static Scanner sc = new Scanner(System.in);

	static int calc(int n){
		int sum = 0, dg;

		while(n != 0){
			dg = n % 10;
			sum += dg;
			n /= 10;
		}

		return sum;

	}

	public static void main(String[] args){

		int k = sc.nextInt();

		for(int i = 0; i <= 99999999; i++){
			int isPerfect = calc(i);

			if(isPerfect == 10)
				k--;

			if(k == 0){
				System.out.println(i);
				break;
			}

		}

	}





}