package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile_InputStream {

	public static void main(String[] args)throws IOException {
		
		String path="D:\\Gautham\\JavaTestFile(FileHandling)\\Sample2.txt";
		File file=new File(path);
		FileInputStream filein= new FileInputStream(file);
		try {
			
			System.out.println("File content is : ");
			
			int c=0;
			while((c=filein.read())!=-1) {
			
				System.out.print((char)c);
			}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			filein.close();
		}
		
		
	}

}
