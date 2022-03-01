package FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class File_Creation {

	public static void main(String[] args)throws IOException {

		String path="D:\\Gautham\\JavaTestFile(FileHandling)\\Sample2.txt";
		
		//1.USing File
		File file= new File(path);
		try {
			boolean flag= file.createNewFile();
			if(flag) {
				System.out.println("File created");
				
			}
			else {
				System.out.println("File already present");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		//2.FileOutputStram along with scanner

		try {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter file name with path: ");
		String fileName= sc.nextLine();
		FileOutputStream fos= new FileOutputStream(fileName,true);
		System.out.println("Enter file content: ");
		String content = sc.nextLine();
		byte b[]=content.getBytes();
		fos.write(b);
		fos.close();
		System.out.println("File saved at mentioned path");
		}catch(Exception e) {
			System.out.println("Exception found");
			e.printStackTrace();
		
		/*	//3. Java nio package
			Path pathLocation=Paths.get("D:\\Gautham\\JavaTestFile(FileHandling)\\Sample2-2.txt");
			try {
			Path newPath=	Files.createFile(pathLocation);
			System.out.println("NewFile created at : " +newPath);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	*/
		}
	}
}


