package ch04;

//static
public class _06_Student {

	// static 변수
	public static int serialNum = 1000;
	
	//멤버변수
	private int studentId; //학번
	private String studentName; //이름
	
	//생성자
	public _06_Student() {
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
	//추가
	
	public static void setSerialNum(int serialNum) {
		_06_Student.serialNum = serialNum;
	}
	
	//스테틱 메서드에서 멤버변수 사용 불가, 인스턴스변수는 인스턴스가 생성될떼 메모리에 올라가지만 스테틱 변수 및 메소드는 클레스가 로딩될때 올라가기 때문에
	// 스테틱 멤버가 존재할때에 인스턴스 멤버가 존재 하지 않는다 ... but 스테틱 메소드에서 인스턴스 객체생성하면 가능 
	public static int getSerialNum() {
		return _06_Student.serialNum;
	}
//	public static String getSerialName() {
//		return studentName;
//	}
	
}
