package arrays;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter number of rows");
		
		int r= sc.nextInt();
		
		System.out.println("enter number of coloumns");
		
		int c= sc.nextInt();
		
		int a[][] = new int[r][c];

		int b[][] = new int[r][c];
		
		int s[][] = new int[r][c];
		
		System.out.println("enter 1st matrix");
		
		for(int i=0; i<r; i++) {
			
			for(int j=0; j<c; j++) {
				
				a[i][j]= sc.nextInt();
				
			}
			
		}
		
		System.out.println("enter 2nd matrix");
		
		for(int i=0; i<r; i++) {
			
			for(int j=0; j<c; j++) {
				
				b[i][j]= sc.nextInt();
				
			}
			
		}
		
		for(int i=0;i<r;i++){    
			
			for(int j=0;j<c;j++){    
				
			s[i][j]=0;    
			
			for(int k=0;k<r;k++)      
				
			{   
				
			s[i][j]+=a[i][k]*b[k][j];   
			
			}  
			
			System.out.print(s[i][j]+" ");
			
			}
			
			System.out.println();   


	}

}
	
}
