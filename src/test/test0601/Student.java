package test.test0601;

public class Student{

	private String studentId;
	private String name;
	private String email;
	
	public Student(){
	}

	public Student(String studentId, String name, String email){
		this.studentId = studentId;
		this.name = name;
		this.email = email;
	}

	public String getStudentId(){
		return studentId;
	}
	public String getName(){
		return name;
	}
	public String getEmail(){
		return email;
	}

	@Override
	public String toString(){
		return "학번 : " +studentId + " " + " 이름 : " + name + " " + " 이메일 : " + email;
	}
	

}