package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class WordCounter {

	public static void main(String[] args)throws IOException{
		File file1= new File("read1.txt");
		file1.createNewFile();
		System.out.println(file1.exists());
		System.out.println(file1.getAbsolutePath());
		//FileInputStream filein= new FileInputStream("read1.txt");
	}

}
