package anupreethi.mainProject;

import java.util.Arrays;
import java.util.Scanner;

public class DemoNew2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] can=new String[4];
		System.out.println(Arrays.toString(can));
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Yours:");
//		for(int i=0;i<can.length;i++)
//		{
//			can[i]=scan.next();
//			
//		}
//		System.out.println(Arrays.toString(can));
		
		for(String pointer:can)
		{
			pointer=scan.next();
			System.out.println("Yours: "+pointer);
		}
		

	}

}
