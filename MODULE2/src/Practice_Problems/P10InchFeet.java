package Practice_Problems;
import java.util.*;
class Distance{
	double feet,inch;
	void sum(double a,double b,double c,double d) {
		inch=b+d;
		feet= a+c+(inch/12);
		inch%=12;
		System.out.println("-----SUM-----");
		System.out.println("Feet:"+feet+"\n"+"Inches:"+inch);
	}
}
public class P10InchFeet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Distance ob= new Distance();
		System.out.println("--FIRST DIMENSIONS--");
		System.out.print("Enter Feet   :");double x=sc.nextDouble();
		System.out.print("Enter Inches :");double y=sc.nextDouble();
		System.out.println("--SECOND DIMENSIONS--");
		System.out.print("Enter Feet   :");double i=sc.nextDouble();
		System.out.print("Enter Inches :");double j=sc.nextDouble();
		ob.sum(x, y, i, j);
	}

}
