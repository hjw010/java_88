package ch12;

public class _05_SpreadArgs {
	/*
	public void callArgs(String str1, String str2, String str3, String str4) {
		System.out.println(str1 + str2 + str3 + str4);
	}
	 */
	
	/*
	 *	스프레드 매개변수 (...)
	 * 1.용도 : 메서드 호출시 매개변수 인자의 수가 일치하지 않아도 호출이 가능하도록 한다.
	 * 			args는 인자의 수를 동적으로 처리할 수 있도록 유연성을 제공한다.
	 * 2.방법 : 메서드 인자(데이터 타입 ... 변수)로 지정하나, 스프레드 매개변수는 한개만 사용할 수 있다.
	 * 			컴파일시 매개변수 인자로 넘어온 갯수만큼 배열이 생성된다.
	 */
	public void callArgs(String ...str) { //String[] str
		
		for(String s : str) {
			System.out.print(s + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]+ " ");
		}
	}
	
	public void callArgs2(String name, int ... score) {
		System.out.print(name + " ");
		for(int i : score) {
			System.out.print(i + " ");
		}
	}
	

	public static void main(String[] args) {

		_05_SpreadArgs values = new _05_SpreadArgs();
		values.callArgs("스테이크", "센드위치", "샐러드", "짬뽕","감자칩","사과주스");
		System.out.println();
		values.callArgs2("한진원", 77 , 88, 99 , 85 , 47);
		
	}

}
