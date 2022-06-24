package anupreethi.mainProject;

import java.util.Arrays;
import java.util.Scanner;

public class Modify {
	public static void product(Integer[] limit)
	{
		Scanner scan2=new Scanner(System.in);
		for(int j=0;j<limit.length;j++)
		{
			limit[j]=scan2.nextInt();
			
		}
		//System.out.println("Our New Array is: "+limit);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] cost=new Integer[4];
		System.out.println(Arrays.toString(cost));
		System.out.println("Enter Your Array: ");
		product(cost);
		System.out.println(Arrays.toString(cost));
		
		
		
		
		
	}

}
