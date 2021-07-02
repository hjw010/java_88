package test;
import java.util.Scanner;

public class _02_whileEx{
	public static void main(String[] s){
		System.out.print("단 입력 : ");
		Scanner input = new Scanner(System.in);
		int dan = input.nextInt();
		int i=1;
		
		while(i<=9){
			System.out.print(dan +" * " + i + " = " +(dan*i) + " ");
			i++;
		}
		//input.close()
		input.close();
		
	}

}