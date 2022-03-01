package FileHandling;

import java.io.File;
import java.util.Scanner;

public class ReadFile_ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=null;
		String path="D:\\Gautham\\JavaTestFile(FileHandling)\\Sample2.txt";
		try {
			File file=new File(path);
		 sc=new Scanner(file);
			System.out.println("The File Content is : ");
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			sc.close();
		}
	}

}
