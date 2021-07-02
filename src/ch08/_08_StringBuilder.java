package ch08;

public class _08_StringBuilder {

	public static void main(String[] args) {
		
		
		String str ="java";
		System.out.println(System.identityHashCode(str));
		//문자열이 안전하게 변경되는 것을 보장함
		StringBuffer sBuffer = new StringBuffer(str);
		System.out.println("버퍼 연산 전 : " + System.identityHashCode(sBuffer));
		sBuffer.append("앙");
		System.out.println("버퍼 연산 후 : " + System.identityHashCode(sBuffer));
		str = sBuffer.toString();
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
		
		//문자열이 안전하게 변경되는 것을 보장안함 but 빠름(멀티스레드 프로그램이 아닌곳에서)
		StringBuilder sBuilder = new StringBuilder(str);
		System.out.println("빌더 연산 전 : " + System.identityHashCode(sBuffer));
		sBuilder.append("앙기모띠이");
		System.out.println("빌더 연산 후 : " + System.identityHashCode(sBuffer));
		str = sBuilder.toString();
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
		
		int i =0;
		System.out.println(System.identityHashCode(i));
		i = i+10;
		System.out.println(System.identityHashCode(i));
		
		
		Integer integer = new Integer(100);
		int i2 = integer;
		System.out.println(i2);
		
		int i3 = Integer.parseInt("1234");
		System.out.println(i3);
		
		
		String str5 = "한진원";
		Class c = str5.getClass();
		System.out.println(c);
		

		try {
			System.out.println(Class.forName("ch08._01_Book"));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
