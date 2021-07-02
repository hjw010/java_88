package ch11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _03_FileInputStream {

	public static void main(String[] args) throws IOException {
		
		// 3_inputStream.txt를 byte 단위로 읽어서 콘솔에 출력 _ 한글은 2byte이므로 깨진다... 한글을 읽으려면 reader로 해야함
		// 메모장 저장시 utf-8로 저장해야함.
		FileInputStream fis = null;
		
		try {
			//fis = new FileInputStream("D:/Dev88/filetest/3_InputStream.txt"); //경로 사이를 / 하나로 주어도 됨
			fis = new FileInputStream("D:\\Dev88\\filetest\\3_InputStream.txt"); //먼저 txt파일을 작성해야함.
			int i;
			while((i=fis.read()) !=-1) {
				System.out.print((char)i);
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}finally {
			fis.close();
		}
		
		System.out.println();
		System.out.println("정상종료");
		
		
		
		
		
		
		
	}
}
