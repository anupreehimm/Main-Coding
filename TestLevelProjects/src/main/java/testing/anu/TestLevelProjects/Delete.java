package testing.anu.TestLevelProjects;

import java.util.Arrays;
import java.util.Scanner;

public class Delete {
	
	public static void deletion(Object[] gst)
	{
		for(Object pointer:gst)
			
		{
			System.out.print(pointer+ " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []arr= {"Anu","RM","Jin","Suga","Hope","Jimin","Tea","Kookie"};
//		arr[4]=null;
		System.out.println(Arrays.toString(arr));
//		for(int index=0;index<arr.length;index++)
//		{
//		if(arr[index].contains("a"))
//		{
//			arr[index]=null;
//		}
//		}
		deletion(arr);
		System.out.println(Arrays.toString(arr));
		
	}

}
