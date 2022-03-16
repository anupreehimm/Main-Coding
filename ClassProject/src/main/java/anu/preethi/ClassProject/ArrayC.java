package anu.preethi.ClassProject;

import java.util.Arrays;

import java.util.Scanner;

public class ArrayC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []name=new String[5];
		System.out.println(name.length);
		System.out.println(Arrays.toString(name));
		Scanner scan=new Scanner(System.in);
//		for(String pointer:name)
//		{
//			System.out.println("Enter your name");
//			pointer=scan.nextLine();
//			System.out.println("Your name is: "+pointer);
//		}
		for(int index=0;index<name.length;index++)
		{
			System.out.println("Enter your name");
			name[index]=scan.nextLine();
			System.out.println("Your name is:"+name[index]);
		}
		System.out.println(Arrays.toString(name));
		

	}

}
