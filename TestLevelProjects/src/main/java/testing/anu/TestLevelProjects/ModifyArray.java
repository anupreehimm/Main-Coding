package testing.anu.TestLevelProjects;

import java.util.Arrays;
import java.util.Scanner;

public class ModifyArray {
	
	public static void chang(int[] tl)
	{
		Scanner scan=new Scanner(System.in);
		
		for(int index=0;index<tl.length;index++)
		{
			System.out.println("Enter the pos");
			tl[index]=scan.nextInt();
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] value={1,2,3,4,5,6,7};
		System.out.println(value.length);
		System.out.println(Arrays.toString(value));
		chang(value);
		System.out.println(Arrays.toString(value));

	}
	
	

}
