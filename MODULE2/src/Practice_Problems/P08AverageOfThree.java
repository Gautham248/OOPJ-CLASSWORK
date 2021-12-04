package Practice_Problems;
import java.util.Scanner;
class Average{
	double n1,n2,n3;
	double avg() {
		return ((n1+n2+n3)/3);
	}
}
public class P08AverageOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the three numbers");
		Average ob=new Average();
		ob.n1=sc.nextDouble();
		ob.n2=sc.nextDouble();
		ob.n3=sc.nextDouble();
		double ave= ob.avg();
		System.out.println("The average of the three numbers is: "+ave);
		
	}	
	

}
