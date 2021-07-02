package test;
public class _07_Sungjuk{
	private int kor;
	private int eng;
	private int math;

	public void setKor(int kor){
		this.kor=kor;
	}
	public void setEng(int eng){
		this.eng=eng;
	}
	public void setMath(int math){
		this.math=math;
	}
	
	public int getTotal(){
		return kor + eng + math;
	}
	
	public int getAvg(){
		return getTotal()/3;
	}









}