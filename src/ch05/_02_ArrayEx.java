package ch05;

public class _02_ArrayEx {
	public static void main(String[] args) {
		
		String[] drink = new String[5];
		drink[0]="사과주스";
		drink[1]="딸기주스";
		drink[2]="배주스";
		drink[3]="포도주스";
		drink[4]="복숭아주스";
		
		String[] drink2 = new String[]{"사과커피","딸기커피","배커피","포도커피","복숭아커피"};
		
		String[] drink3 = {"사과즙","딸기즙","배즙","포도즙","복숭아즙"};
		
		for (int i = 0; i < drink.length; i++) {
			System.out.print(drink[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < drink2.length; i++) {
			System.out.print(drink2[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < drink3.length; i++) {
			System.out.print(drink3[i] + " ");
		}
		
		
	}
}
