package z_prac;

public class Abc {

	public static void main(String[] args) {
		
		String str = "str";
		char ch = str.charAt(0);
		String str2;
		
		System.out.println(ch);
		
		if ((ch >='A' && ch <= 'Z') && (ch >='a' && ch<='z') ) {
			
		}
		if (ch >='A' && ch <= 'z') {
			
		}
		
		for (int i = 0; i < 10; i++) {
			for (int j = 10; j > 0; j--) {
				if (j>i+1) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println();
		
	}
	
	
	
}
