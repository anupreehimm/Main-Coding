package testing.anu.TestLevelProjects;

import java.util.Arrays;
import java.util.Scanner;

public class UserListanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str=new String[4];
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your Array: ");
		for(int index=0;index<str.length;index++)
		{
			str[index]=scan.next();
		}
			System.out.println(Arrays.toString(str));	

//				for(String point:str)
//		{
//			point=scan.next();
//			System.out.println(point);	
//		}
				scan.close();
		
	}

}
