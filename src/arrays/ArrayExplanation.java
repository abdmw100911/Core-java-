package arrays;

public class ArrayExplanation {
	public static void main(String[] args) {
		//array declaration and definition 
		int[] arr = {5,1,7,9,3};
		for(int val : arr) {
			System.out.print(val+" ");
		}
		
		//array creation
		int[] arr1 = new int[5];
		//array initialization
		arr1[0]=5;
		arr1[1]=1;
		arr1[2]=7;
		arr1[3]=9;
		arr1[4]=3;
		System.out.println();
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
}
