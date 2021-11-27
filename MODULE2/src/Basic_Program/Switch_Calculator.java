package Basic_Program;
import java.util.*;

public class Switch_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int x=0;
		do {
		System.out.println("Enter the first number: ");
		double num1=sc.nextInt();
		System.out.println("Enter the second number:  ");
		double num2= sc.nextInt();
		double result=0;
		System.out.println("Choose the operation(+,-,*,/,%):");
		char op=sc.next().charAt(0);
		
		
		switch(op) {
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1-num2;
			break;
		case '*':
			result=num1*num2;
			break;
		case '/':
			result=num1/num2;
			break;
		case '%':
			result=num1%num2;
			break;
		default:
			System.out.println("Invalid Operator");
		}
		System.out.println("The Result is : "+result);
		System.out.println("Do you want to continue(y/n)?");
		char selector=sc.next().charAt(0);
		if(selector=='y')
			x++;
		
			
		
		}while(x!=0);

	}
}


