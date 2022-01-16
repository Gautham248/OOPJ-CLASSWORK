package FileHandling;
import java.io.*;
public class ConsoleInputReading {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your Name:  ");
		String name=br.readLine();
		System.out.println("The Name is : "+name);
	}

}
