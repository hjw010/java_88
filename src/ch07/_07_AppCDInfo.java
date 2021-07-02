package ch07;

//자식클레스 부모 상속및 인터페이스 구현
public class _07_AppCDInfo extends _07_CDInfo implements _07_Lendable{
	
	private String borrower; //대출자
	private String checkOutDate; //대출일자
	private int state; //대출 여부
	public _07_AppCDInfo() {
		super();
	}
	public _07_AppCDInfo(String registerNo, String title,String borrower,String checkOutDate) {
		super(registerNo, title);
		this.borrower = borrower;
		this.checkOutDate = checkOutDate;
		state = _07_Lendable.STATE_NORMAL;
	}
	@Override
	public void checkOut(String borrower, String checkOutDate){
		System.out.println("=============================");
		this.borrower = borrower;
		this.checkOutDate = checkOutDate;
		if(state == _07_Lendable.STATE_NORMAL) {
			bookInfo();
			System.out.println("대출인 : " + borrower);
			System.out.println("대출일 : " + checkOutDate);
			state = _07_Lendable.STATE_BORROWED;
		}else {
			System.out.println("대출상태 : 대출중");
			System.out.println("대출시 : 대출할 수 없습니다.");
		}
	}
	@Override
	public void checkIn() {
		System.out.println("=============================");
		if(state==_07_Lendable.STATE_BORROWED){
			System.out.println("반납 되었습니다.");
			bookInfo();
			state = _07_Lendable.STATE_NORMAL;
		}else {
			System.out.println("반납시 : 반납할 수 없습니다.");
			System.out.println("대출상태 : 대출가능.");
		}
	}
	
	public void bookInfo() {
		System.out.println("대출 번호 : " + super.getRegisterNo());
		System.out.println("책이름 : " + super.getTitle());
	}

	
	

}
