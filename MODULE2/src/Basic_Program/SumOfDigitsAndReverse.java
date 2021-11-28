package Basic_Program;
import java.util.*;

public class SumOfDigitsAndReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int sum=0;
		int rev=num;
		int _new=0;
		while(num>0)
		{
			sum+=(num%10);
					num=num/10;
		}
		System.out.println("The sum of the digits of the given number is:  "+sum);
		
		while(rev>0) {
			_new=(_new*10)+(rev%10);
			rev=rev/10;
		}
		System.out.println("The reverse of the number is: "+_new);
	}

}
