package test;
import java.util.Scanner;

public class _03_whileEx{

	public static void main(String[] s){
		System.out.print(" 단 입력 :  ");
		//Sacnner input = new Scanner(System.in){
		Scanner input = new Scanner(System.in);
		//dan = input.nextInt();
		int dan = input.nextInt();
		int i = 1;
		int dann = dan + 7;
		while(dan <= dann){
			while(i <=9){
			System.out.print(dan + " * " + i +" = " + (dan*i) + " ");
			i++;	
			}
		dan++;
		//int i = 1;
		i = 1;
		System.out.println();
		}		
		input.close();		

	}
}