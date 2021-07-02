package ch07;
//부모
public class _07_CDInfo {
	//멤버 변수
	private String registerNo; //등록번호
	private String title; //타이틀
	
	public _07_CDInfo() {
	}
	
	public _07_CDInfo(String registerNo, String title) {
		super();
		this.registerNo = registerNo;
		this.title = title;
	}
	
	public String getRegisterNo() {
		return registerNo;
	}
	
	public void setRegisterNo(String registerNo) {
		this.registerNo = registerNo;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
}
