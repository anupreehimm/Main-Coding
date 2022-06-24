package anupreethi.mainProject;

import java.util.Arrays;
import java.util.Scanner;

public class Values {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Float []arr=new Float[5];
		System.out.println(Arrays.toString(arr));
		Scanner scan=new Scanner(System.in);
		System.out.println(arr.length);
		for(int index=0;index<arr.length;index++)
		{
			System.out.println("Enter Your Float Value");
			arr[index]=scan.nextFloat();
			System.out.println("Your Float Value is: "+arr[index]);
		}
		System.out.println(Arrays.toString(arr));
//		for(Float pointer:arr)
//		{
//			System.out.println("Enter your Float value");
//			pointer=scan.nextFloat();
//			System.out.println("Your Float value is: "+pointer);
//		}
//		System.out.println(Arrays.toString(arr));
	}

}
