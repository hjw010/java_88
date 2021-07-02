package ch10;

import java.util.Scanner;
public class _06_ThrowsException {

	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		//readAge() : 나이 입력받아 출력
		// 입력받은 나이가 0세 미만이면 예외발생 : ArithmeticException
		
		try {
			int age = readAge();
			System.out.println("나이 : " + age);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			return;
		}finally {
			System.out.println("finally-무조건수행");
		}
		
		System.out.println("정상 종료");
		
	}
	
	
	public static int readAge() throws ArithmeticException{
		System.out.println("나이 입력 : ");
		int age = input.nextInt();
		if(age<0) {
			throw new ArithmeticException("나이가 0보다 적을수 없습니다."); //<--RuntimeException 이므로 오류가 안남 하지만 컴파일시 에러
																		//근데... throws ArithmeticException 추가안하고 해보니....
																		//실행됨.... 아마 컴파일러가 붙여준듯함...... 
		}else {
			return age;
		}
	}
	
	
	
	
}
