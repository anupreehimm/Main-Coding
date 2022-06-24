package anupreethi.mainProject;

import java.util.Arrays;
import java.util.Scanner;

public class ReadArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Integer[] value= {10,12,14,16,18,20};
//		System.out.println("Arrays Length is: " + value.length);
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter the position: ");
//		Integer cloud=scan.nextInt();
//		for(Integer pointer:value)
//		{
//			if(cloud==pointer)
//				System.out.println("Your value is :"+pointer);
//			
//		}
		String[] name= {"Anu","Preethi","PAPA","Blacky"};
		System.out.println(Arrays.toString(name));
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name: ");
		String data=scan.next();
		for(String pointer:name)
		{
			if(pointer.startsWith(data)) {
				System.out.println("Your name is: "+pointer);
			
		}
			else
			{
				System.out.println("Your name is unavailable");
			}
				
				
		}
				
	

	}

}