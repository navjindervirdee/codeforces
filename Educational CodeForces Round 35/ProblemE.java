import java.util.*;
public class ProblemE{
	public static void main(String [] args){
		Scanner input =  new Scanner(System.in);
		int n = input.nextInt();
		int k = input.nextInt();
		int [] array = new int[k];
		List<Integer> left = new ArrayList<Integer>();
		Stack<Integer> stack = new Stack<Integer>();
		for(int i=0;i<k;i++){
			array[i] = input.nextInt();
		}

		int [] b = new int[n+1];
		int l = 1;
		boolean can = true;
		int i = 0;
		int max = -1;
		while(i<array.length){
			int num = array[i];
			if(max<num){
				max =  num;
			}
			if(stack.isEmpty()){
				stack.push(num);
				i++;
				continue;
			}

			
			if(stack.peek()==l){
				b[l] = stack.pop();
				l++;
				continue;
			}
			if(stack.peek()>num){
				stack.push(num);
				i++;
				continue;
			}
			else{
				can = false;
				break;
			}
		}

		if(!can){
			System.out.println(-1);
		}
		else{
			while(!stack.isEmpty()){

				if(stack.peek()==l){
					b[l] =stack.pop();
					l++;
					continue;
				}
				int p = stack.peek()-1;
				int c = l;
				for(int j=p;j>c-1;j--){
					left.add(j);
					l++;
				}
			}
			while(n>=l){
				left.add(n);
				n--;
			}
			for(int j=0;j<k;j++){
				System.out.print(array[j] + " ");
			}
			for(int j=0;j<left.size();j++){
				System.out.print(left.get(j) + " ");
			}

		}

	}
}