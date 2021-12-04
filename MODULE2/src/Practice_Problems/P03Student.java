package Practice_Problems;

class Student2{
	String name,phone,address;
	int roll;
	Student2(String s, int r,String p,String a)
	{
		name=s;
		roll=r;
		address=a;
		phone=p;
	}
}
public class P03Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 ob=new Student2("John",2,"9446223167","Newton av, Queens");
		Student2 ob1=new Student2("Sam",45,"944342567","Brooklyn,NewYork");
		System.out.println("---DETAILS---");
		System.out.println("Name   :"+ob.name);
		System.out.println("RollNo :"+ob.roll);
		System.out.println("Address:"+ob.address);
		System.out.println("Phone  :"+ob.phone);
		System.out.println("\n");
		System.out.println("Name   :"+ob1.name);
		System.out.println("RollNo :"+ob1.roll);
		System.out.println("Address:"+ob1.address);
		System.out.println("Phone  :"+ob1.phone);
		
	}	

}
