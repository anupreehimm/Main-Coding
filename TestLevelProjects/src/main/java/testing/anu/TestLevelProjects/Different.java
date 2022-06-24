package testing.anu.TestLevelProjects;

public class Different {

	public static void water(int hai)
	{
		System.out.println("the  value of water "+hai);
		
	}
	public static void air(float hai)
	{
		hai*=3;
		System.out.println(hai);
		
	}
	public static void light(double energy)
	{
		energy=2;
		System.out.println(energy);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float hai=19.23F;
		System.out.println(hai);
		water(10);
		air(hai);
		double[] energy= {10,20,30,40,50,60};
		light(energy[2]);
		
	}
}
		
		
		


