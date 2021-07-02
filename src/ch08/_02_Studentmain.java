package ch08;

public class _02_Studentmain {

	public static void main(String[] args) {
		
		_02_Student stu1 = new _02_Student(1,"임");
		_02_Student stu2 = new _02_Student(2,"임");
		
		System.out.println(stu1.hashCode());
		System.out.println(stu2.hashCode());
		System.out.println(System.identityHashCode(stu1));
		System.out.println(System.identityHashCode(stu2));
		
		if(stu1.equals(stu2)) {
			System.out.println("true");
		}else {
			System.out.println("false");
			
		}
		
		if(stu1==stu2) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		
		
		if(stu1.hashCode()==stu2.hashCode()) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		
	}
}
