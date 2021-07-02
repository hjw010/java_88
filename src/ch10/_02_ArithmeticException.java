package ch10;

import java.util.InputMismatchException;
import java.util.Scanner;
//import java.lang <-- 에 있는건 임포트 안해도 알아서 임포트됨

//RunTimeException - ArithmeticException
public class _02_ArithmeticException {
	public static void main(String[] args) {

		System.out.println("=====두개의 정수 입력========");
		Scanner sc = new Scanner(System.in);
		System.out.println("정수1 입력 : ");
		int num1 = sc.nextInt();
		System.out.println("정수2 입력 : ");
		int num2 = sc.nextInt();
		

		try {
			System.out.println("몫 : " + (num1/num2));
			System.out.println("나머지 : " + (num1%num2));
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}finally {
			sc.close();
		}
		System.out.println("정상종료");
		
		
		
	}
}
