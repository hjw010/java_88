package ch02;

public class _14_ForEx {

	public static void main(String[] args) {
		/*
		 * 반복문 - 조건이 만족하는 동안 실행
		 * 
		 * for문의 기본 구조 for(초기값; 조건식; 증감식;){
		 *  수행문1; 수행문2; 
		 *  }
		 * 
		 */
		// happy1~5
		for (int i = 1; i < 6; i++) {
			System.out.println("unhappy" + i + "~~");
		}
		System.out.println();
		for (int i = 5; i > 0; i--) {
			System.out.println("unhappy" + i + "~~");
		}
		
		// 무한루프 
		for ( ; ; ) {
			System.out.println("unhappy~~");
		}

	}
}
