package test;
public class Student{

	private String studentId;
	private String name;
	private int age;
	private String hobby;

	public Student(){
	}

	public Student(String studentId, String name, int age, String hobby){
		this.studentId = studentId;
		this.name = name;
		this.age = age;
		this.hobby = hobby;
	}

	public void setStudentId(String studentId){
		this.studentId = studentId;
	}
	public void setName(String studentId){
		this.name = name;
	}
	public void setAge(String studentId){
		this.age = age;
	}
	public void setHobby(String studentId){
		this.hobby = hobby;
	}
	//get
	public String getStudentId(){
		return studentId;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getHobby(){
		return hobby;
	}

	public void showInfo(){
		System.out.println("학번 : " + studentId + ", 이름 : " + name + ", 나이 : " +age +", 취미 : " + hobby);
	}


}
