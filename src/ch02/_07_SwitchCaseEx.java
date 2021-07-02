package ch02;

public class _07_SwitchCaseEx {

	public static void main(String[] args) {
		
		/**
		 * 조건
		 * switch(조건){  <--- 조건 : 조건식(ex_변수/2 etc...) , 변수
		 * 
		 * 	case 값1 : 수행문1;
		 * 			   break;
		 * 	case 값2 : 수행문2;
		 * 			   break;
		 * 	case 값3 : 수행문3;
		 * 			   break;
		 * 	default : 수행문4;
		 * 
		 * }
		 * 
		 * */
		//ranking 에 따른 메달 출력
		// ranking - 1 -금 
		// ranking - 2 -은 
		// ranking - 3 -동 
		// 그외 - 참가상 
		int ranking = 3;
		// medal 1등 : 금메달
		String medal="";
		switch(ranking){
			case 1 : medal ="금메달"; 
					break;
			case 2 : medal ="은메달";
					break;
			case 3 : medal ="동메달";
					break;
			default : medal ="참가상";
		}
		System.out.println(ranking+ " : " + medal);
		
	}
}
