package Simple_Patterns;

public class Inverted_Right_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int row=n;row>=0;row--)
		{
			for(int col=0;col<row;col++)
			{
				System.out.print("* ");
			}
			System.out.println("\n");
		}

	}

}
