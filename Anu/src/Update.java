import java.util.Arrays;
import java.util.Scanner;

public class Update {

	public static void source(char[] src,byte[] dest)
	{
		Scanner scan=new Scanner(System.in);
		for(int index=0;index<src.length;index++)
		{
			dest[index]=(byte)src[index];
			//System.out.println(dest[index]);
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char cat[]= {'a','e','i','o','u'};
		byte pet[]=new byte[cat.length];
		source(cat,pet);
		System.out.println(Arrays.toString(pet));

	}

}
