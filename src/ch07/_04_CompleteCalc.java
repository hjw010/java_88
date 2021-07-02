package ch07;

public class _04_CompleteCalc extends _04_Calculator {

	@Override
	public int times(int num1, int num2) {
		if(num1<0 || num2<0) {
			System.out.print("times - 오류 ");
			return _04_Calc.ERROR;
		}else {
			return num1 * num2;
		}
			
	}

	@Override
	public int divide(int num1, int num2) {
		int result;
		if(num1 >= num2) {
			if(num1%num2==0) {
				result = num1/num2;
				return result;
			}else {
				System.out.print("divide - 오류 ");
				return _04_Calc.ERROR;
			}
		}else {
			if(num2%num1==0) {
				result = num2/num1;
				return result;
			}else {
				System.out.print("divide - 오류 ");
				return _04_Calc.ERROR;
			}
		}
	}

	public void showInfo() {
		System.out.println("Calc 인터페이스 구현하였습니다.");
	}
	
	
}
