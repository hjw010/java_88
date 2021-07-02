package ch03;

public class _01_StudentMain {

	public static void main(String[] args) {
		
		/*
		 * 인스턴스 생성 : 클레스명 참조변수명 = new 클레스명(생성자);  참조변수명(4바이트의 인트형(주소값`)) 
		 * 			접근: 참조번수명.멤버변수
		 * 			     참조번수명.멤버메소드
		 * - 참조변수명에는 생성한 인스턴스의 힙메모리공간 주소값이 들어있다. 스택메모리에 생성
		 * - 앞의 클래스명은 데이터 타입이고, 참조변수로 접근할 때 사용한다.
		 * - 두의 클래스명은 힙메모리에 인스턴스 생성시 사용되는 생성자이다.
		 * 
		 */
		
		_01_Student lee = new _01_Student();
		
		//멤버 변수에 값할당
		lee.studentId = 202101;
		lee.studentName = "이";
		lee.grade = 1;
		lee.address = "서울";
		lee.email = "lee@naver.com";
		//메서드 출력
		lee.printInfo();
		System.out.println("*************************************************");
		
		_01_Student park = new _01_Student();
		park.studentId = 202001;
		park.studentName = "박";
		park.grade = 2;
		park.address ="경기";
		park.email = "park@naver.com";
		park.printInfo();
		
		
		
		
		
		
		
		
		
		
		
	}

}
