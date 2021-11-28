package ArraysClassMethods;
import java.util.*;
import java.util.Arrays;

public class ArraySearch {
	
	//In order for ArraySearch to work,the array must be sorted

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the number of elements of the Array:");
		int num=sc.nextInt();
		System.out.println("Enter the elements of the array: ");
		int[] arr= new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();}
		
		System.out.println("Enter the element to be searched:");
		int key=sc.nextInt();
		Arrays.sort(arr);//ARRAY MUST BE SORTED
		int ind=Arrays.binarySearch(arr, key);
		if(ind>=0)
			System.out.println(key+" found at "+Arrays.binarySearch(arr, key));
		else
			System.out.println("Element not  present in the array");
		
	}
	

}
