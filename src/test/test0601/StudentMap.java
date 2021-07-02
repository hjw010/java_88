package test.test0601;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StudentMap {
	Map<String, Student> map;

	public StudentMap() {
		map = new HashMap<String, Student>();
	}

	public void addStudent(Student stu) {
		map.put(stu.getStudentId(), stu);
	}
	
	public void addStudents(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			map.put(students[i].getStudentId(), students[i]);
		}
	}

	public boolean removeStudent(String studentId) {
		if (map.containsKey(studentId)) {
			map.remove(studentId);
			System.out.println("삭제 완료");
			return true;
		}
		System.out.println("데이터가 존재하지 않습니다.");
		return false;
	}

	public void setStudent(Student oldStu, Student newStu) {
		if (map.containsKey(oldStu.getStudentId())) {
			map.put(oldStu.getStudentId(), newStu);
			System.out.println("업데이트 완료");
		}
	}
	/*
	public void setStudent2(Student stu, String name , string email) {
		if (map.containsKey(stu.getStudentId())) {
			Student stu2 = new Student(stu.getStudentId(),name,email);
			map.put(stu.getStudentId(), stu2);
			System.out.println("업데이트 완료");
		}
	}
	*/
	public Student replace(String key, Student stu) {
		return map.replace(key, stu);
		
	}
	
	public void replace2(String key, Student oldStu ,Student newStu) {
		map.replace(key, oldStu,newStu);
	}
	 
	public void printByIterator() {
		Iterator<String> itr = map.keySet().iterator();
		while (itr.hasNext()) {
			String key = itr.next();
			System.out.println(map.get(key));
		}
	}

	public void printByEntry() {
		for(Map.Entry<String, Student> entry  : map.entrySet()) {
			System.out.println("키 : " + entry.getKey() + " 값 : " +entry.getValue());
		}
	}
	
	public void printByEntry2() {
		Set<Map.Entry<String, Student>> entries = map.entrySet();
		Iterator<Map.Entry<String, Student>> itr = entries.iterator();
		while (itr.hasNext()) {
			Map.Entry<String, Student> entry = itr.next();
			System.out.println("키 : " + entry.getKey() + " 값 : " + entry.getValue());
		}
	}

}