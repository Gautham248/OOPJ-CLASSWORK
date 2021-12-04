package Practice_Problems;
import java.util.*;
class AreaTr{
	
	double getArea(double s1,double s2,double s3)
	{
		double s0=(s1+s2+s3)/2;
		double ar=Math.sqrt(s0*(s0-s1)*(s0-s2)*(s0-s3));
		return ar;
	}
	double getPeri(double s1,double s2,double s3) {
		return (s1+s2+s3);
	}
}
public class P05Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sides of the triangle:");
		AreaTr ob=new AreaTr();
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double ta=ob.getArea(a,b,c);
		double pe=ob.getPeri(a,b,c);
		
		System.out.println("The area of the triangls is      : "+ta);
		System.out.println("The perimeter of the triangle is : "+pe);
		

	}

}
