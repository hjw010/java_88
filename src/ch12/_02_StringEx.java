package ch12;

public class _02_StringEx {
	public static void main(String[] args) {

		String str = "A Barking dong";
		String s1, s2, s3 ,s4 ,s5;
		
		//문자열 길이 : lnghth()
		System.out.println("문자열 길이 : " + str.length());
		
		//문자열 결합 : concat("연결할 문자열");
		s1 = str.concat(" died");
		System.out.println(s1);
		
		// 문자 교환 : replace(oldChar, newChar)
		s2 = s1.replace("g", "G");
		System.out.println(s2); //A BarkinG donG died
		
		//부분 문자열 : subString(beginIndex, endIndex) .. beginIndex(<=) , endIndext(<)
		s3 = s2.substring(5,12);
		System.out.println(s3); //kinG do

		//대소문자 변환 : toUooerCace();
		//소문자 변환 : toLowerCace();
		s4 = s2.toUpperCase();
		System.out.println(s4);
		s5 = s4.toLowerCase();
		System.out.println(s5);
		
		
		
		
		
		
		
		
	}
}
