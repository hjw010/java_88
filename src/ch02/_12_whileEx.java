package ch02;

import java.util.Scanner;

public class _12_whileEx {

	public static void main(String[] args) {
		
		/*
		 * 구구단 출력
		 * ====2단====
		 * 2*1 = 2
		 * 2*9 = 18
		 * 
		 * */

		Scanner input = new Scanner(System.in);
		//1.초기값 
		System.out.print("단 입력 : ");
		int dan = input.nextInt();
		//2.조건식
		int i=1;
			while(i<=9) {
				if(i==9) {
					System.out.print(dan + " * " + i +" = " + (dan*i));
					break;
				}else {
					System.out.print(dan + " * " + i +" = " + (dan*i) +", ");
					//3.증감식
					i++;
				}
		}
		
		
		
	}
}
