package ch09;

import java.util.ArrayList;
import java.util.List;

public class _11_StackTest {

	private static List<String> list = new ArrayList<String>();
	
	public static void push(String[] strArry) {
		for (int i = 0; i < strArry.length; i++) {
			list.add(strArry[i]);
		}
		
	}
	public static void pop() {
		int size = list.size()-1;
		list.remove(size);
	}
	public static void printStrList() {
		System.out.println(list);
	}
	public static void main(String[] args) {
		_11_StackTest stackTest = new _11_StackTest();
		
		String[] strArray = {
							"강아지",
							"기러기",
							"두더지"
		};
		push(strArray);
		printStrList();
		pop();
		printStrList();
		pop();
		printStrList();
	}
}
