package Simple_Patterns;
import java.util.*;
public class Complex_Triangle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the maximum number of columns:");
		int max=sc.nextInt();
		for(int row1=1;row1<=max;row1++)
		{
			for(int col1=1;col1<=row1;col1++)
			{
				System.out.print("* ");
			}
			System.out.println("\n");
		}
		for(int row2=(max);row2>=0;row2--)
		{
			for(int col2=1;col2<row2;col2++)
			{
				System.out.print("* ");
			}
			System.out.println("\n");
		}
	}

}
