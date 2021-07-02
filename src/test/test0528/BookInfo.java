package test.test0528;
//부모 클레스
public class BookInfo{

	private String registerNo; //등록번호
	private String title; //타이틀
	private String author; //작가

	public BookInfo(){}

	public BookInfo(String registerNo, String title, String author){
		this.registerNo = registerNo;
		this.title = title;
		this.author = author;
	}

	public void setRegisterNo(String registerNo){
		this.registerNo = registerNo;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public void setAuthor(String author){
		this.author = author;
	}
	public String getRegisterNo(){
		return registerNo;
	}
	public String getTitle(){
		return title;
	}
	public String getAuthor(){
		return author;
	}
	
}

