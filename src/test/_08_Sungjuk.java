package test;
public class _08_Sungjuk{

	private int kor;
	private int eng;
	private int math;

	public _08_Sungjuk(){
	}

	public _08_Sungjuk(int kor, int eng, int math){
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public void setKor(int kor){
		this.kor = kor;
	}

	public void setEng(int eng){
		this.eng = eng;
	}

	public void setMath(int math){
		this.math = math;
	}

	public int getTotal(){
		return kor+eng+math;
	}

	public double getAvg(){
		return getTotal()/3.0;
	}

	public char getGrade(){
		char grade =' '; 
		switch((int)getAvg()/10){
			case 10 :
			case 9 : grade = 'A';
				break;
			case 8 : grade = 'B';
				break;
			case 7 : grade = 'C';
				break;	
			case 6 : grade = 'D';
				break;
			default : grade = 'F';
		}
		return grade;	
	}

	public void printInfo(){
		System.out.println(kor +" "+ eng +" "+ math +" "+ getTotal() +" "+ getAvg() +" "+ getGrade());
	}











}