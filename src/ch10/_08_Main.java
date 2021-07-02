package ch10;

import java.util.Scanner;

public class _08_Main {

	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		try {
			_08_MemberInfo member = readMemberInfo(); 
			member.showMemberInfo();
		} catch (_08_InvalidNameException e) {
			e.showWrongName();
			System.out.println(e.getMessage());
		} catch (_08_InvalidAgeException e) {
			e.showWrongAge();
			System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			input.close();
		}
	}

	public static _08_MemberInfo readMemberInfo() throws _08_InvalidNameException, _08_InvalidAgeException, Exception { //나이, 이름 처리
		return new _08_MemberInfo(readName(),readAge());
	}
	
	public static String readName() throws _08_InvalidNameException{
		System.out.println("이름 입력 : ");
		String name = input.nextLine();
		if(name.length()<2) {
			_08_InvalidNameException iName = new _08_InvalidNameException("이름은 두글자 이상 이여야 합니다.");
			iName.setWrongName(name);
			throw iName;
		}else {
			return name;
		}
	}
	
	public static int readAge() throws _08_InvalidAgeException {
		System.out.println("나이 입력 : ");
		int age = input.nextInt();
		if(age< 0) {
			_08_InvalidAgeException iAge = new _08_InvalidAgeException("나이는 0보다 작을 수 없습니다.");
			iAge.setWrongAge(age);
			throw iAge;
		}else {
			return age;
		}
	}
	
	
}
