package ch08;

public class _05_ObjectCloneTest {

	
	//368
	public static void main(String[] args)throws CloneNotSupportedException {
		
		_05_Circle circle = new _05_Circle(10, 20, 30);
		System.out.println(circle);
		System.out.println("circle의 실제 주소 : " + System.identityHashCode(circle));

		System.out.println();
		System.out.println();
		System.out.println();
		_05_Circle circle2 = (_05_Circle)circle.clone();
		System.out.println(circle2);
		System.out.println("circle2의 실제 주소 : " + System.identityHashCode(circle2));
		
	}
}
