package ch02;

import java.util.Scanner;

public class _23_DoWhileEx {
	public static void main(String[] args) {
		
		// 월[1~12]을 입력받아서 출력
		// 범위초과(12보다 크거나, 1보다 작으면) -> 오류
		
		Scanner input = new Scanner(System.in);
		int month;
		do {
			System.out.print("월을 입력 하시오(숫자): ");
			month = input.nextInt();
			if((month > 12)||(month < 1)) {
				System.out.println(month+" 는 잘못된 월 입니다. 1~12월 중에서  입력 하세오"); // <--- 잘못입력하면 다시 입력받으러가야함
			}else {
				System.out.println(month+"월");
				break;
			}
		}while(true);
		
		
		
	}
}
