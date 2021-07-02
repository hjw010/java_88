package ch04;

public class _04_StudentMain {

	public static void main(String[] args) {

		_04_Student stu1 = new _04_Student();
		stu1.setStudentId(_04_Student.serialNum);
		stu1.setStudentName("한진원");
		stu1.printInfo();
		
		_04_Student stu2 = new _04_Student();
		stu2.setStudentId(_04_Student.serialNum);
		stu2.setStudentName("김진원");
		stu2.printInfo();
		
		
		
		
	}
}
