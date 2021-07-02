package ch02;

public class _11_whileEx {

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

		//1~10까지 출력 -> 1,2,3,4....
		//1.초기값.
		int i = 1;
		
		//2.조건식.
		while (i<=10) {
			if(i==10) {
				System.out.print(i);
				break;
			}else {
				System.out.print(i+", ");
				//3.증감식
				i++;	
			}
			
		}
		System.out.println(" 끝");
		
		System.out.println("********************************");
		
		int j = 1;
		int sum = 0;
		
		//1~10까지 합계 출력 1~10합계 : 55
		while(j<=10) {
			sum+=j;
			j++;
		}
		System.out.println("합계 : "+sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
