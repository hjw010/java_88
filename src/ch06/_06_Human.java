package ch06;


public class _06_Human extends _06_Animal {

	 public _06_Human() {
	 }

	 //재정의
	 @Override
	 public void move() {
		 System.out.println("사람이 걷는다");
	 }
	 
	 public void readBook() {
		 System.out.println("사람이 읽는다");
	 }
	 
	 
}
