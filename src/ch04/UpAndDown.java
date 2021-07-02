package ch04;

import java.util.Scanner;

public class UpAndDown {

	public UpAndDown() {

	}

	public UpAndDown(int a,String b) {

	}

	public UpAndDown(String a, int b) {

	}

	public static void main(String[] args) {

		int random = 32;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.print("숫자 입력 : ");
			int input = scanner.nextInt();

			if (random > input) {
				System.out.println("업");
			} else if (random < input) {
				System.out.println("다운");
			} else {
				System.out.println("정답");
				break;
			}
		} while (true);

	}

}
