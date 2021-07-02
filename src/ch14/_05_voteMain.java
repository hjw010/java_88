package ch14;

public class _05_voteMain {

	public static void main(String[] args) {
		
		//객체 5개, 스레드5개
		//각각 영향을 받지 않고, 각자 일을 한다
		Thread loc1 =new Thread(new _05_VoteThread(), "서울");
		Thread loc2 =new Thread(new _05_VoteThread(), "경기");
		Thread loc3 =new Thread(new _05_VoteThread(), "인천");
		Thread loc4 =new Thread(new _05_VoteThread(), "충남");
		Thread loc5 =new Thread(new _05_VoteThread(), "충북");
		
		loc1.start();
		loc2.start();
		loc3.start();
		loc4.start();
		loc5.start();
		
	}
	
}
