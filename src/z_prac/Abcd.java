package z_prac;

public class Abcd {

	public static void main(String[] args) {
	
		
		int line = 21;
		int center = line/2;
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < line; j++) {
				if(i > center) {
					if(j>=i-center && j<= ((line-1)-(i-center))) {
						System.out.print("★");
					}else {
						System.out.print("☆");
					}
				}else {
					if(j>=center-i && j<=center+i) {
						System.out.print("★");
					}else {
						System.out.print("☆");
					}
				}
			}
			System.out.println();
		}
		
		
		
	}
}
