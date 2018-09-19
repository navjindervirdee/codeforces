import java.util.*;

public class ProblemC{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int q = input.nextInt();
		input.nextLine();
		Set<Character> set = new HashSet<Character>();
		int shocks = 0;
		for(int j=0;j<q;j++){
			String [] query = input.nextLine().trim().split(" ");
			char [] arr = query[1].toCharArray();
			if(query[0].equals("!")){
				if(j!=q-1 && set.size()==1){
					shocks++;
					continue;
				}		
				Set<Character> temp = new HashSet<Character>();
				for(int i=0;i<arr.length;i++){
					if(set.size()==0 || set.contains(arr[i])){
						set.add(arr[i]);
					}
				}
				System.out.println(set);
				continue;
			}
				
			if(query[0].equals("?")){		
				if(j!=q-1 && set.size()==1){
					shocks++;
					continue;
				}
							
				Set<Character> temp = new HashSet<Character>();
				for(int i=0;i<arr.length;i++){
					if(set.size()==0 || set.contains(arr[i])){
						set.add(arr[i]);
					}
				
				}
				System.out.println(set);
				continue;
			
			}
			
			if(query[0].equals(".")){		
				for(int i=0;i<arr.length;i++){
					if(set.contains(arr[i])){
						set.remove(arr[i]);
					}
				}					
				System.out.println(set);
			}
		}	
		System.out.println(shocks);
	}
}
			
