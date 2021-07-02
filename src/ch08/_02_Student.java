package ch08;

public class _02_Student{

	private int studentId;
	private String name;
	
	public _02_Student(){
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof _02_Student) {
			_02_Student stu = (_02_Student)obj;
			 if(this.studentId == stu.getStudentId() && this.name.equals(stu.getName())) {
				 return true;
			 }else {
				 return false;
			 }
		}else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		
		return studentId;
	}
	
	public _02_Student(int studentId, String name){
		this.studentId = studentId;
		this.name = name;
	}

	public int getStudentId(){
		return studentId;
	}
	public String getName(){
		return name;
	}

	@Override
	public String toString(){
		return "학번 : " +studentId + " " + " 이름 : " + name + " ";
	}

}