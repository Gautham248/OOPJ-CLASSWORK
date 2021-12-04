package Practice_Problems;
import java.util.*;
class Complex{
	void sum(double a,double b,double c,double d)
	{
		System.out.println("The sum of the numbers are:");
		System.out.println(a+" + i"+b+"  +  "+c+" + i"+d+" = "+(a+c)+" + i"+(b+d));
		
	}
		void diff(double a,double b,double c,double d)
	{
		System.out.println("The difference of the numbers are:");
		System.out.println(a+" + i"+b+"  -  "+c+" + i"+d+" = "+(a-c)+" + i"+(b-d));
		
	}
}
public class P09ComplexNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Complex ob= new Complex();
		System.out.println("--FIRST NUMBER--");
		System.out.print("Enter real coeff      :");
		double x=sc.nextDouble();
		System.out.print("Enter imaginary coeff :");
		double y=sc.nextDouble();
		System.out.println("--SECOND NUMBER--");
		System.out.print("Enter real coeff      :");
		double i=sc.nextDouble();
		System.out.print("Enter imaginary coeff :");
		double j=sc.nextDouble();
		ob.sum(x, y, i, j);
		ob.diff(x, y, i, j);
		

	}

}
