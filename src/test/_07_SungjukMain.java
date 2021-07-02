package test;

public class _07_SungjukMain{

	public static void main(String[] s){
		_07_Sungjuk sungjuk = new _07_Sungjuk();
		int kor = 70;
		int eng = 80;
		int math = 90;
		
		sungjuk.setKor(kor);
		sungjuk.setEng(eng);
		sungjuk.setMath(math);	
	
		System.out.println("국어 : " + kor + " 영어 : " +eng + " 수학 : " + math +
								" 총점 : total : "+sungjuk.getTotal() + " 평균 : " + sungjuk.getAvg());

		

	}
}