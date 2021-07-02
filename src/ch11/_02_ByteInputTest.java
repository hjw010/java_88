package ch11;

import java.io.IOException;

public class _02_ByteInputTest {
	public static void main(String[] args) {

	
		int i;
		
		while(true) {
			try {
				i = System.in.read();
				if(i == 10 ) {  // 13 : Enter 10 : 줄바꿈  아스키값 13은 엔터 10은 줄바꿈
					System.out.println("출력완료");
					break;
				}
				System.out.println((char)i);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	
		
		
	}
}
