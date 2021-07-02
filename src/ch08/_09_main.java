package ch08;

import java.lang.reflect.Method;
import java.util.List;

public class _09_main {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		_09_ClassPerson person = new _09_ClassPerson();
		
		Class c =  person.getClass();
		System.out.println(c.getName());
		System.out.println();
		
		c = _09_ClassPerson.class;
		System.out.println(c.getName());
		System.out.println();
		System.out.println(System.identityHashCode(c));
		
		System.out.println();
		c = Class.forName("ch08._09_ClassPerson");
		System.out.println(c.getName());
		
		String s= (String)Class.forName("java.lang.String").newInstance();
		
		
		Method [] methods = Class.forName("java.lang.String").getMethods();
		for (Method method : methods) {
			System.out.println(method+" ");
		}	
		
	}
}
