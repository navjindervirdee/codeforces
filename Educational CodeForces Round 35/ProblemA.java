import java.util.*;
public class ProblemA{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int [] array = new int[n];
		int min = Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
			array[i]= input.nextInt();
			if(array[i]<min){
				min = array[i];
			}
		}

		int mindist = n;
		int minIndex = -1;
		for(int i=0;i<n;i++){
			if(array[i]==min && minIndex==-1){
				minIndex = i;
				continue;
			}
			if(array[i]==min){
				int dist = i-minIndex;
				minIndex = i;
				if(dist<mindist){
					mindist = dist;
				}
			}
		}
		System.out.println(mindist);
	}
}