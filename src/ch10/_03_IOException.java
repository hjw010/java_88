package ch10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//IOException - FileNotFoundException
public class _03_IOException {
	public static void main(String[] args) {
		
		 FileInputStream fis = null;
		//fis = new FileInputStream("1.txt");//IOexception -- 컴파일러가 오류를 알려줌  runtimeException은 안알랴쥼
	
		 try {
			fis = new FileInputStream("1.txt");
		} catch (FileNotFoundException e) { //file이 존재하지 않을때의 예외처리
			System.out.println("notFound 예외 : "+e.getMessage());
			//e.printStackTrace();
			return; //<---------- 이후 문장 수행 안함 System.out.println("정상 종료"); return을 해도 finally는 수행함
					//} catch (FileNotFoundException e) 이후 더이상 수행안하도록 끝내기위함 (return;)
		} finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					System.out.println("close 예외"+e.getMessage());
					e.printStackTrace();
				}
			}
			System.out.println("finally 수행ㅇㅇㅇㅇㅇㅇㅇㅇㅇ");
		}
		 
		 
		System.out.println("정상 종료");
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
