package scanner;
import java.util.*;

public class Details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter name");
		String name=s.nextLine();
		System.out.println(name);
		System.out.println("Enter rollno");
		int rollno=s.nextInt();
		System.out.println(rollno);
		System.out.println("Enter Location");
		String location=s.next();	
		System.out.println(location);
		System.out.println("Enter College");
		String college=s.next();
		System.out.println(college);

	}

}
