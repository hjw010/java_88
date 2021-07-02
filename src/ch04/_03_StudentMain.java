package ch04;

public class _03_StudentMain {

	public static void main(String[] args) {

		//인스턴스생성
		_03_Student stu = new _03_Student();
		//디폴트 호출
		stu.setStudentId("14-710890");
		stu.setStudentName("한진원");
		stu.setScore(75);
		stu.printInfo();
		System.out.println(stu);
		System.out.println(stu.getInstance());
		
		//매개변수생성자 호출
		_03_Student stu2 = new _03_Student("1541","김진원",85);
		System.out.println("학번 : " +stu2.getStudentId() + ", 이름 : " + stu2.getStudentName()
							+ ", 점수 : " +stu2.getScore() +"점");
		
		_03_Student stu3 = new _03_Student();
		System.out.println(stu);
		System.out.println(stu.getInstance());
		
		
	}

}
