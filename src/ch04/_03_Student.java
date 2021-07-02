package ch04;

public class _03_Student {

	//변수
	private String studentId;
	private String studentName;
	private int score;
	
	
	//디폴트 생성자
	public _03_Student() {
	}
	//매개변수 생성자
	public _03_Student(String studentId, String studentName, int score) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.score = score;
	}
	//setter getter
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public _03_Student getInstance() {
		return this;
	}
	
	//출력 메소드
	public void printInfo(){
		System.out.println("학번 : " +studentId + ", 이름 : " + studentName + ", 점수 : " +score +"점");
	}
	
}
