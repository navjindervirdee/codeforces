import java.util.*;
public class ProblemB{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		String [] mat = new String[9];
		String space = "";
		int k = 0;
		for(int i=0;i<11;i++){
			if(i==3 || i==7){
				space = input.nextLine().trim();
				continue;
			}
			mat[k] = input.nextLine().trim().replace(" ","");
			k++;
		}
		
		int row = input.nextInt()%3;
		int col = input.nextInt()%3;
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		map.put(0,6);
		map.put(1,0);
		map.put(2,3);		
		
		row = map.get(row);
		col = map.get(col);
		
		boolean found = false;
		for(int i=row;i<row+3;i++){
			char [] arr = mat[i].toCharArray();
			String n = "";
			for(int j=col;j<col+3;j++){
				if(arr[j]=='.'){
					found = true;
					arr[j] = '!';
					continue;
				}
			}
			mat[i] = String.valueOf(arr);
		}
		
		if(!found){
			for(int i=0;i<9;i++){
				String str = mat[i];
				String n = "";
				for(int j=0;j<9;j++){
					if(str.charAt(j)=='.'){
						n = n + "!";
						continue;
					}
					n = n + str.charAt(j);
				}
				mat[i] = n;
			}
		}
		
		k = 0;

		for(int i=0;i<11;i++){
			int l = 0;
			if(i==3 || i == 7){
				System.out.println(" ");
				continue;
			}
			String str = mat[k];
			k++;
			for(int j=0;j<11;j++){
				if(j==3 || j==7){
					System.out.print(" ");
					continue;
				}
				System.out.print(str.charAt(l));
				l++;
			}
			System.out.println();
		}
	}
}
		
		
		
			
					

		
		
		
		
		
		
		