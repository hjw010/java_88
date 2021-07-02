package ch05;

public class _04_StudentMain {

	public static void main(String[] args) {
		
		//3명의 student 정보를 배열로 출력
		
		_04_Student[] stuArray = {
								new _04_Student("일봉",15,"naver"),
								new _04_Student("이봉",25,"google"),
								new _04_Student("삼봉",35,"daum"),
								new _04_Student("사봉",45,"hanmail")
		};
		
		for(_04_Student stuInfo : stuArray) {
			stuInfo.printStuInfo();
		}
		
		
	}
}
