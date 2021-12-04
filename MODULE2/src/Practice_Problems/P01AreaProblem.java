package Practice_Problems;
import java.util.*;
class AreaEx{
	double length,breadth;
	void setDim(double l,double b)
	{
		length=l;breadth=b;
		
	}
	double getArea() {
		return length*breadth;
	}
	
}
public class P01AreaProblem {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		AreaEx ob= new AreaEx();
		System.out.println("Enter the dimensions of the Reactangle");
		System.out.println("Length  :");
		double le=sc.nextDouble();
		System.out.println("Breadth :");
		double br=sc.nextDouble();
		ob.setDim(le, br);
		System.out.println("The area of the rectangle is");
		double ar=ob.getArea();
		System.out.println(ar);
		
	

	}

}
