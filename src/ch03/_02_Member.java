package ch03;

public class _02_Member {

	//private - 생성자로 초기화 하거나 setter 로 초기화
	//멤버변수
	String name;
	String birthDay;
	int age;
	String address;
	
	//생성자
	public _02_Member() {
		
	}
	
	
	
	//멤버 메서드 - 멤버변수 값 출력
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("생일 : " + birthDay);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
	}
	
	
}
