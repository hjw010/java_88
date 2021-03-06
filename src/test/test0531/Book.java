package test.test0531;

public class Book {

	private int bookNo;
	private String title;
	private String author;
	
	public Book() {
	}
	public Book(int bookNo,String title, String author) {
		this.bookNo = bookNo;
		this.title =title;
		this.author = author;
	}
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "책 번호 : " + bookNo + ", 책 제목 : " + title +
				", 작가 : " +author;
	}
	
	
	
	
}
