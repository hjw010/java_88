package test.test0528;
public interface Library{

	//상수
	int STATE_BORROWED=0;
	int STATE_NORMAL=1;
	
	//추상 메서드
	void checkOut(String borrower, String checkOutDate);
	void checkIn();

}

