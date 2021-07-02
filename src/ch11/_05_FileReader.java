package ch11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class _05_FileReader {

	public static void main(String[] args) throws IOException {
		
		//문자를 읽어서 콘솔에 출력  fileReader //문자 단위로 출력 
		
		FileReader fr = null;
		
		try {
			//UTF-8로 저장
			fr = new FileReader("D:\\Dev88\\filetest\\5_FileReader.txt");
			int i;
			while((i = fr.read()) != -1) {
				System.out.print((char)i);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			if(fr != null) fr.close();
		}
		
		
		
		
		
		
		
		
		
	}
}
