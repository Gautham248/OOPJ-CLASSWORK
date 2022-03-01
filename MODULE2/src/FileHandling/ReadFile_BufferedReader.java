package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class ReadFile_BufferedReader {
	public static void main(String[] args) {
		String path="D:\\Gautham\\JavaTestFile(FileHandling)\\Sample2.txt";
		try {
			File file=new File(path);
			BufferedReader br= new BufferedReader(new FileReader(file));
			System.out.println("File Content is : ");
			int c=0;
			while((c=br.read())!=-1) {
				System.out.print((char)c);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
