package ch04;

//객체 간 협력 p175
public class _08_Student {

	//멤버변수
	public String studentName;
	public int grade;
	public int money;
	//생성자
	public _08_Student() {
		super();
	}
	public _08_Student(String studentName, int grade,int money) {
		super();
		this.studentName = studentName;
		this.grade = grade;
		this.money = money;
	}
	
	//메서드
	public void takeBus(_08_Bus bus) {
		//_08_Bus bus = new _08_Bus();
		bus.take(1000);
		this.money-=1000;
	}
	
	public void takeSubway(_08_Subway subway) {
		subway.take(1500);
		this.money-=1500;
	}
	
	public void takeTaxi(_08_taxi taxi) {
		taxi.take(7000);
		this.money-=7000;
	}
	
	public void showInfo() {
		System.out.println(studentName +" "+grade+" "+" 남은 요금 : "+ money);
	}
	
	
}
