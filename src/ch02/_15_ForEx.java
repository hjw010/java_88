package ch02;

import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;

public class _15_ForEx {
	public static void main(String[] args) {
		/*
		 * 반복문 - 조건이 만족하는 동안 실행
		 * 
		 * for문의 기본 구조 for(초기값; 조건식; 증감식;){
		 *  수행문1; 수행문2; 
		 *  }
		 * 
		 */
		// 1~10까지 합
		System.out.print("합 : ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
				sum+=i;
				System.out.print("i : " + i + " sum : " + sum +", ");
		}
		
		for (int i = 1; i <= num; i++) {
			if (i==num) {
				System.out.println("i : " + i + " sum : " + sum +" 끝");
				break;
			}else {
				sum+=i;
				System.out.println("i : " + i + " sum : " + sum + ", ");
			}
		}
		
		
		
		
		input.close();
		
	}
}
