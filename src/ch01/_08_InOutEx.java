package ch01;

import java.util.Scanner;

public class _08_InOutEx {

	public static void main(String[] args) {
		
		
		/*
		 * 변수
		 * 1. 기초형(primitive type) : 실제값이 저장
		 * 		- 데이터타입 변수명 = 값;
		 * 			int score = 70;
		 * 
		 * 2. 참조형(reference type) : 실제 객체를 가리키는 주소값 저장
		 * 		- 클래스, 인터페이스, 배열
		 *		//인스턴스 생성
		 * 
		 * 		클레스명 참조변수명 = new 클래스명();
		 * 		new라는 키워드로 메모리에 생성
		 * */
		
		Scanner input = new Scanner(System.in);
		System.out.print("첫번째 숫자 입력 : ");
		int i = input.nextInt();
		System.out.print("두번째 숫자 입력 : ");
		int j = input.nextInt();
		int sum = i + j;
		System.out.println(sum);
		input.close(); //자원해제_ 힙메모리에서 삭제
	}
}
