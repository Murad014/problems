import java.util.*;

public class AIQTest{
	static Scanner sc = new Scanner(System.in);

	public static String solve(String[] lines){

		for(int i = 0; i < lines.length - 1; i++){
			for(int j = 0; j < lines[i].length() - 1; j++){
				int black = 0, white = 0;
				
				if(lines[i].charAt(j) == '#')
					black++;
				else 
					white++;

				if(lines[i+1].charAt(j) == '#')
					black++;
				else 
					white++;

				if(lines[i].charAt(j+1) == '#')
					black++;
				else 
					white++;

				if(lines[i+1].charAt(j+1) == '#')
					black ++;
				else 
					white++;

				if(white >= 3 || black >= 3)
					return "YES";
			}


		}

		return "NO";
	}

	public static void main(String... args){

		String[] lines = new String[] {sc.next(), sc.next(), sc.next(), sc.next()};

		
		String ans = solve(lines);

		System.out.println(ans);
			
		
	}


}