package testing.anu.TestLevelProjects;

import java.util.Collection;
import java.util.LinkedList;

public class Linked {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList obj=new LinkedList();
		obj.add("Anu");
		obj.add(25);
		obj.add('Y');
		obj.add("India");
		obj.add(7);
		obj.addFirst("Now");
		obj.add(5, 'C');
		obj.addLast(51);
		System.out.println(obj);
		obj.remove(2);
		obj.remove("Now");
		obj.removeLast();
		obj.addLast("Correct");
		System.out.println(obj);
		obj.set(3, 'N');
		System.out.println(obj);
		System.out.println(obj.get(5));
		System.out.println(obj.indexOf("Anu"));
		System.out.println(obj.indexOf(4));
												

	}

}
