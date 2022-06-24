package testing.anu.TestLevelProjects;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack  obj=new Stack ();
		obj.push("Anu");
		obj.push(7);
		obj.push(1.5F);
		obj.push(1.23);
		obj.push('B');
		//System.out.println(obj);
//		for(Object pointer:obj)
//		{
//			System.out.println(pointer);
//		}
//		
		obj.pop();
		Iterator pointer=obj.iterator();
		while(pointer.hasNext())
			{
				System.out.println(pointer.next());
			}
		System.out.println(obj.peek());
		System.out.println(obj.search(4));
		obj.clear();
		System.out.println(obj.isEmpty());
	}

}