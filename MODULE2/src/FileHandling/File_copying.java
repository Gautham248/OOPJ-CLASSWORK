package FileHandling;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class File_copying {

public static void main(String[]args) throws IOException {
	copyFile();
}
public static void copyFile() throws IOException {
	/*File file= new File("D:\\Gautham\\JavaTestFile(FileHandling)\\CopySample.pdf");
	File opfile= new File("D:\\Gautham\\JavaTestFile(FileHandling)\\CopySample2.pdf");
	opfile.createNewFile();
	if(file.exists()&&opfile.exists())
	{
		System.out.println("Both files exists");
	}*/
	File file= new File("D:\\Gautham\\JavaTestFile(FileHandling)\\Test.pdf");

	File opfile= new File("D:\\Gautham\\JavaTestFile(FileHandling)\\CopySample2.pdf");
	if(file.exists()&&opfile.exists())
	{
		System.out.println("Both files exists");
	}
	FileReader filein=null;
	FileOutputStream fileout=null;
	try {
	filein= new FileReader(file);
	fileout=new FileOutputStream(opfile);
	}catch(FileNotFoundException e) {
	e.printStackTrace();
	}
	
	//System.out.println(filein.available());
	
	/*int i=0;
	 while((i=filein.read())!=-1)
	 {
		 fileout.write(i);
	 }
	*/
	 int j=0;
	 while((j=filein.read())!=-1) {
		 char c= (char)j;
		 System.out.print(c);
	 }
	

}
}
