package ch12;

import java.util.Scanner;

public class _04_WeekMain {

	public static void main(String[] args) {

		/*
		 * enum : 열거형
		 * 
		 * 1. 정의 : 여러개의 상수들을 모아서 만든 객체를 의미한다.
		 * 2. 작성방법 : enum 열거형명{상수1, 상수2, ... 상수n}
		 * 3. 용도 : 제한된 상수값만을 사용하고자 할 때 
		 * 4. 접근방법 : 1) 열거형명.상수 
		 * 			   2) 열거형명.상수.ordinal() -> index
		 * 
		 * 5. 특징 : switch (변수/수식)에서 변수타입으로 enum을 사용할 수 있다.
		 * 			ordinal()메서드를 이용해서 순서값을 얻어올 수 있다.
		 * 			ordinal()메서드는 0부터 시작한다.
		 */
		
		System.out.println(_04_Week.SUN.ordinal());
		System.out.println(_04_Week.MON);
		System.out.println(_04_Week.MON.ordinal());
		
		System.out.println("========================");
		
		// switch case문에서 index값 이용해서 요일 출력

		String weekend="";
		
		switch(_04_Week.SUN.ordinal()) {
			case 0: weekend = "일요일";
					break;
			case 1: weekend = "월요일";
					break;
			case 2: weekend = "화요일";
					break;
			case 3: weekend = "수요일";
					break;
			case 4: weekend = "목요일";
					break;
			case 5: weekend = "금요일";
					break;
			default : weekend = "토요일";
		}
		System.out.println(weekend);
		
		switch(_04_Week.SUN) {
		case SUN: weekend = "일요일";
				break;
		case MON: weekend = "월요일";
				break;
		case TUES: weekend = "화요일";
				break;
		case WEB: weekend = "수요일";
				break;
		case THR: weekend = "목요일";
				break;
		case FRI: weekend = "금요일";
				break;
		default : weekend = "토요일";
	}
		
		
		
	}

}
