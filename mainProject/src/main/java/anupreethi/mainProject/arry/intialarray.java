package anupreethi.mainProject.arry;

import java.util.Arrays;

public class intialarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr= {"Anu","Rithu","Ashu","Manju","Murugan"};
		System.out.println(arr.length);
		//System.out.println(arr);//shows address of the array
		//for(int i=0;i<arr.length;i++)
		//{
		//	System.out.println(arr[i]);
		//} 
		//System.out.println(Arrays.toString(arr));
		for(String pointer:arr)
		{
		System.out.println(pointer);
		}
		

	}

}
