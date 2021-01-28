package sorting;

public class CountingSort {

	public static void main(String[] args) {
		int arr[]= {23,34,17,22,2,300,14};
		int large=arr[0];
		int small=arr[0];
		int n=arr.length;
		int[] b= new int[n];
		for(int i=1;i<arr.length;i++) {
			
			
			if(arr[i]>large) {
				large=arr[i];
			}
			if(arr[i]<small) {
				small=arr[i];
			}
		}
		sort(arr,small,large,n,b);
		for(int item: b) {
			System.out.println(item);
		}
		
	}
	static void sort(int[] arr,int small,int large,int n,int[] b) {
		int[] temp= new int[large+1];
		for(int i=0;i<n;i++) {
			++temp[arr[i]];
		}
		for(int i=1;i<temp.length;i++) {
			temp[i]+=temp[i-1];
		}
		for(int i=n-1;i>=0;i--) {
			b[temp[arr[i]]-1]=arr[i];
			
			
		}
		
	}

}
