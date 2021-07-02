package test;

public class _02_ifTest{

	public static void main(String[] args){
				
		//Scanner input = new Scanner(System.in);
		//System.out.println("점수를 입력 : ")
		System.out.println("점수를 입력 : ");
		int eval =90;
		char result;

		if(eval >= 90){
			result = 'A';
		}else if(eval >= 80){
			result = 'B';
		}else if(eval >= 70){
			result = 'C';
		}else if(eval >= 60){
			result = 'D';
		}else{
			result = 'F';
		}

		System.out.println("점수 : " + eval + ", 결과 : " + result);
		
		result = (eval>=90)?'A':((eval>=80)?'B':((eval>=70)?'C':((eval>=60)?'D':'F'))); 

	
		System.out.println("점수 : " + eval + ", 결과 : " + result);
	
		}

}