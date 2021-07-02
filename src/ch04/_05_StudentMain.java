package ch04;

public class _05_StudentMain {

	public static void main(String[] args) {

		_05_Student stu1 = new _05_Student();
		stu1.setStudentName("한진원");
		System.out.println(_05_Student.serialNum);
		System.out.println("학번 : " + stu1.getStudentId() + ", 이름 : " + stu1.getStudentName());
		
		_05_Student stu2 = new _05_Student();
		stu2.setStudentName("한봄");
		System.out.println(_05_Student.serialNum);
		System.out.println("학번 : " + stu2.getStudentId() + ", 이름 : " + stu2.getStudentName());
		
		
		_05_Student stu3 = new _05_Student();
		stu3.setStudentName("한가을");
		System.out.println(_05_Student.serialNum);
		System.out.println("학번 : " + stu3.getStudentId() + ", 이름 : " + stu3.getStudentName());
		
	}
}
