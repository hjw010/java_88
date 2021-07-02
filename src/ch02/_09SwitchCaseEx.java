package ch02;

import java.util.Scanner;

public class _09SwitchCaseEx {
	public static void main(String[] args) {
		
		//Test2.
		//학점구하기 (_05_IfEx.java의 if문을 switch case 문으로 변경)
		
		Scanner input = new Scanner(System.in);
		System.out.print("점수 : ");
		int score = input.nextInt();
		char grade;
		
		if(score>100 || score<0) {
			System.out.println("오류");
		}else {
			switch(score/10) {
			case 9 : case 10 : grade = 'A';
				break;
			case 8 : grade = 'B';
				break;
			case 7 : grade = 'C';
				break;
			case 6 : grade = 'D';
				break;
			default : grade = 'F';
		}
		System.out.println("점수 : " + score + ", 학점 : " + grade);
		input.close();
		}
		
	
		
		
		
		
		
	}
	
}
