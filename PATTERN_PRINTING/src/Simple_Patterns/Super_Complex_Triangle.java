package Simple_Patterns;

import java.util.Scanner;

public class Super_Complex_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the max number of columns: ");
		int n=sc.nextInt();
		
		for(int row=0;row<2*n;row++)
		{
			
			int totalColInRow=row>n?2*n-row:row;
			int spaces=n-totalColInRow;
			for(int i=0;i<spaces;i++)
			{
				System.out.print(" ");
			}
			for(int col=0;col<totalColInRow;col++)
			{
				System.out.print("* ");
			}
			System.out.println("\n");
	}

}
}
