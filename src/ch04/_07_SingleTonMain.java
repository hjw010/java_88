package ch04;

public class _07_SingleTonMain {

	public static void main(String[] args) {

		
		_07_Company company = _07_Company.getInstance();
		company.setCompanyName("삼성");
		company.setAddress("서울");
		company.setTelno("112-112");
		company.printInfo();
		System.out.println(company);

		_07_Company company2 = _07_Company.getInstance();
		company2.setCompanyName("현대");
		company2.setAddress("경기");
		company2.setTelno("119-119");
		company2.printInfo();
		System.out.println(company2);
		
		
		
	}

}
