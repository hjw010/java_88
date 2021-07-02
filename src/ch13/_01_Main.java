package ch13;

//467
public class _01_Main {

	public static void main(String[] args) {
		
		String s1 = "다이어트는 ";
		String s2 = "내일부터.";
		String s3 = "오늘은 치킨";
		
		_01_StringConcat concat = (ss1,ss2,ss3) -> System.out.println(s1+s2+s3);
												//{System.out.println(s1+s2+s3);};
		concat.makeString(s1, s2,s3);
		
		
	}
	
}
