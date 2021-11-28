package Basic_Program;
import java.util.*;
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:  ");
		int n=sc.nextInt();
		System.out.println("Enter the limit");
		int m=sc.nextInt();
		for(int i=1;i<=m;i++)
			System.out.println(n+"*"+i+"="+(n*i));
		
	}

}
