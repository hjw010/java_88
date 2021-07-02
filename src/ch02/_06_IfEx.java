package ch02;

import java.util.Scanner;

public class _06_IfEx {
	public static void main(String[] args) {
		
		/*
		 * 입장료
		 * age : 나이 입력
		 * charge : 요금
		 * grade : 단계
		 *  1~8세 : grade = "미취학 아동", charge = 1000;
		 *  ~13세 : grade = "초등학생" , charge = 2000;
		 *  ~19세 : grade = "청소년" , charge = 3000;
		 *  ~64세 : grade = "일반인" , ADULT_CHAGE :4000 - > charge 에 대입
		 *  ~65이상 : grade = "경로우대" , ADULT_CHAGE :4000에 20%할인-> charge에 대입
		 *  출력 형식 - > 나이 : age세 , 미취학아동 : grade, 입장료 charge; 
		 * */
		
		Scanner input = new Scanner(System.in);
		System.out.print("나이를 입력 하세요 : ");
		int age =input.nextInt();
		int charge=0;
		String grade="";
		final int ADULT_CHAGE=4000;
		
		if(age < 0) {
			System.out.println("올바른 나이를 입력 하세요");
		}else {
			if(age >= 65) {
				grade = "경로우대";
							// 4000 - 800
				charge = ADULT_CHAGE-((int)(ADULT_CHAGE*0.2));
				//charge = (int)(ADULT_CHAGE * 0.8F);
				
			}else if(age>=20) {
				grade ="일반인";
				charge = ADULT_CHAGE;
			}else if(age>=14) {
				grade ="청소년";
				charge = 3000;
			}else if(age>=9) {
				grade ="청소년";
				charge = 2000;
			}else {
				grade ="미취학아동";
				charge = 1000;
			}
		}
		//출력 형식 - > 나이 : age세 , grade : 미취학아동 , 입장료 charge; 
		System.out.println("나이 : " + age + ", grade : " + grade + ", 입장료 : "+charge);
		
		
		
		
		
		
		
		
		
		
	}
}
