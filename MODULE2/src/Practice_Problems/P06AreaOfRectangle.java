package Practice_Problems;
import java.util.*;
class Area{
	double getArea(double p,double l) {
		return p*l;
	}
}
public class P06AreaOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Area ob=new Area();
		System.out.println("Enter the length and breadth of the first rectangle");
		double a=sc.nextDouble();double b=sc.nextDouble();
		double a1=ob.getArea(a, b);
		System.out.println("Enter the length and breadth of the second rectangle");
		double c=sc.nextDouble();double d=sc.nextDouble();
		double a2=ob.getArea(c, d);
		System.out.println("Area of first rectangle: "+a1);
		System.out.println("Area of second rectangle: "+a2);

	}

}
