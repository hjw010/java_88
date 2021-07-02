package ch02;

public class _02_IfEx {
	public static void main(String[] args) {
		/*
		 * if - else if - else문
		 * if(조건식1) {  // 조건식1이 참인 경우 수행
		 * 		수행문1;
		 * } else if(조건식2) { // 조건식2가 참인 경우 수행
		 *      수행문2;
		 * } else if(조건식3) { // 조건식3이 참인 경우 수행
		 *      수행문3;
		 * } else {           // 위의 조건이 모두 해당되지 않는 경우 수행
		 * 		수행문4;
		 * }
		 * 수행문5;	// 반드시 수행
		 */
		int num = -5;
		String result = "";
		
		// (양수/음수/0) 판단
		// 결과출력 => -5는 음수입니다.
		if(num > 0) {
			result = "양수";
		} else if(num == 0) {
			result = "0";
		} else {
			result = "음수";
		}
		
		System.out.println(num + "는 " + result + "입니다.");
		
	}
}
