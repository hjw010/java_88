package ch02;

public class _20_ForEx2 {

	public static void main(String[] args) {

		/*
		 * break문 예제 - 반복문이 중첩되어 있을 경우 break; 문은 가장 가까운 반복문만 종료 - 바깥쪽 반복문까지 종료시키려면 반복문에
		 * 이름(라벨)을 붙이고, breka 이름; 사용
		 */
		// 1~100 짝수 합
		int total = 0;
		for (int i = 0; i < 101; i++) {
			if(i==100) {
				break;
			}else {
				if (i % 2 == 0) {
					total += i;
				}
			}
		}
		System.out.println(total);

	}
}
