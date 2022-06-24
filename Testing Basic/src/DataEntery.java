import java.util.Scanner;

public class DataEntery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner data=new Scanner(System.in);
		System.out.println("Welcome to TNPC");
		System.out.println("Enter your name");
		String name=data.nextLine();
		System.out.println("Your name is "+name);
		System.out.println("Entr your qualification");
		String edu=data.next();
		System.out.println("Your qualification is: "+edu);
		System.out.println("Enter your contact number");
		double num=data.nextDouble();
		System.out.println("Your contact num is: "+num);
		System.out.println("Thank for your registaration on TNPC, Your name is "+name );//"Qualification of " +edu "Under the contact number of "+num );
		

	}

}
