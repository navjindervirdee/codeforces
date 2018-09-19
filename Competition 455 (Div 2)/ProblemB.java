import java.util.*;
public class ProblemB{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		float n = input.nextInt();
		int div = (int)Math.ceil(n/2);
		if(n%2==0){
			int sum = (div*(div+1));
			System.out.println(sum);
		}
		else{
			int sum = (div*(div+1))/2;
			sum = sum + ((div-1)*div)/2;
			System.out.println(sum);
		}
	}
}
