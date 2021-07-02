package ch06;

public class _08_Main {

	public static void main(String[] args) {
		//1. 자식 매개변수 생성자 호출 -> 전체 멤버변수 초기화
		//매개변수를 통한 다형성 적용
		//다형성 : 부모타입 참조변수 = new 자식클레스(); 
		
		showInfo(new _08_Manager("112","한진원","영업부",300,10));
		showInfo(new _08_Sawon("222","진진자","기술부",250,20));
	}
	
	public static void showInfo(_08_Eployee emp) {
		if(emp instanceof _08_Manager) {
			_08_Manager manager = (_08_Manager)emp;
			manager.calBouns();
		}else {
			_08_Sawon sawon = (_08_Sawon)emp;
			sawon.calSudang();
		}
	}
	
	
}
