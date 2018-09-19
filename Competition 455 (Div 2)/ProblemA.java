import java.util.*;
public class ProblemA{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		String [] names = input.nextLine().trim().split(" ");
		String fname = names[0];
		String lname = names[1];
		int i = 0;
		String login =  fname+lname;
		
		while(i<fname.length()){
			String s = fname.substring(0,i+1);
			for(int j=0;j<lname.length();j++){
				String p = s + lname.substring(0,j+1);
				int result = p.compareTo(login);
				if(result<0){
					login = p;
				}
			}
			i++;
		}
		System.out.println(login);
	}
}