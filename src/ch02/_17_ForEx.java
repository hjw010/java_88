package ch02;

import java.util.Scanner;

public class _17_ForEx {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int num2 = num + 8;
		for (int i = num; i < num2; i++) {
				for (int j = 1; j <= 9; j++) {
					if (j==9) {
						System.out.print(i + "*" + j + "=" + (i * j) + "  ");
						break;
					}else {
						System.out.print(i + "*" + j + "=" + (i * j) + ", ");
					}
				}
			System.out.println();
		}

	}

}
