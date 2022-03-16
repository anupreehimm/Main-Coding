package anu.preethi.ClassProject;

import java.util.Arrays;
import java.util.Scanner;

public class CreateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] milage=new Integer[5];
		System.out.println(Arrays.toString(milage));
    	Scanner scan=new Scanner(System.in);		
//    	for(Integer element:milage)
//		{
//			System.out.println("Enter the milage of");
//			element=scan.nextInt();
//			System.out.println("Entered Details: "+element);
//			
//		}
    	for(int index=0;index<milage.length;index++)
		{
			System.out.println("Enter details: ");
			milage[index]=scan.nextInt();
			System.out.println("Entered details: "+milage[index]);
			
		}
     	System.out.println(Arrays.toString(milage));
        scan.close();

	}

}
