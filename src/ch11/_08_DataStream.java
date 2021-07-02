package ch11;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _08_DataStream {
	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		FileInputStream fis = null;
		DataOutputStream dos = null;
		DataInputStream dis = null;
		
		try {
			fos = new FileOutputStream("D:\\Dev88\\filetest\\8_Data.txt");
			dos = new DataOutputStream(fos); //보조 스트림 안에 기반 스트림
			
			//각 자료형에 맞게  data 작성
			dos.writeByte(100);
			dos.writeBoolean(false);
			dos.writeChar('A');
			dos.writeDouble(3.14);
			dos.writeUTF("ffff");
			
			fis = new FileInputStream("D:\\Dev88\\filetest\\8_Data.txt");
			dis = new DataInputStream(fis);
			
			System.out.println(dis.readByte());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readChar());
			System.out.println(dis.readDouble());
			System.out.println(dis.readUTF());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
