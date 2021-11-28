package Simple_Patterns;
import java.util.Scanner;
public class Complex_Triangle1_ERROR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the maximum number of columns");
		int max=sc.nextInt();
		
		for(int row=1;row<(2*max);row++)
		{
			if(row<=max)
			{
				for(int col=1;col<=row;col++)
				{
					System.out.print("* ");
				}
				System.out.println("\n");
			}
			if(row>max)
			{
				for(int y=2;y<max;y=y+2)
				{
				for(int column=1;column<=(row-y);column++)
				{
					
					
					System.out.print("* ");
					
				}
				System.out.println("\n");
				}
			}		
			
		}
		

	}

}
