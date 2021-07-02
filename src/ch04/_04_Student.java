package ch04;

//static
public class _04_Student {

	// static 변수
	public static int serialNum = 1000;
	
	//멤버변수
	public int studentId; //학번
	public String studentName; //이름
	
	//생성자
	public _04_Student() {
		serialNum++;
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

	public void printInfo() {
		System.out.println("넘버 : "+serialNum + ", 학번 : " + studentId + ", 이름 : "  +studentName);
	}
	
	
}
