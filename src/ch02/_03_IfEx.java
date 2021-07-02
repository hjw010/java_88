package ch02;

public class _03_IfEx {
	public static void main(String[] args) {
		
		// score가 60점 이상이면 "합격", 60점 미만이면 "불합격", 40점 미만이면 "과락"을 reuslt 변수에 출력
		// 방법1. IF문 이용
		int score = 39;
		String result="";
		
		if(score >= 60) {
			result = "합격";
		}else if(score < 40) {
			result = "과락";
		}else{
			result = "불합격";
		}
		System.out.println(result);
		
		
		if(score >= 60) {
			result = "합격";
		}else if(score < 60 && score > 40) {
			result = "불합격";
		}else{
			result = "과락";
		}
		System.out.println(result);
		
		
		
		// 방법2. 3항 연산자를 이용해서 출력
		// 결과 = 조건식 ? 참결과 : 거짓결과
	 	result = (score >=60)?"합격":((score >= 40)?"불합격":"과락"); 
		System.out.println(result);
	}

}
