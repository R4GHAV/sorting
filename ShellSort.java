package sorting;

public class ShellSort {
	
public static void main(String[] args) {
	int arr[]= {23,34,17,22,-2,300,14};
	for(int gap=arr.length/2;gap>0;gap/=2) {
		for(int i=gap;i<arr.length;i++) {
			int se=arr[i];
			int j;
			for(j=i;j>=gap && arr[j-gap]>se;j-=gap) {
				arr[j]=arr[j-gap];
			}
				arr[j]=se;
		}
	}
	for(int item: arr) {
		System.out.print(item+" ");
	}
	
}
}
