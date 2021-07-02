package test.test0527_2;

public class Main {

	public static void main(String[] args) {
		Car car = new AlCar();
		Car car2 = new ManualCar();
		car.method();
		car2.method();
		Car.method2();
		//1.구현부가 없는 추상화 메소드를 모아둔 기능 정의서로 구현 클레스에 의해 정의되어야 한다. implements 인터페이스명
		//2.구현
		/*
			public class 구현클레스 implements 인터페이스{
				@Override
				void 메서드(){ // 인터페이스에 정의된 메서드
				
				}  
			}
		*/
	}
}
