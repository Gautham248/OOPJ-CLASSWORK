package ArraysClassMethods;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intarr[]= {10,20,15,22,35};
		Arrays.sort(intarr);
		System.out.println("The Sorted array is:  ");
		for(int element:intarr)
			System.out.println(element+"\n");
	}

}
