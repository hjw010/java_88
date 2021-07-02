package ch02;

import java.util.Scanner;

public class _13_whileEx {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		// 1.초기값
		System.out.print("단 입력 : ");
		int dan = input.nextInt(); // dan * i
		// 2.조건식
		int i = 1;
		
		while (dan <= 9) {
			while (i <= 9) {
				if (i == 9) {
					System.out.print(dan + " * " + i + " = " + (dan * i));
					break;
				} else {
					System.out.print(dan + " * " + i + " = " + (dan * i) + ", ");
					// 3.증감식
					i++;
				}
			}
			System.out.println();
			i = 1;
			dan++;
		}
		
	
		
		
	
		
	}
}
