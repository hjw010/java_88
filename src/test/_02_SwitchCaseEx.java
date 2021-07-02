package test;
import java.util.Scanner;

public class _02_SwitchCaseEx{
	public static void main(String[] s){
		System.out.print("점수 입력 : ");
		//Scanner input = new Scanner();
		Scanner input = new Scanner(System.in);
		int score = input.nextInt();
		//char grade;
		char grade = ' ';
		if(score > 100 || score < 0 ){
			System.out.println("오류");
		}else{
			switch(score/10){
			case 10 : case 9 : grade='A';
				break;
			case 8 : grade = 'B';
				break;
			case 7 : grade = 'C';
				break;
			case 6 : grade = 'D';
				break;
			default : grade = 'F';
			}
		}
		System.out.println("점수 : " + score + ", 등급" + grade);
		//input.close()
		input.close();
	}
}