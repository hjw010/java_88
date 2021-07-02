package ch09;

import java.util.LinkedList;
import java.util.List;

// p 416
public class _10_LinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<String>();
		
		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("C");
		System.out.println(linkedList);
		
		System.out.println();
		linkedList.add(0, "D");
		System.out.println(linkedList);
		linkedList.addFirst("GG");
		System.out.println();
		linkedList.remove(3);
		System.out.println(linkedList);
		
		linkedList.removeFirst();
		System.out.println(linkedList);

		linkedList.removeLast();
		System.out.println(linkedList);
	}
	
}
