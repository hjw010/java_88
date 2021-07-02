package ch02;

import java.util.Scanner;

public class _19_ForEx {
	public static void main(String[] args) {
		
		/*
		 * continue문 예제
		 * continue문은 반복문과 함께 쓰인다.
		 * 반복문안에서 contiunue문을 만나면, 그 이후의 문장은 수행하지 않고,
		 * for문은 처음으로 돌아가 증감식을 수행한다.
		 * */
		//1~100까지의 홀수의 합 : total
		Scanner input = new Scanner(System.in);
		System.out.print("홀수의 합-1, 짝수의 합-2 :");
		int oddOrEven = input.nextInt();
		System.out.print("구하고 싶은 범위 입력 : ");
		int range = input.nextInt();
		
		int total=0;
		for (int i = oddOrEven; i <= range; i++) {
			if(i%2==0)
				continue;
			total+=i;
		}
		System.out.println(total);
		
		for (int i = 0; i < 100; i++) {
			
		}
		
	}
}
