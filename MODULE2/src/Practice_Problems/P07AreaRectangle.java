package Practice_Problems;
import java.util.*;
class AreaR{
	void returnArea(double a,double b) {
		System.out.println("The area of the rectangle is :"+(a*b));
	;
		
	}
}

public class P07AreaRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		AreaR ob=new AreaR();
		System.out.println("Enter the dimensions of the rectangle:");
		System.out.print("Length  :");double x=sc.nextDouble();
		System.out.print("Breadth :");double y=sc.nextDouble();
		ob.returnArea(x, y);
	}

}
