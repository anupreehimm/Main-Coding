import java.util.Scanner;

public class Regtagular {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length");
		int l=scan.nextInt();
		System.out.println("Enter the breath");
		int b=scan.nextInt();
		int lb=l*b;
		System.out.println("Regtacluar volume: " + lb);

	}

}
