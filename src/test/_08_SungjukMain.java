package test;

public class _08_SungjukMain{

	public static void main(String[] s){
		
		_08_Sungjuk sungjuk = new _08_Sungjuk();
		sungjuk.setKor(81);
		sungjuk.setEng(70);
		sungjuk.setMath(60);
		sungjuk.printInfo();
		System.out.printf("%6.2f" , sungjuk.getAvg());
		System.out.println();

		_08_Sungjuk  sungjuk2 = new _08_Sungjuk(61,60,54);
		sungjuk2.printInfo();
	}

}