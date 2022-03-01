package FileHandling;
import java.io.*;
import java.util.*;
public class MenuDrivenFileHandling {

	public static void main(String[] args) {

		InputStreamReader input=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(input);
		Scanner sc=new Scanner(System.in);
		//Variables------
		int choice;	
		String fileName = null;
		File fileob = null;
		//---------------
		System.out.println("--MENU DRIVEN FILE HANDLER--");
		do {
		System.out.println("\n\n1.Create File\n2.Write Details\n3.Read File\n4.Clear File\n5.Exit");
			System.out.print("Enter your choice:  ");
			choice=sc.nextInt();
					switch(choice) {
					case 1:
					{
						System.out.println("Do you want to specify path ?\n1.Yes\n2.No");
						int choice2=sc.nextInt();
						switch(choice2) 
						{
						case 1:
						{
							System.out.println("Enter file name with path: ");
							
							fileName= sc.next();
							fileob=new File(fileName);
							try {
								boolean flag= fileob.createNewFile();
								if(flag) {
									System.out.println("File created\n");
								}
								else {
									System.out.println("File already present\n");
								}
							}catch(IOException e) {
								e.printStackTrace();
							}
							
							
						}
						break;
						case 2:
						{
							System.out.println("Enter the name of the file: ");
							 fileName=sc.next();
							 fileob=new File(fileName);
							try {
								boolean flag= fileob.createNewFile();
								if(flag) {
									System.out.println("File created\n");
								}
								else {
									System.out.println("File already present\n");
								}
							}catch(IOException e) {
								e.printStackTrace();
							}
				
						}
							break;
							default:
								System.out.println("Invalid Operation!!\n");
							
						}
						
					}
					break;
					case 2:
					{
						try {
						if(fileob.exists()) {
							
							try {
							FileWriter fw=new FileWriter(fileName);
							System.out.println("Enter the text you want to input(press enter when finished)\n");
							String in=br.readLine();
							fw.write(in);
							fw.close();
							}catch(Exception e) {
								System.out.println(" ");
							}
							
						}
						else {
							System.out.println("File Doest Exist\n");
						}}catch(Exception e) {
							System.out.println("File Doesnt exist!\n\n");
						}
					}
					break;
					case 3:
					{
						try {
							try {
							if(fileob.exists()) {
								FileReader fr=new FileReader(fileName);
								System.out.println("The Contents of the file are: ");
								int c=0;
								while((c=fr.read())!=-1) {
									System.out.print((char)c);
								}	
								
							}
						}catch(Exception e) {
							System.out.println(" ");
						}
							
						}catch(Exception e) {
							System.out.println("File Doesnt Exist!!");
						}
					}
					break;
						
					case 4:
					{
						try {
							FileWriter fwc=new FileWriter(fileName);
							String clear=" ";
							fwc.write(clear);
							System.out.println("\nFile Cleared!!");
							
						} catch (IOException e) {
							System.out.println(" ");
						}
					}
						break;
						
					case 5:
						System.out.println("Exiting the Handler");
						break;
					}
			
			
		}while(choice!=5);
	}
}
