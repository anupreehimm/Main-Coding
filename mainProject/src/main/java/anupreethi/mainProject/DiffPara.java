package anupreethi.mainProject;

import java.util.Arrays;

public class DiffPara {
	public static void rain(Integer water)
	{
		System.out.println("Your value is: "+water);
		
	}
	public static void cloud(Integer time)
	{
		System.out.println("Your value before cloud: "+time);
		time*=2;
		System.out.println("your value after cloud: "+time);
	}
	public static void sun(Double energy)
	{
		System.out.println("Your value before sun: "+energy);
		energy+=3;
		System.out.println("Your value after sun: "+energy);
	}
	public static void moon(Double[] light)
	{
		System.out.println("Your value Before moon: "+Arrays.toString(light));
		light[3]*=2;
		System.out.println("Your value after moon: "+Arrays.toString(light));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer land=13;
		System.out.println(land);
		rain(land);
		cloud(land);
		Double[] hevan= {10.2,21.3,65.9,58.7,82.3};
		sun(hevan[2]);
		moon(hevan);
	}

}
