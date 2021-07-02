package z_homework;

import java.util.Scanner;

public class HomeWork01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("숫자 입려끄 : ");
		
		//1.전체
		int line = input.nextInt();
		line = (line%2==0)?line+1:line;
		int center = line/2;
		
		/*
		int minus = line-1; // if(i > center) { 이후의 코드 (별 감소때) 를 위한 변수
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < line; j++) {
				if(i > center) {
					if((j>=center-minus) && (j<=center+minus)){
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}else {
					if((j>=center-i) && (j<=center+i)) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			}
			minus--;
			System.out.println();
		}
		System.out.println();
		*/
		
		//1_2.전체2
       for (int i = 0; i < line; i++) {
			for (int j = 0; j < line; j++) {
				if(i > center) {
					if(j>=i-center && j<= ((line-1)-(i-center))) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}else {
					if(j>=center-i && j<=center+i) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		// 2. 오른쪽 위
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		// 3. 오른쪽 아래
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < line - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		
	
		/*
		//4. 왼쪽 위
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < line; j++) {
				if (line-i>j+1) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println();
		*/
		
		// 4. 왼쪽 위
		for (int i = 0; i < line; i++) {
			for (int j = line; j > 0; j--) {
				if (j > i + 1) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println();

		// 5. 왼쪽 아래
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < line; j++) {
				if (i > j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}
}
