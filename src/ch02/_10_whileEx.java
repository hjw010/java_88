package ch02;

public class _10_whileEx {

	public static void main(String[] args) {
		/*
		 * 반복문 : 조건식이 참인 동안 반복(while, for)
		 *		1.초기값 -> 조건식 -> 증감식
		 * 
		 * 초기값
		 * while(조건식){
		 *	수행문1;
		 *	수행문2;
		 *	증감식;
		 * }
		 * 수행문3;
		 *
		 * */

		//출력 - > happy1 ~~ happy2 ....
		//1. 변수 초기화
		int i = 1;
		while(i<=5){ //2. 조건식
			System.out.println("happy" + i + "~~");
			//3. 증감식
			i+=1;
			//i++;
			//++i;
		}
		System.out.println("끝");
	}
	
}
