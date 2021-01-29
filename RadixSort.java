package sorting;

public class RadixSort {

public static void main(String[] args) {
	int arr[]= {2283,34013,1367,22568,209,5100,134};
	int large=arr[0];
	int n=arr.length;
	int[] b= new int[n];
	for(int i=1;i<n;i++) {
			if(arr[i]>large) {
				large=arr[i];
			}
	 	}
	
	position(arr,large,n,b);
	for(int item: arr) {
		System.out.println(item);
	}
}
 static void position(int[] arr,int large,int n,int[] b) {
	 int posn=0;
	 for(posn=1;large/posn>0;posn*=10) {
		sort(arr,n,b,posn); 	
	 }
 }

 static void sort(int[] arr,int n,int[] b,int posn) {
	    int[] temp= new int[10];
	    for(int i=0;i<n;i++) {
	    	++temp[(arr[i]/posn)%10];
	    }
	    for(int i=1;i<temp.length;i++) {
	    	temp[i]+=temp[i-1];
	    }
	    for(int i=n-1;i>=0;i--) {
	    	b[--temp[(arr[i]/posn)%10]]=arr[i];
	    }
	    for (int i = 0; i < n; i++) 
            arr[i] = b[i]; 
 	}
}
