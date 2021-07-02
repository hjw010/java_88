package ch05;

public class _06_Array {

	public static void main(String[] args) {
		
		int [][] intArry = {
						{1,2,3},
						{4,5,6}
						};
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3 ; j++) {
				System.out.print(intArry[i][j]);
			}
			System.out.println();
		}
		
		
	}
	
}
