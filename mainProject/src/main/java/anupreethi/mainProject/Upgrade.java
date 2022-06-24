package anupreethi.mainProject;

import java.util.Arrays;

public class Upgrade {

	public static void unconditional(Character[] str,int[] end) 
	{
		for(int i=0;i<str.length;i++)
		{
			end[i]=(int)str[i];
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character[] name= {'A','n','u','p','r','e','e','t','h','i'};
		int[] family=new int[name.length];
		unconditional(name,family);
		System.out.println(Arrays.toString(family));

	}

}
