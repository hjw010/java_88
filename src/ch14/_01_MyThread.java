package ch14;

public class _01_MyThread extends Thread {

	/*
	 * 멀티테스킹 : 여러개의 어플리케이션을 동시에 실행해서 컴퓨터 시스템의 성능을 높이기 위한 기법. 테스크 : 하나의 업무 처리 단위 ex)
	 * 음악을 들으면서 동시에 운동 문서 편집하면서 인터넷에서 파일 다운로드
	 * 
	 * 멀티스레딩 : 병렬작업을 하나의 어플리케이션 안에서 동시에 하는 것을 말함. 스레드 : 각각의 작업(실행흐름)
	 * 
	 * 멀티스레딩의 장점 - CPU의 사용률을 향상 시킨다. - 자원을 보다 효율적으로 사용 할 수 있다. - 사용자에 대한 응답성이 향상된다.
	 * - 작업이 분리되어 코드가 간결해진다.
	 * 
	 * Thread 문법 방법 1) Thread 클레스를 상속하기 - run() 메소드 override 방법 2) Runnable 인터페이스를
	 * 구현하는 방법 - run() 메소드를 override
	 */

	// 방법 1) Thread 클레스 상속
	
	@Override
	public void run() {
		int sum=0;
		for (int i = 1; i < 11; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
	
}
