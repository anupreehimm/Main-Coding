package testing.anu.TestLevelProjects;

import java.util.Arrays;

public class ListanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] fl={1.25F,2.56F,81.53F,65.87F,78.6F};
		System.out.println(fl.length);
		System.out.println(Arrays.toString(fl));
//		for(int index=0;index<fl.length;index++)
//		{
//			System.out.println(fl[index]);
//			
//		}
		for(float pointer:fl)
		{
			System.out.println(pointer);
		}
	}

}
