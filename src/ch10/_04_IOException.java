package ch10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _04_IOException {
	public static void main(String[] args) throws FileNotFoundException {

		/*
		 * p501 예외처리 미루기 - throws 사용하기
		 * - 예외를 해당 메서드에서 처리(try - catch)하지 않고 미룬 후, 메서드를 호출하여 사용하는 부분에서 예외를 처리하는 방법
		 * - throws Exception
		 * 
		 * 
		 */
		
		FileInputStream fis = null;
		fis = new FileInputStream("a.txt");
		
		System.out.println("정상종료");
	}
}
