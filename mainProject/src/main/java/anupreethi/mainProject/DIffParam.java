package anupreethi.mainProject;

import java.util.Arrays;

public class DIffParam {

	public static void main(String[] args) {
		double[] num= {10.2,20.3,30.4,40.5,50.6};
		int[] price=new int[4];
		for(int i=0;i<price.length;i++)
		{
			price[i]=(int)num[i];
		}
		System.out.println(Arrays.toString(price));
		
		double[] paid=new double[5];
		paid=Arrays.copyOfRange(num, 0, paid.length);
		System.out.println(Arrays.toString(paid));


}
