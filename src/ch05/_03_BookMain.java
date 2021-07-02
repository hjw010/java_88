package ch05;

public class _03_BookMain {

	public static void main(String[] args) {
		
		_03_Book[] library = new _03_Book[5];
		library[0]= new _03_Book("기러기의 꿈","기러기");
		library[1]= new _03_Book("갈매기의 꿈","갈매기");
		library[2]= new _03_Book("앵무새의 꿈","앵무새");
		library[3]= new _03_Book("비둘기의 꿈","비둘기");
		library[4]= new _03_Book("제비의 꿈","제비");
		
		for (int i = 0; i < library.length; i++) {
				library[i].showBookInfo();
		}
		
		
		
	}
	
	
}
