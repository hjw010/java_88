package ch11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class _10_SerializationTest {

	/*
	 * p550
	 * 
	 * 직렬화
	 * -인스턴스의 정보를 그대로 저장하거나 네트워크를 통해 전송
	 * -인스턴스의 내용(인스턴스 변수값)을 연속 스트림으로 만드는 것이다.
	 * -스트림으로 만들어야 파일에 쓸수 있고, 네트워크로 전송할 수 있다.
	 * -implements Seriallizable : 직렬화 구현
	 * - transient : 해당
	 */
	
	public static void main(String[] args) throws IOException {
		//out
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		//int
		FileInputStream fis = null;
		
		ObjectInputStream ois = null;
		
		_10_Person person1 = new _10_Person("한진원", "백수");
		_10_Person person2 = new _10_Person("서상현", "비트코인중독자");
		
		
		try {
			
			fos = new FileOutputStream("D:\\Dev88\\filetest\\serialization\\person.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(person1); // 직렬화
			oos.writeObject(person2);
			
			
			fis = new FileInputStream("D:\\Dev88\\filetest\\serialization\\person.txt");
			ois = new ObjectInputStream(fis);
			_10_Person p1 = (_10_Person)ois.readObject(); //역직렬화
			_10_Person p2 = (_10_Person)ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
		
		
		
	}
	
}
