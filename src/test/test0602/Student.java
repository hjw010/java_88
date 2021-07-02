package test.test0602;

import java.util.Iterator;

public class Student {

	private String name;
	private int score;
	private int[] scores;
	
	public Student() {
		super();
	}
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	public Student(String name, int[] scores) {
		super();
		this.name = name;
		this.scores = scores;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public void showStudentInfo() {
		System.out.println("이름 : " + name + " 점수 : " + score);
	}
	
	public void showStudentInfo2() {
		System.out.print("이름 : " + name);
		for (int i = 0; i < scores.length; i++) {
			System.out.print(" 점수"+ i +": " +scores[i] +", " );
		}
		
		
	}
	
}
