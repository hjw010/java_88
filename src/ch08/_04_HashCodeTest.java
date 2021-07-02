package ch08;

public class _04_HashCodeTest {
	public static void main(String[] args) {
		
		
		Integer num1 = new Integer(100);
		int num2 = 200;
		
		//언박싱 
		int num3 = num1.intValue();
		
		//오토박싱
		Integer num4 = Integer.valueOf(num2);
		int num5 = Integer.parseInt("1124123");
		System.out.println(Integer.valueOf(num1) + Integer.valueOf(num2));

	}
}
