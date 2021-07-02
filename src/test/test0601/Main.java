package test.test0601;

public class Main {

	public static void main(String[] args) {
		
		StudentMap studentMap = new StudentMap();

		Student[] students = {
							new Student("111","순살치킨","@naver"),
							new Student("222","너무좋아","@hanmail"),
							new Student("333","무야","@google"),
							new Student("444","무야호","@daum"),
							new Student("555","땅땅이고자","@com")
		};
		
		studentMap.addStudents(students);
		studentMap.printByEntry();
		System.out.println();
		
		Student stu = new Student("666", "한진원", "han@");
		studentMap.addStudent(stu);
		studentMap.printByEntry();
		
		System.out.println();
		Student updateStuValue = new Student("777", "현식이고자", "goja@co.kr");
		studentMap.setStudent(stu, updateStuValue);
		studentMap.printByEntry();
		
		System.out.println();
		
		Student updateStuValue2 = new Student("888", "양아치", "achi@");
		studentMap.replace(stu.getStudentId(),updateStuValue2);
		studentMap.printByEntry();
		System.out.println();
		
		Student stu3 = new Student("newNum", "newName", "newEmail@");
		studentMap.replace2(stu.getStudentId(), updateStuValue2, stu3);
		System.out.println();
		studentMap.printByEntry();
		System.out.println();
		studentMap.removeStudent(stu.getStudentId());
		studentMap.printByEntry();
		
	}
}
