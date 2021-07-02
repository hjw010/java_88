package test.test0531;

import java.util.ArrayList;
import java.util.List;

public class BookArrayList {

	private List<Book> list;
	
	public BookArrayList() {
		list = new ArrayList<Book>();
	}
	
	public void add(Book book) {
		list.add(book);
	}
	
	public boolean delete(int bookId) {
		for (int i = 0; i < list.size(); i++) {
			int bookNum = list.get(i).getBookNo();
			if(bookId == bookNum) {
				list.remove(i);
				System.out.println("책 번호 - " + bookNum + " 삭제성공");
				//break; <<--여기서의 break는 if문만 나가는것 메소드를 끝내는게아님
				return true;
			}
		}
		System.out.println("삭제실패");
		return false;
	}
	
	public void showAllBook() {
		for(Book book : list) {
			System.out.println(book + " ");
		}
	}
	
	
}
