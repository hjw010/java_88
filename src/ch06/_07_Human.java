package ch06;


public class _07_Human extends _07_Animal {

	 public _07_Human() {
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
