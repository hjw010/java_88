package ch02;

import java.util.Scanner;

public class _05_IfEx {
	public static void main(String[] args) {
		/*
		 * 학점구하기
		 * 
		 * 1. 점수는 score 변수, 학점은 grade 변수
		 * 2. 점수가 90점 이상이면 A
		 *    점수가 80점 이상이면 B
		 *    점수가 70점 이상이면 C
		 *    점수가 60점 이상이면 D
		 *    점수가 60점 미만이면 F
		 * 3. 결과 => 점수 : 80, 학점 : B
		 */
		
		// 힙메모리에 Scanner(객체 즉 인스턴스)를 생성하고, 그 주소값을 scan에 대입
		// 클래스명 참조변수 = new 클래스명(System.in);
		// 참조변수.메서드명
		// nextInt() : 콘솔에서 입력받은 정수를 읽어들임
		Scanner input = new Scanner(System.in);
		String name;
		int score;
		System.out.print("점수 입력 : ");
		score = input.nextInt();
		char grade;
		
		// score가 100보다 크면서 0보다 작을수 없으니까 ||  (&& 아님)
		// 100보다 큰 경우 이거나 0보다 작은 경우 || 하나만 만족
		// 100보다 큰 경우 이고 0보다 작은 경우 && 둘다만족 
		if(score>100 || score<0) {
			System.out.println("잘못된 점수 입니다. 다시 입력 : ");
		}else {
			if(score>=90 && score<=100) {
				grade = 'A';
			}else if(score>=80 && score<90) {
				grade = 'B';
			}else if(score>=70 && score<80) {
				grade = 'C';
			}else if(score>=60 && score<70){
				grade = 'D'; 
			}else {
				grade = 'F';
			}
			System.out.println("점수 : " + score + ", 학점 : " + grade);
		}
		
		
		
		input.close();
	}
}
