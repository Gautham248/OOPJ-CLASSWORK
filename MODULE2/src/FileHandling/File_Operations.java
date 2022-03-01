package FileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class File_Operations {

	public static void main(String[] args) throws IOException {
		Scanner sc= new Scanner(System.in);
		String name=sc.next();
		File f=new File(name);
		//create new file in the system
		f.createNewFile();
		//file class methods on the file Object
		System.out.println("File Name : "+f.getName());
		System.out.println("File Path : "+f.getPath());
		System.out.println("File Absolute Path : "+f.getAbsolutePath());
		System.out.println("Parent : "+ f.getParent());
		System.out.println("Exists : "+f.exists());
	
	}

}
