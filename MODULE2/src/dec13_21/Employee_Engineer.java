package dec13_21;
import java.util.*;
class Employee{
	double base,da,hra,sum;
	void display() {
		System.out.println("--EMPLOYEE CLASS--");
	}
	void calcSalary() {
		sum=base+da+hra;
		System.out.println("The Gross Salary of the Employee is : "+sum);
	}
}
class Engineer extends Employee{
	void display() {
		super.display();
		super.calcSalary();
		System.out.println("--ENGINEER CLASS--");
	}
	void calcSalary() {
		this.display();
		System.out.println("The Gross Salary of the Engineer is : "+2*sum);
	}
	
}
public class Employee_Engineer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Engineer e=new Engineer();
		System.out.println("Enter the basic salary of the employee");
		e.base=sc.nextDouble();
		System.out.println("Enter the DA of the employee:");
		e.da=sc.nextDouble();
		System.out.println("Enter the HRA of the employee");
		e.hra=sc.nextDouble();
		e.calcSalary();
		sc.close();
	}

}
