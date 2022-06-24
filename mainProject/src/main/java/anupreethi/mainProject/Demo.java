package anupreethi.mainProject;

import java.util.*;

public class Demo {

	public static void main(String[] args) {
		Scanner a= new Scanner(System.in);
		
		System.out.println("Submit your ITR-2022");
		System.out.println("Tell us your name: ");
		String name=a.nextLine();
		System.out.println("Tell us your profession: ");
		String profession=a.next();
		System.out.println("Tell us your annual salary: ");
		double salary=a.nextDouble();
		System.out.println("Tell us your email id: ");
		String mail=a.next();
		System.out.println("Tell us your contact number: ");
		long number=a.nextLong();
		System.out.println("Thanks for your submitting ITR-2022 Mr./Miss "+name +"Professional of "+profession);

		a.close();
		
	}

}
