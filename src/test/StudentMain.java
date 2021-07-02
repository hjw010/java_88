package test;
public class StudentMain{
	public static void main(String[] s){
		Student[] stuArray = {
			new Student("11-22","한진원",31,"헬스"),
			new Student("33-44","김지연",30,"게임"),
			new Student("55-66","이동연",29,"등산"),
			new Student("77-88","유동근",28,"운전"),
			new Student("99-00","서상현",27,"도박")
			};

		for(int i = 0; i<stuArray.length; i++){
			stuArray[i].showInfo();
		}
	}
}