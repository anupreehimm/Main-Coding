package testing.anu.TestLevelProjects;

import java.util.Arrays;

public class Upgrade2 {
	public static void changes(char[] name, byte[] part)
	{
		for(int index=0;index<name.length;index++)
		{
			part[index]=(byte)name[index];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] str= {'a','n','u','s','u',};
		System.out.println(str.length);
		byte [] value=new byte[str.length];
		changes(str,value);	
		System.out.println(Arrays.toString(value));
		
	}

}
