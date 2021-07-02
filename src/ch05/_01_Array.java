package ch05;

import java.util.Iterator;

public class _01_Array {

	public static void main(String[] args) {
	
		// 배열(Array)- 대량의 동일한 데이터를 한"꺼번에 순차적으로 저장할 수 잇는 저장장소이다
		
		//배열자료형[] 비열명 = new 배열자료형[배열갯수];
		int[] scores = new int[5];
		scores[0]=10;
		scores[1]=20;
		scores[2]=30;
		scores[3]=40;
		scores[4]=50;
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println("score["+i+"]"+scores[i]);
		}
		
		
		
	}
}
