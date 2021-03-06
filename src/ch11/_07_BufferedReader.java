package ch11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class _07_BufferedReader {

	public static void main(String[] args) throws IOException {
		/* 보조스트림
		 * Buffered 스트림은 맴버변수로 8,912바이트 배열을 가지고 있다.
		 * 즉 한번 자료를 읽을때 8kb 정보를 한꺼번에 읽고 쓸수 있으므로 1바이트씩 읽고 쓸때마다 훨씬 수행속도가 빠르다.
		 * 매개변수는 기반 스트림을 사용한다.
		 */
		
		BufferedReader in = null;
		PrintWriter out = null;
		
		try {
			in = new BufferedReader(new FileReader("D:\\Dev88\\filetest\\7_FileReader.txt"));
			out = new PrintWriter("D:\\Dev88\\filetest\\7_FileWriter.txt");
			
			int i;
			while((i = in.read()) != -1) {
				out.write(i);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}finally {
			if(in != null) in.close();
			if(out != null) out.close();
		}
		
		System.out.println("출력완료");
		
	}
}
