package ch04;

//static
public class _05_Student {

	// static 변수
	public static int serialNum = 1000;
	
	//멤버변수
	private int studentId; //학번
	private String studentName; //이름
	
	//생성자
	public _05_Student() {
		studentId = ++serialNum;
	}
	
	//getter setter
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	
	
}
