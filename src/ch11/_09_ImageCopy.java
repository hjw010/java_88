package ch11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class _09_ImageCopy {

	
	public static void main(String[] args) throws IOException {
		
		
			Scanner input = new Scanner(System.in);
			
			System.out.print("원본 파일명을 입력하세요 : "); //경로 포함
			String intputFileName = input.nextLine();
			
			System.out.print ("복사 파일명을 입력하세요 : ");
			String outputFileName = input.nextLine();
			
			FileInputStream fis = null;
			FileOutputStream fos = null;
			
			try {
				fis = new FileInputStream(intputFileName);
				fos = new FileOutputStream(outputFileName);
				
				int i;
				while((i = fis.read()) != -1){
					fos.write(i);
				}
				
				System.out.println(intputFileName + "파일 을" + outputFileName +"로 복사 함.");
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}finally {
				fis.close();
				fos.close();
			}
			
			
			
	} 
	
}
