package ch10;

import java.util.Scanner;


public class _05_ThrowsException {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args)/*throws Exception*/ { //<-- main메소드에 throws Exception 처리를 하면 jvm에게 예외처리를 넘긴다(main()은 jvm이 실행하기때문에) 

		/*
		 * 1.예외발생					 		-> 2.예외던지기 					-> 3.예외처리
		 * throw new Exception(메세지);		-> Throws Exception				->catch(Exception e){e.getMessage()}
		 */
		
		// 입력받은 이름이 2자미만이면 예외발생
		// 3. 예외처리 : try ~ catch ~ finally
		try {
			String name = readName();
			System.out.println("이름 : " +  name);
		} catch (NameInvalidException e) {
			//e.printStackTrace();
			System.out.println("NameInvalidException메세지 : " + e.getMessage());
			return; //<--- 강제 종료
		}catch (Exception e) {
			System.out.println("Exception메세지 : "+e.getMessage());
		}finally {
			input.close();
		}
		
		System.out.println("정상 종료");
		
		
	}
	
	public static String readName() throws NameInvalidException, Exception{ //2. 상위 메서드(readName()를 호출하는 메서드)에게 예외처리를 미루는 throws Exception
		System.out.println("이름을 입력 하세요 : ");
		String name = input.next();
		
		if(name.length()<2) {
			// 1. 강제 예외 발생 : throw new Exception(message);
			//throw new Exception("이름자 두글자 이상입니다."); //Exception 클래스의 매개변수 생성사 호출
			throw new NameInvalidException("이름자 두글자 이상입니다."); //Exception 클래스의 매개변수 생성사 호출
			//throw new NameInvalidException(); //Exception 클래스의 매개변수 생성사 호출
		}else {
			return name;
		}
	}
	
	
	
}
