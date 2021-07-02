package test.test0528;
public class Main{

	public static void main(String[] s){
				
		SubBookInfo book = new SubBookInfo("1","노인과 바다","김흥국","","");
		book.checkOut("김덕배","2021-05-27");
		System.out.println("대여자 : "+book.getBorrower()+" 대여날 : "+book.getCheckOutDate());
		book.checkOut("김창중","2021-05-28");
		book.checkIn();
		System.out.println("대여자 : "+book.getBorrower()+" 대여날 : "+book.getCheckOutDate());
		book.checkIn();
	}
}