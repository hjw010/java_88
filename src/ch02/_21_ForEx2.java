package ch02;

import java.util.Scanner;

public class _21_ForEx2 {
	public static void main(String[] args) {
		
		// n 찾기  - count 에 갯수 누적
		Scanner input = new Scanner(System.in);
		System.out.println("문장을 입력하세요(영어로!!!) : ");
		String str = input.nextLine();
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)!='n') {
				continue;
			}
			count++;
		}
		System.out.println("n=" + count+"개");
		
		
	}
}
