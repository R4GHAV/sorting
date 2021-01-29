package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int a[]= {7,4,52,-1,9,-4};
		int n= a.length;
		for(int i =0; i<n-1; i++) {
			int minInd= i;
			for(int j=i;j<n; j++) {
				if(a[j]<a[minInd]) {
					minInd=j;
				}
			}
			int temp=0;
			temp=a[i];
			a[i]=a[minInd];
			a[minInd]=temp;
		}
		for(int e: a) {
			System.out.print(e+" ");
		}
	}

}
