package Practice_Problems;
import java.util.*;
class AreaT{
	double s0;
	double s1,s2,s3;
	double getArea()
	{
		s0=(s1+s2+s3)/2;
		double ar=Math.sqrt(s0*(s0-s1)*(s0-s2)*(s0-s3));
		return ar;
	}
	double getPeri() {
		return (s1+s2+s3);
	}
}
		
	


public class P04AreaTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the sides of the triangle:");
		AreaT ob=new AreaT();
		ob.s1=sc.nextDouble();
		ob.s2=sc.nextDouble();
		ob.s3=sc.nextDouble();
		double ta=ob.getArea();
		double pe=ob.getPeri();
		
		System.out.println("The area of the triangls is      : "+ta);
		System.out.println("The perimeter of the triangle is : "+pe);
		

	}

}
