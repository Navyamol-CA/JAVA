import java.util.Scanner;
public class Matrix{
	
	public static void main(String []args)
	{
	int i,j;
	 Scanner input=new Scanner (System.in);
	 System.out .println("Enter the number of rows of first matrix: ");
	 int r1=input.nextInt();
	 System.out .println("Enter the number of columns of first matrix: ");
	 int c1=input.nextInt();
	 
	 System.out .println("Enter the number of rows of second matrix: ");
	 int r2=input.nextInt();
	 System.out .println("Enter the number of columns of second matrix: ");
	 int c2=input.nextInt();
	 
	 if(r1==r2 && c1==c2){
	 
	 int matrix1[][]=new int[r1][c1];
	 int matrix2[][]=new int[r2][c2];
	 int sum[][]=new int[r1][c1];
	 
	 
	 System.out .println("Enter the elements of the first matrix :\n");
	 for(i=0;i<r1;i++)
	 {
	 	for(j=0;j<c1;j++)
	 	{
	 		matrix1[i][j]=input.nextInt();
	 	}
	 }
	 System.out .println("Enter the elements of the second matrix :\n");
	 for(i=0;i<r2;i++)
	 {
	 	for(j=0;j<c2;j++)
	 	{
	 		matrix2[i][j]=input.nextInt();
	 	}
	 }
	 System.out.println("Sum of the above matrices is : \n");
	 for(i=0;i<r1;i++)
	 {
	 	for(j=0;j<c1;j++)
	 	{
	 		sum[i][j]=matrix1[i][j]+matrix2[i][j];
	 	}
	 }
	 for(i=0;i<r1;i++)
	 {
	 	for(j=0;j<c1;j++)
	 	{
	 		System.out.print(sum[i][j]+" ");
	 	}
	 	System.out.println("");
	 }
	 }
	 else
	 	System.out.println("Number of rows and columns must be same for both matrices !!");
	}
}


