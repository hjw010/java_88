package ch04;

import java.util.Scanner;

public class _02_Sungjuk2Main {

	public static void main(String[] args) {

	
		int kor = 70;
		int eng = 65;
		int math = 55;
		//인스턴스 생성
		_02_Sungjuk sungjuk = new _02_Sungjuk();
		sungjuk.setKorScore(kor);
		sungjuk.setEnghScore(eng);
		sungjuk.setMathScore(math);
		
		int total = sungjuk.getTotal();
		int avg = sungjuk.getAvg();
		//국,영,수,총점,평균
		System.out.println("------성적 출력------------");
		
		System.out.print("수학 : " + math +" " + " 영어 : " + eng+ " 국어 : " + kor +" " );
		System.out.println(", 총점 : " + total +" " + "평균 : " + avg);
		
		
		_02_Sungjuk sungjuk2 = new _02_Sungjuk(32,48,79);
		System.out.print("총점 " + sungjuk2.getTotal() + " ");
		System.out.println("평균 " + sungjuk2.getAvg());
		
	
		
	}

}
