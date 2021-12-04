package Practice_Problems;
class Student{
	String name;
	int roll;
	Student(String s, int r)
	{
		name=s;
		roll=r;
	}
}

public class P02StudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ob= new Student("John",2);
		System.out.println("Name : "+ob.name);
		System.out.println("RollNo : "+ob.roll);

	}

}
