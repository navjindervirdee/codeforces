import java.util.*;
public class ProblemB{
	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		double n = input.nextInt();
		double a = input.nextInt();
		double b = input.nextInt();

		double max = -1;
		for(int i=1;i<n;i++){
			double plateA = i;
			double plateB = n-i;
			double numa =  Math.floor(a/plateA);
			double numb = Math.floor(b/plateB);
			max = Math.max(max,Math.min(numa,numb));
		}	
		System.out.println((int)max);
	}
}