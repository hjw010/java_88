package ch05;

public class _07_Array {
public static void main(String[] args) {
		
		int[][] scores = {
				{88,80,70},
				{70,85,65},
				{90,83,82},
				{75,82,73},
				{85,91,99},
		};
		int korTot=0;
		int engTot=0;
		int mathTot=0;
		int tot=0;
		double avg=0;
		char grade = ' ';
		System.out.println("성적표");
		System.out.println("번호 " + " 국어" +" 영어"+"  수학"+"  총점"+"   평균"+"   학점");
		for (int i = 0; i < scores.length; i++) {
			System.out.print(i+1 + ". ");
			for (int j = 0; j < scores[i].length; j++) {
				tot+= scores[i][j];
				avg = tot/3.0;
				if(avg>=90) {
					grade = 'A';
				}else if(avg>=80) {
					grade = 'B';
				}else if(avg>=70) {
					grade = 'C';
				}else {
					grade ='D';
				}
				System.out.print(" "+ scores[i][j]+" ");
			}
			System.out.print(tot);
			System.out.printf("%6.2f" ,avg);
			System.out.println(" "+ grade);
 			tot=0;
 			korTot += scores[i][0];
			engTot += scores[i][1];
			mathTot += scores[i][2];
		}
		System.out.println("국어 총점 : " + korTot + ", 영어 총점 : " + engTot + ", 수학 총점 : " + mathTot);
	}
}
