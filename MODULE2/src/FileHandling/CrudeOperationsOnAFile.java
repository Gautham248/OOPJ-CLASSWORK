package FileHandling;
import java.io.*;
import java.util.*;

 class Employee implements Serializable{
	int empno;
	String ename;
	int salary;
	Employee(int empno,String ename, int salary){
		this.empno=empno;
		this.ename=ename;
		this.salary=salary;
	}
	public String toString() {
		return empno+" "+ename+" "+salary;
	}
}

public class CrudeOperationsOnAFile {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Scanner sc=new Scanner(System.in);
		Scanner ssc=new Scanner(System.in);
		int choice=-1;
		File file=new File("Employee(crude).txt");
		try {
			file.createNewFile();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		ArrayList<Employee> al= new ArrayList<Employee>();
			ObjectOutputStream oos= null;
			ObjectInputStream ois= null;
			ListIterator li=null;
			if(file.isFile()) {
				ois= new ObjectInputStream(new FileInputStream(file));
				al=(ArrayList<Employee>)ois.readObject();
				ois.close();
				
			}
			
	
		
		do {
			System.out.println("1.INSERT");
			System.out.println("2.DISPLAY");
			System.out.println("3.Search");
			System.out.println("4.DELETE");
			System.out.println("5.UPDATE");
			System.out.println("6.SORT BY EMPNO ON SCREEN");
			System.out.println("7.SORT BY EMPNO ON FILE");
			System.out.println("0.EXIT");
			choice = sc.nextInt();
			switch(choice) {
			case 1:{
				System.out.println("How many employee details are to be filled : ");
				int n=sc.nextInt();
				for(int i=0;i<n;i++) {
				System.out.println("Enter employee number:  ");
				int empno=sc.nextInt();
				System.out.println("Enter employee name:  ");
				String ename=ssc.nextLine();
				System.out.println("Enter employee salary:  ");
				int salary=sc.nextInt();
				al.add(new Employee(empno,ename,salary));
				try {
					oos=new ObjectOutputStream(new FileOutputStream(file));
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
				oos.writeObject(al);
				oos.close();
			}
				break;
			case 2:
				if(file.isFile()) {
				ois= new ObjectInputStream(new FileInputStream(file));
				al=(ArrayList<Employee>)ois.readObject();
				ois.close();
				
				System.out.println("-----------------");
				li=al.listIterator();
				while(li.hasNext())
				System.out.println(li.next());
				//System.out.println(al);
				System.out.println("-----------------");
				}else {
					System.out.println("File doesnt exist!!");
				}
				break;
				
			case 3:
				if(file.isFile()) {
					ois= new ObjectInputStream(new FileInputStream(file));
					al=(ArrayList<Employee>)ois.readObject();
					ois.close();
					
					boolean found= false;
				System.out.println("Enter the employee number to seach");
				int empno=sc.nextInt();
				System.out.println("-----------------");
				li=al.listIterator();
				while(li.hasNext()) {
				Employee e=(Employee)li.next();
				
				if(e.empno==empno) {
					System.out.println(e);
					found=true;
				}
				}
				System.out.println("-----------------");
				}
				
				break;
				
				
			case 4:
				if(file.isFile()) {
					ois= new ObjectInputStream(new FileInputStream(file));
					al=(ArrayList<Employee>)ois.readObject();
					ois.close();
					
					boolean found= false;
				System.out.println("Enter the employee number to delete");
				int empno=sc.nextInt();
				System.out.println("-----------------");
				li=al.listIterator();
				while(li.hasNext()) {
				Employee e=(Employee)li.next();
				
				if(e.empno==empno) {
					li.remove();
					found=true;
				}
				if(found) {
					oos=new ObjectOutputStream(new FileOutputStream(file));
					oos.writeObject(al);
					oos.close();
				}
				else {
					System.out.println("Record not found!!");
				}
				}
				System.out.println("record deleted!!");
				System.out.println("-----------------");
				}
				
				break;
				
			case 5:
				if(file.isFile()) {
					ois= new ObjectInputStream(new FileInputStream(file));
					al=(ArrayList<Employee>)ois.readObject();
					ois.close();
					
					boolean found= false;
				System.out.println("Enter the employee number to update");
				int empno=sc.nextInt();
				System.out.println("-----------------");
				li=al.listIterator();
				while(li.hasNext()) {
				Employee e=(Employee)li.next();
				
				if(e.empno==empno) {
					System.out.println("Enter new employee Name: ");
					String ename=ssc.nextLine();
					System.out.println("Enter new Salary : ");
					int sal=sc.nextInt();
					li.set(new Employee(empno,ename,sal));
					found=true;
				}
				if(found) {
					oos=new ObjectOutputStream(new FileOutputStream(file));
					oos.writeObject(al);
					oos.close();
				}
				else {
					System.out.println("Record not found!!");
				}
				}
				System.out.println("record deleted!!");
				System.out.println("-----------------");
				}
				
				break;
				
			case 6:
				if(file.isFile()) {
				ois= new ObjectInputStream(new FileInputStream(file));
				al=(ArrayList<Employee>)ois.readObject();
				ois.close();
				
				Collections.sort(al,new Comparator<Employee>() {
					public int compare(Employee e1,Employee e2) {return e1.empno-e2.empno;}});
				
				System.out.println("-----------------");
				li=al.listIterator();
				while(li.hasNext())
				System.out.println(li.next());
				//System.out.println(al);
				System.out.println("-----------------");
				}else {
					System.out.println("File doesnt exist!!");
				}
				break;
				
				
				case 7:
					if(file.isFile()) {
					ois= new ObjectInputStream(new FileInputStream(file));
					al=(ArrayList<Employee>)ois.readObject();
					ois.close();
					
					Collections.sort(al,new Comparator<Employee>() {
						public int compare(Employee e1,Employee e2) {return e1.empno-e2.empno;}});
					
					oos=new ObjectOutputStream(new FileOutputStream(file));
					oos.writeObject(al);
					oos.close();
					System.out.println("-----------------");
					li=al.listIterator();
					while(li.hasNext())
					System.out.println(li.next());
					//System.out.println(al);
					System.out.println("-----------------");
					}else {
						System.out.println("File doesnt exist!!");
					}
					break;
				
				
			default:
				System.out.println("Invalid choice");	
			}
			
		}while(choice!=0);
		
		
		
		
	}

}
