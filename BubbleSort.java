package sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int number[]= {5,4,3,2,1};
        
		for(int i=0;i<number.length-1;i++) {
			boolean sorted =true;
			for(int j=0;j<number.length-1-i;j++) {
				if (number[j+1]<number[j]) {
					int temp =0;
					temp=number[j+1];
					number[j+1]=number[j];
					number[j]=temp;
					sorted = false;
				}
				
			}
			if(sorted) break;
		}
		for(int item: number) {
			System.out.print(item+" ");
		}
	}

}
