package FileHandling;

import java.io.FileReader;

public class ReadFile_FileReader {

	public static void main(String[] args) {
		String path="D:\\Gautham\\JavaTestFile(FileHandling)\\Sample2.txt";
		try {
		FileReader fr= new FileReader(path);
		System.out.println("File Contents are : ");
		int c=0;
		while((c=fr.read())!=-1)
		{
			System.out.print((char)c);
		}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
