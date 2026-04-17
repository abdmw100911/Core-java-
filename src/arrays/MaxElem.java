package arrays;

public class MaxElem {
	public static void findMaxElem(int[] arr, int n) {
		int max = arr[0];
		int maxIndex = 0;
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max = arr[i];
				maxIndex = i;
			}
		}
		System.out.println(max+" is the maximum element in the array and its index is "+maxIndex);
	}
	
	public static void findMinElem(int[] arr, int n) {
		int min = arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]< min) {
				min = arr[i];
			}
		}
		System.out.println(min+" is the minimum element in the array");
	}
	public static void main(String[] args) {
		int[] arr = {5,1,7,9,3};
		int n = arr.length;
		findMaxElem(arr,n);
		findMinElem(arr,n);
}

}
