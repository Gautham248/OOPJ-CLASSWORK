package String_programs;
import java.util.Scanner;
public class PaliendromeProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:  ");
		String str=sc.nextLine();
		String revstr="";
		char ch;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			revstr=ch+revstr;
		}
		if(str.equals(revstr))
			System.out.println("The String is a Paliendrome");
		else
			System.out.println("The String is not a Paliendrome");
		

	}

}
