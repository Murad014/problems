
import java.util.*;


public class CompilationErrors{

	public static Scanner sc = new Scanner(System.in);
	public static List<Integer> ans = new ArrayList<>();

	public static void find(List<Integer> list01, List<Integer> list02){

		for(int i = 0; i < list01.size(); i++){


			if(i == list01.size()-1){
				ans.add(list01.get(i));
				break;
			}

			int a = list01.get(i), b = list02.get(i);

			if(a != b){
				ans.add(list01.get(i));
				//System.out.println("FUCK => " + list01.get(i) + " <-> " + list02.get(i));
				break;
			}

		}


	}

	public static void solve(List<Integer> list01, List<Integer> list02, List<Integer> list03){

		Collections.sort(list01);
		Collections.sort(list02);
		Collections.sort(list03);

		find(list01, list02);
		find(list02, list03);


	}


	public static void main(String... args){

		int n = sc.nextInt();
		List<Integer> list01 = new ArrayList<>();
		List<Integer> list02 = new ArrayList<>();
		List<Integer> list03 = new ArrayList<>();

		int org = n;
		while(org-- > 0){
			int a = sc.nextInt();
			list01.add(a);
		}

		org = n - 1;

		while(org-- > 0){
			int b = sc.nextInt();
			list02.add(b);
		}

		org = n - 2;

		while(org-- > 0){
			int c = sc.nextInt();
			list03.add(c);
		}

		solve(list01, list02, list03);


		for(Integer jj: ans){
			System.out.println(jj);

		}
	}




}