package anupreethi.mainProject;

import java.util.Arrays;

public class Diffone {

	public static void shell(double hey)
	{
		System.out.println(hey);
	}
	public static void shore(double day)
	{
		System.out.println("Before Shore: "+day);
		day*=2;
		System.out.println("After Shore: "+day);
	}
	public static void care(double[] van)
	{
		System.out.println("Before care: "+van);
		van[3]*=3;
		System.out.println("After care: "+van);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double value=23.9;
		System.out.println(value);
		shell(11.9);
		//shell(value);
		double[] van= {1.2,2.3,3.4,4.5,5.6};
		//shore(van[2]);
		shore(value);
		System.out.println(Arrays.toString(van));
		care(van);
		System.out.println(Arrays.toString(van));

	}

}
