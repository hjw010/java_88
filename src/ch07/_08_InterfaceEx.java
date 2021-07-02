package ch07;

public class _08_InterfaceEx {
	
	public static void main(String[] args) {

		M1 m1 = new M1();
		m1.methodM1(new M2());
		
	}
}
class M1{
	public void methodM1(M2 m2) {
		System.out.println("M1 클레스 - methodM1()");
		m2.methodM2(new M3());
	}
}
	
class M2{
	public void methodM2(M3 m3) {
		System.out.println("M2 클레스 - methodM2()");
		m3.methodM3();
	}
}

class M3{
	public void methodM3() {
		System.out.println("M3 클레스 - methodM3()");
	}
}
	
	

