package sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr= {23,34,17,22,-2,300,14};
		int high=arr.length;
		int low=0;
		sort(arr,low,high-1);
		
		for(int i=0;i<high;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	static void sort(int[] arr,int low,int high) {
		if(low<high) {
			
			int pivot=quickSort(arr,low,high);
			sort(arr,low,pivot-1);
			sort(arr,pivot+1,high);
		}
	}
	static int quickSort(int[] arr,int low,int high) {
		int pivot=arr[high];
		int i=low-1;
		for(int j=low;j<high;j++) {
			if(arr[j] < pivot) {
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
				
		return i+1;
	}

}
