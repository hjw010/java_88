package ch02;

import java.util.Scanner;

public class _16_ForEx {
	public static void main(String[] args) {
		
		System.out.print("단 입력 : ");
		Scanner input = new Scanner(System.in);
		int dan = input.nextInt();
		for (int i = 1; i < 10; i++) {
			System.out.print(dan +"*" + i +"="+ (dan*i)+", ");
		}
		
		int a = input.nextInt();
		System.out.println(a);
		input.close();
	}
}
