package ch11;

import java.io.FileWriter;
import java.io.IOException;

public class _06_FileWriterTest {

	public static void main(String[] args) {
		
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("D:\\Dev88\\filetest\\5_FileWriter.txt");
			fw.write('A');//문자하나출력
			char[] buf = {
				 'B','C','D','E','F','G'};
			fw.write(buf);
			fw.write("순살치킨 너무좋아~");
			fw.write(buf, 2,4 );
			fw.write("88기");
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(fw != null)
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
	}
}
