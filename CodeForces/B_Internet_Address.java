
import java.util.*;

public class B_Internet_Address{

	static Scanner sc = new Scanner(System.in);

	public static void main(String... args){

		String str = sc.next();
		String[] mem = new String[str.length()];

		for(int i = 0; i < str.length(); i++){
			mem[i] = String.valueOf(str.charAt(i));
		}

		StringBuilder protocol = new StringBuilder();
		StringBuilder domain = new StringBuilder();
		StringBuilder context = new StringBuilder();

		StringBuilder ans = new StringBuilder();

		int stage = 1;

		for(int i = 0; i < mem.length; i++){
				if(stage == 1){
					protocol.append(mem[i]);

					if(protocol.toString().equals("http") && stage == 1) {
						ans.append("http://");		
						stage++;
					}

					if(protocol.toString().equals("ftp") && stage == 1){
						ans.append("ftp://");		
						stage++;
					}

				}

				if(stage == 2){
					domain.append(mem[i]);
					if(domain.toString().endsWith("ru") && !domain.substring(1, domain.length() - 2).toString().isEmpty()){
						ans.append(domain.substring(1, domain.length() - 2) + ".ru");
						stage++;
					}
				}

				if(stage == 3){
					if(!str.substring(i+1).isEmpty())
						ans.append("/" + str.substring(i+1));
					break;
				}
			

		}

		System.out.println(ans);



	}




}