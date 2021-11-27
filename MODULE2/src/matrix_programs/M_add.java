package matrix_programs;
import java.util.Scanner;

public class M_add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int r=sc.nextInt();
		System.out.println("Enter the number of columns:  ");
		int c=sc.nextInt();
		
		int[][] a1=new int[r][c];
		System.out.println("Enter the elements of the first matrix:");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a1[i][j]=sc.nextInt();}System.out.println("\n");}
		
		int[][] a2=new int[r][c];
		int[][] sum=new int[r][c];
		System.out.println("Enter the elements of the second matrix:");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a2[i][j]=sc.nextInt();}System.out.println("\n");}
		
		
		
		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)
				sum[i][j]=a1[i][j]+a2[i][j];
			
		System.out.println("The sum of the matrices are are: ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.println(sum[i][j]+" ");}System.out.println("\t");}
		
		
		

	}

}
