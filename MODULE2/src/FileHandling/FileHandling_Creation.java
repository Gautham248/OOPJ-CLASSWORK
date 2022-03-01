package FileHandling;
import java.util.*;
import java.io.*;


public class FileHandling_Creation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		File myObj= new File("21January2022.txt");
		myObj.createNewFile();
		FileOutputStream fout= new FileOutputStream("21January2022.txt");
		System.out.println("Enter the count: ");
		int count=sc.nextInt();
		for(int i=1;i<=count;i++)
		{
			System.out.println("Enter the number "+i+":");
			int num=sc.nextInt();
			fout.write(num);
		}
		
		//OUTPUT
		int i=0;
		FileInputStream fin= new FileInputStream("21January2022.txt");
		System.out.println(fin.available());
		while((i=fin.read())!=-1)
		{
			System.out.print(i);
		}
	}

}
