package testing.anu.TestLevelProjects;

import java.util.Arrays;

public class DiffSize {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []singers= {"Yuvan","Karthick","Yesudas","BTS","Raja","ARR","Syed"};
////		String []alltime=new String[5];
////		for(int index=0;index<alltime.length;index++)
////		{
////			alltime[index]=(String)singers[index];
////		}
//		System.out.println(Arrays.toString(alltime));
	
		String []addict=new String[5];
		addict=Arrays.copyOfRange(singers, 0, addict.length);
		System.out.println(Arrays.toString(addict));
			
			
			
	}

}
