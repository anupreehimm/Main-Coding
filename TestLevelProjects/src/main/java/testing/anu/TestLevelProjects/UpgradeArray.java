package testing.anu.TestLevelProjects;

import java.util.Arrays;

public class UpgradeArray {
	public static void convert(char[] scr,byte[] des)
	{
		for(int index=0;index<scr.length;index++) {
			des[index]=(byte)scr[index];
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] key= {'A','N','U','P','R','E','E','T','H','I'};
		System.out.println(key.length);
		System.out.println(Arrays.toString(key));
		byte[] zero=new byte[key.length];
		convert(key, zero);
		System.out.println(Arrays.toString(zero));
		
		}
	}


