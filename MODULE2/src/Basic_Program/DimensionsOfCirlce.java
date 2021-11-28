package Basic_Program;
import java.util.*;
public class DimensionsOfCirlce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of the circle: ");
		float radius=(float)sc.nextFloat();
		float area=(float)(3.14*radius*radius);
		float peri=(float)(2*3.14*radius);
		System.out.println("The area of the circle is "+area);
		System.out.println("The Circumference of the circle is  " +peri);

	}

}
