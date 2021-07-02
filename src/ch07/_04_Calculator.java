package ch07;

//  + , - 구현
public abstract class _04_Calculator implements _04_Calc {

	@Override
	public int add(int num1, int num2) {
		return num1+num2;
	}

	@Override
	public int sub(int num1, int num2) {
		if(num1 >= num2) {
			return num1-num2;
		}else {
			return num2-num1;
		}
	}
	
	
	
	
	
	

}
