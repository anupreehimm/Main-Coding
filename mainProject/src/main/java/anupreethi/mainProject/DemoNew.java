package anupreethi.mainProject;

import java.util.Arrays;
import java.util.Scanner;

public class DemoNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] value= {"Anu","Preethi","Papa","Blacky"};
		System.out.println(value.length);
//		for(int i=0;i<value.length;i++)
//		{
//			System.out.println(value[i]);
//		}
		System.out.println(Arrays.toString(value));
		for(String pointer:value)
		{
			System.out.println(pointer);
		}

	}

}
