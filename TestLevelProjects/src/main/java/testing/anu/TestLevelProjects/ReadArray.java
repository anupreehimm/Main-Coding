package testing.anu.TestLevelProjects;

import java.util.Arrays;
import java.util.Scanner;

public class ReadArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] direct=new String[5];
		int [] values=new int[5];
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Your Array");
		for(int i=0;i<values.length;i++)
		{
			values[i]=scan.nextInt();
			
		}
		System.out.println(Arrays.toString(values));
		System.out.println("What position you what");
		Scanner scan2=new Scanner(System.in);
		int st=scan2.nextInt();
		for(int pointer:values)
		{
			if(pointer==st)
				System.out.println("The Postion you want: "+pointer);
		}
		
		
		
//		for(int index=0;index<direct.length;index++)
//		{
//			direct[index]=scan.next();
//			
//		}
//		System.out.println(Arrays.toString(direct));
//		Scanner scan2=new Scanner(System.in);
//		System.out.println("Enter your star");
//		int index2=scan2.nextInt();
//		System.out.println("Your Star is: "+direct[index2]);
//		String phrase=scan2.next();
//		for(String point:direct)
//		{
//			if(point.startsWith(phrase));
//		    System.out.println(point);
//		}

	}

}
