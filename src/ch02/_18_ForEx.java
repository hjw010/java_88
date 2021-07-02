package ch02;

import java.util.Scanner;

public class _18_ForEx {

	public static void main(String[] args) {
		
		//2~20까지의 짝수 합계
		Scanner input = new Scanner(System.in);
		System.out.print("홀수의 합을 구하고싶으면 1, 짝수의 합을 구하고싶으면 2를 입력하세요 :");
		int oddEven = input.nextInt();
		System.out.print("구하고 싶은 범위 입력 : ");
		int range = input.nextInt();
		
		int sum=0;
		for (int i = oddEven; i <= range; i+=2) {
			sum+=i;
		}
		System.out.println(sum);
			
		input.close();
	}
}
