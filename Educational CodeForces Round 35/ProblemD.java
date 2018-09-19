import java.util.*;
public class ProblemD{
	static int inversions = -1;
	public static void reverseArray(int [] array, int l, int r){
		while(l<r){
			int temp = array[l];
			array[l] = array[r];
			array[r] = temp;
			l++;
			r--;
		}
	}

	public static int [] countInversions(int [] array,int l, int h){
		if(l==h){
			int [] arr = new int[1];
			arr[0] = array[l];
			return arr;
		}

		int mid = l + (h-l)/2;
		int [] array1 = countInversions(array,l,mid);
		int [] array2 = countInversions(array,mid+1,h);
		int [] sorted = merge(array1, array2);
		return sorted;
	}

	public static int [] merge(int [] array1, int [] array2){
		int i = 0;
		int j = 0;
		int k = 0;
		int [] sorted = new int[array1.length + array2.length];

		while(i<array1.length && j<array2.length){
			if(array1[i]<array2[j]){
				sorted[k] = array1[i];
				i++;
				k++;
				continue;
			}

			if(array1[i]>array2[j]){
				inversions = inversions + (array1.length-i);
				sorted[k] = array2[j];
				j++;
				k++;
				continue;
			}

			else{
				sorted[k] = array1[i];
				i++;
				k++;
				sorted[k] = array2[j];
				j++;
				k++;
			}
		}
		if(i==array1.length){
			while(j<array2.length){
				sorted[k] = array2[j];
				k++;
				j++;
			}
		}

		if(j==array2.length){
			while(i<array1.length){
				sorted[k] = array1[i];
				i++;
				k++;
			}
		}
		return sorted;
	}

	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int [] array = new int[n];
		for(int i=0;i<n;i++){
			array[i] = input.nextInt();
		}

		int m = input.nextInt();
		
		for(int i=0;i<m;i++){
			int l = input.nextInt()-1;
			int r = input.nextInt()-1;
			reverseArray(array,l,r);
			/*for(int j=0;j<n;j++){
				System.out.print(array[j] + " ");
			}
			System.out.println();*/
			if(inversions==-1 || l!=r){
				inversions = 0;
				countInversions(array,0,n-1);
			}
			//System.out.println("Inver" + " " + inversions);
			if(inversions%2==0){
				System.out.println("even");
			}
			else{
				System.out.println("odd");			
			}
		}
	}
}