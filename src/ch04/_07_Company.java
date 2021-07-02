package ch04;

public class _07_Company {

	/*
	 * [면접] 싱글톤 패턴
	 * 동일한 인스턴스를 단 하나만 생성하는 디자인 패턴
	 * 접근할 클레스에 여러 메서드가 있을때 외부 클레스가 해당 메서드에 접근할 때마다
	 * 인스턴스 생성할 필요 없이 getInstance()를 통해 객체를 리턴받아 사용
	 * 
	 * - 싱글톤패턴 생성
	 * 	1. 생성자를 private설정
	 * 	2. 클래스 내부에 static으로 유일한 인스턴스 생성
	 *  3. 외부에서 참조할 수 있는 public 메서드 만들기
	 * 
	 * -호출
	 * 외부클래스명 참조변수 = 외부클래스명.getInstance();
	 * 예) _07_Company company = _07_Company.getInstance();
	 * 
	 * 
	 * */
	//맴버변수
	private String companyName;
	private String address;
	private String telno;
	
	//2.클래스 내부에서 인스턴ㅅ흐 생성
	private static _07_Company company = new _07_Company();
	//1. 생성자 암호화
	private _07_Company() {}
	
	//3.외부에서 참조할 수 있는 public 메서드 작성
	
	public static _07_Company getInstance() {
		if(company==null) {
			company = new _07_Company();
		}
		return company;
	}
	
	//setter
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setTelno(String telno) {
		this.telno = telno;
	}
	
	//멤버메서드
		public void printInfo(){
			System.out.println(companyName +" "+ address +" "+ telno);
		}

	
	
	
	
	
	
	
	
	
	
	
}
