package ch04;

public class _06_StudentMain {

	public static void main(String[] args) {

		_06_Student stu1 = new _06_Student();
		stu1.setStudentName("한진원");
		System.out.println(_06_Student.serialNum);
		System.out.println("학번 : " + stu1.getStudentId() + ", 이름 : " + stu1.getStudentName());
	
		
		_06_Student stu2 = new _06_Student();
		stu2.setStudentName("한가을");
		System.out.println(_06_Student.serialNum);
		System.out.println("학번 : " + stu2.getStudentId() + ", 이름 : " + stu2.getStudentName());
		
		_06_Student stu3 = new _06_Student();
		stu3.setStudentName("한봄");
		System.out.println(_06_Student.serialNum);
		System.out.println("학번 : " + stu3.getStudentId() + ", 이름 : " + stu3.getStudentName());
	}
}
