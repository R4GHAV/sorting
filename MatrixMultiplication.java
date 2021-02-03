package arrays;
import java.util.Scanner;
public class MatrixMultiplication {
	



	

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			 System.out.println("enter the no.of rows");
			 int rows = sc.nextInt();
			 System.out.println("enter the no. of column");
			 int col= sc.nextInt();
			  System.out.println("enter first matrix");
			 int mat1[][]= new int[rows][col];
			 int mat2[][]= new int[rows][col];
			 int mat3[][]= new int[rows][col];
			 for(int i=0; i<rows; i++) {
				 for(int j =0; j<col; j++) {
					 mat1[i][j]=sc.nextInt();
				 }
			 }
			System.out.println("enter the second matrix");
			 for(int i=0;i<rows;i++) {
				 for(int j=0;j<col;j++) {
					 mat2[i][j]=sc.nextInt();
				 }
			 }
			 System.out.println("the sum is");
			 for(int i=0;i<rows;i++) {
				 for(int j=0;j<col;j++) {
					 mat3[i][j]=0;
					for(int k=0;k<rows;k++) {
						
						mat3[i][j] += mat1[i][k] *mat2[k][j]; 
						
					}
					 
				 }
			 }
			 
			 for(int i=0; i<rows; i++) {
				 for(int j =0; j<col; j++) {
					System.out.print(mat3[i][j]+" ");
				 }
				 System.out.println();
			 }
			
	        }

		}
