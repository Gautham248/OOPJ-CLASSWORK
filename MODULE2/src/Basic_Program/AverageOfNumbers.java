package Basic_Program;
import java.util.*;
public class AverageOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int num=sc.nextInt();
		float sum=0;
		
		float[] arr=new float[num];
		System.out.println("Enter the elements: ");
		for(int i=0;i<num;i++)
			arr[i]=sc.nextFloat();
		for(int i=0;i<num;i++)
			sum+=arr[i];
		float average=(float)(sum/num);
		System.out.println("The average of the numbers are: "+average);
		
			
	}

}
