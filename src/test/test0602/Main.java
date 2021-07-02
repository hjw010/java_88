package test.test0602;

import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		/*
		try {
			Student student = callStudentInfo();
			student.showStudentInfo();
		} catch (InvalidNameException e) {
			System.out.println("이름 오류 메세지 : " +e.getMessage());
			e.showWrongName();
			return;
		} catch (InvalidScoreException e) {
			System.out.println("점수 오류 메세지 : " +e.getMessage());
			e.showWrongScore();
			return;
		}finally {
			scanner.close();
		}
		
		System.out.println();
		System.out.println("정상 흐름이면 호출됨");
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		*/
		
		try {
			Student student2 = callStudentInfoWithScores();
			student2.showStudentInfo2();
		} catch (InvalidNameException e) {
			System.out.println("이름 오류 메세지 : " + e.getMessage());
			e.showWrongName();
		} catch (InvalidScoreException e) {
			System.out.println("점수들 오류 메세지 : " + e.getMessage());
			e.showWrongScores();
		}finally {
			scanner.close();
		}
		System.out.println();
		System.out.println("정상 흐름시 호출");
		
	}
	

	public static Student callStudentInfo() throws InvalidNameException, InvalidScoreException {
		return new Student(callName(),callScore());
	}
	public static Student callStudentInfoWithScores() throws InvalidNameException, InvalidScoreException {
		return new Student(callName(),callScores());
	}
	
	
	
	public static String callName() throws InvalidNameException {
		System.out.println("이름 : ");
		String name = scanner.nextLine();
		if(name.equals(null) || name.equals("null") || name.length() < 2) {
			InvalidNameException nameException = new InvalidNameException("잘못된 값을 입력 하셨습니다.");
			nameException.setWrongName(name);
			throw nameException;
		}else {
			return name;
		}
	}
	
	public static int callScore() throws InvalidScoreException {
		System.out.print("점수 입력 : ");
		int score = scanner.nextInt();
		if(score < 0 || score > 100) {
			InvalidScoreException scoreException = new InvalidScoreException("잘못된 값을 입력 하셨습니다.");
			scoreException.setWrongScore(score);
			throw scoreException;
		}else {
			return score;
		}
	}
	
	
	public static int[] callScores() throws InvalidScoreException{
		int[] scores = new int[3];
		for (int i = 0; i < scores.length; i++) {
			System.out.println("점수" +i +" 입력 : ");
			scores[i] = scanner.nextInt();
			if(scores[i] < 0 || scores[i] > 100) {
				InvalidScoreException scoreException = new InvalidScoreException("잘못 입력된 점수 입니다.");
				scoreException.setWrongScore(scores);
				throw scoreException;
			}
		}
		return scores;
	}
	
}
