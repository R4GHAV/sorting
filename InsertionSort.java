package sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[]= {22,34,-20,67,-10,4,-8};
		int n=arr.length;
		for(int i=1;i<n;i++) {
			int a=arr[i];
			int j;
			for(j=i;j>0 && arr[j-1]>a;j--) {
				arr[j]=arr[j-1];
			}
			arr[j]=a;
			
		}
		
		for(int item: arr) {
			System.out.print(item+" ");
		}

	}

}
