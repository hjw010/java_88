package ch01;

public class _09_PrintEx {

	public static void main(String[] args) {
		
		/*
		 * printf(형식지정자, 값 또는 변수)
		 * - 형식 지정자
		 * 		%d : 정수를 출력한다. 예) System.out.printf("%d", 10);
		 * 		%f : 실수를 출력한다. 예) System.out.printf("%f", 3.14F); //실수 6자리
		 * 		%c : 한문자를 출력한다. 예) System.out.printf("%c", 'a');
		 * 		%s : 문자열을 출력한다. 예) System.out.printf("%s", "가나다라마바사");
		 * */
		
		System.out.printf("%d", 10);
		System.out.println();
		System.out.printf("%f", 3.14F);
		System.out.println();
		System.out.printf("%c", 'a');
		System.out.println();
		System.out.printf("%s", "가나다라마바사");
		System.out.println();
		double value = 1.0/3.0;
		System.out.println(value);
		System.out.printf("%f", value);
		System.out.println();
		//소수점 자리 지정해서 출력 - printf("%전체자릿수.나머지자릿수f" value); 앞의 두자리를 공백으로 채움(기본 6자리 이기때문에)
		System.out.printf("%6.2f", 0.3123123);
		System.out.println();
		System.out.printf("%8.4s","20210520");
		
	}
	
}
