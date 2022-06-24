package anupreethi.mainProject;

import java.util.Arrays;
import java.util.Scanner;

public class Update {
	
	static Scanner scan=new Scanner(System.in);
	public static void myfav(String[] idol, int pos)
	{
		
		System.out.println("Enter your name for the position: ");
		idol[pos]=scan.next();
		
	}
	public static void alltime(String[] artist, String match )
	{
		//Scanner scan2=new Scanner(System.in);
		for(int i=0;i<artist.length;i++)
		{
			
			if(artist[i].contains(match))
			{
				System.out.println("Enter the name you want ot change: ");

				artist[i]=scan.next();
			}
							
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name= {"Rm","Jin","Suga","Hopa","Jimin","V","Kookie"};
		Update.myfav(name, 3);
		System.out.println("Now Array is: "+Arrays.toString(name));
		Update.alltime(name, "HPreethi");
		System.out.println("Now an Array is: "+Arrays.toString(name));
	}

}
