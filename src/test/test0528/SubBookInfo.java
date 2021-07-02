package test.test0528;
public class SubBookInfo extends BookInfo implements Library{
	
	private String borrower;	//대출자
	private String checkOutDate; //대출일자
	private int state;		 //대출 여부

	public SubBookInfo(){
	}
	
	public SubBookInfo(String registerNo, String title, String author, String borrower,String checkOutDate){
		super(registerNo,title,author);
		this.borrower = borrower;
		this.checkOutDate = checkOutDate;
		this.state = STATE_NORMAL;
	}

	@Override
	public void checkOut(String borrower, String checkOutDate){
		System.out.println("=========================");
		if(state == STATE_NORMAL){
			this.borrower = borrower;
			this.checkOutDate = checkOutDate;
			bookInfo();
			state = STATE_BORROWED;
		}else{
			System.out.println("대출상태 : 대출중");
			System.out.println("대출할 수 없습니다.");
		}
	
	}
	
	@Override
	public void checkIn(){
		System.out.println("=========================");
		if(state == STATE_BORROWED){
			System.out.println("****정상 반납되었습니다.****");
			System.out.println("대출상태 : 대여가능");
			bookInfo();
			this.borrower= null;
			this.checkOutDate =null;
			state = STATE_NORMAL;
		}else{
			System.out.println("이미 반납되었습니다.");
		}

	}
	
	public void bookInfo(){
		System.out.println("책이름 : " +super.getTitle());
		System.out.println("작가 : " +super.getAuthor());
		System.out.println("대출인 : " + borrower);
		System.out.println("대출일 : " + checkOutDate);
	}

	public String getBorrower() {
		return borrower;
	}

	public void setBorrower(String borrower) {
		this.borrower = borrower;
	}

	public String getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
	}




}