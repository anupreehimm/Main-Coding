package testing.anu.TestLevelProjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class ListA {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> obj=new ArrayList<Integer>();
		Vector<Integer> obj2=new Vector<Integer>();
		obj.add(7);
		obj.add(1);
		obj.add(15);
		obj.add(21);
		obj.add(4);
		obj.add(2, 18);
		obj.add(27);
		obj.add(30);
		System.out.println(obj);
		obj2.addAll(obj);
		obj.remove(1);
		obj2.add(29);
		obj.add(2,40);
		System.out.println(obj);
		System.out.println(obj2);
		obj2.retainAll(obj);
		System.out.println(obj2);
		obj.removeAll(obj2);
		System.out.println(obj);
		Collections.sort(obj2);
		System.out.println(obj2);
		Collections.reverse(obj2);
		System.out.println(obj2);
		System.out.println(Collections.min(obj2));
		System.out.println(Collections.max(obj2));
		Collections.replaceAll(obj2, 27, 20);
		System.out.println(obj2);

	}

}
