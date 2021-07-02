package z_prac;

import java.util.Iterator;

public class Student{

	private int studentId;
	private String name;
	private String email;
	
	public Student(){
	}

	public Student(int studentId, String name, String email){
		this.studentId = studentId;
		this.name = name;
		this.email = email;
	}

	public int getStudentId(){
		return studentId;
	}
	public String getName(){
		return name;
	}
	public String getEmail(){
		return email;
	}

	/*
	@Override
	public String toString(){
		return "학번 : " +studentId + " " + " 이름 : " + name + " " + " 이메일 : " + email;
	}
	*/

	@Override
	public int hashCode() {
		return studentId;
	}
	
	public static void main(String[] args) {
		
		Student[] stuArray = {
			new Student(1,"한진원","han@com"),
			new Student(1,"한진원","han@com"),
			new Student(1,"한진원","han@com"),
			new Student(1,"한진원","han@com")
		};
		
		for (Student student : stuArray) {
			System.out.println(student.hashCode());
		}
		
		
		
		
		
	}

}