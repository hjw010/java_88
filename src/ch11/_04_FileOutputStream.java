package ch11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _04_FileOutputStream {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
			try {
				fis = new FileInputStream("D:\\Dev88\\filetest\\4_InputStream.txt"); //생성된 파일 읽는거
				fos = new FileOutputStream("D:\\Dev88\\filetest\\4_OutputStream.txt" ,true); //자동 생성됨 true를 주면 한번생성된 자료에 연결되어 출력
				
				int i;
				while((i = fis.read()) != -1) {
					System.out.print((char)i); //아스키값을 캐릭터 형으로 변환해 출력
					
					fos.write(i);// input 파일을 읽어서 output 파일에 출력
					
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				if(fis != null) {
					fis.close();
				}
				if(fos != null) {
					fos.close();
				}
				
			}
		
		
		
	}
}
