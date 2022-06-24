package anupreethi.mainProject;

import java.util.Arrays;
import java.util.Scanner;

public class Update2 {
	
	static Scanner scan=new Scanner(System.in);
//	public static void cloth(Integer[] terms, int pos)
//	{
//		System.out.println("Enter your pos:" );
//		terms[pos]=scan.nextInt();
//		
//	}
	public static void price(Integer[] third,Integer value)
	{
		for(int i=0;i<third.length;i++)
		{
			if(third[i]==value)
			{
				System.out.println("Changes want to macke");
				third[i]=scan.nextInt();
				
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] cost= {150,200,350,450,560,900};
		//Update2.cloth(cost, 2);
		System.out.println("Changed: "+Arrays.toString(cost));
		Update2.price(cost, 900);
		//System.out.println("Changed: "+Arrays.toString(cost));

	}

}
