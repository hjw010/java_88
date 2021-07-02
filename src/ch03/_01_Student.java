package ch03;

public class _01_Student {

	/*
	 * 클레스 : 객체에 대한 설꼐도 디자인
	 * 		 멤버변수(속성,필드) , 멤버메소드(기능,동작) + 생성자
	 *
	 * 클레스는 설계도(디자인)이며, 인스턴스는 이 설계도를 바탕으로 만들어진 힙메모리 공간이다.
	 *		1.그 결과 주소값이 만들어지며, 참조변수에 할당된다.
	 *		객체는 인스턴스라고도 한다.
	 * 
	 * */
	
	//멤버 변수 - 속성
	//학번, 이름, 학년, 주소
	
	int studentId; //학번
	String studentName; //이름
	int grade; //학년
	String address; //주소
	String email;
	
	public void printInfo() {
		System.out.println(studentId);
		System.out.println(studentName);
		System.out.println(grade);
		System.out.println(address);
		System.out.println(email);
	}
	
}
