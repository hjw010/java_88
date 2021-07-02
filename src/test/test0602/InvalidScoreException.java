package test.test0602;

public class InvalidScoreException  extends Exception{

	private int wrongScore;
	private int[] wrongScores;
	
	
	public InvalidScoreException(String message) {
		super(message);
	}
	public int getWrongScore() {
		return wrongScore;
	}
	public void setWrongScore(int wrongScore) {
		this.wrongScore = wrongScore;
	}
	
	
	public void setWrongScore(int[] wrongScores) {
		this.wrongScores = wrongScores;
	}
	
	public void showWrongScore() {
		System.out.println("잘못 입력된 점수 : " + wrongScore);
	}
	public void showWrongScores() {
		System.out.println("잘못 입력된 점수 : " + wrongScores);
	}
	
	
	
	
	
	
	
}
