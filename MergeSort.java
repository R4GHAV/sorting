package sorting;

public class MergeSort {

	public static void main(String[] args) {
		int arr[]= {23,34,17,22,-2,300,14};
		int start=0;
		int end=arr.length-1;
            ms(arr,new int[arr.length],start,end);
            for(int item: arr) {
            	 System.out.println(item);
            }
           
	}
	public static void ms(int[] ar,int[] temp,int s,int e) {
		
		if(s>=e) {return;}
		
			int mid =(s+e)/2;
			ms(ar,temp,s,mid);
			ms(ar,temp,mid+1,e);
			merge(ar,temp,s,mid,e);
		
	}
	public static void merge(int ar[],int[] temp,int s,int mid,int e){
		
		int i =s;
		int j=mid+1;
		int k=s;
		
		while(i<=mid && j<=e) {
			if(ar[i]<=ar[j]) {
				temp[k]=ar[i];
				k++;i++;
				
			}
			else {
				temp[k]=ar[j];
				k++;j++;
			}
		}
		
		if(i>mid) {
			while(j<=e) {
				temp[k]=ar[j];
				k++;j++;
			}
		}
		else{
			while(i<=mid) {
				temp[k]=ar[i];
				k++;i++;
			}
		}
		
		for(int it=s;it<=e;it++) {
			ar[it]=temp[it];
		}
	}
	

}
