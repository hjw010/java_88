package test.test0601;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
public class Login{
	public static void main(String[] s){
		
		Map<String, String> map = new HashMap<String, String>();
		String[] data = {
				"han",
				"kim",
				"you",
				"soo",
				"min"
				};
		for(int i = 0; i < data.length; i++){
			map.put(data[i] , data[i]+1234);
		}
		
		/*
		Iterator<String> itr = map.keySet().iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			System.out.print(map.get(key) + " ");
		}
		*/
		
		Scanner sc = new Scanner(System.in);
		String pwd = "";
		do{
			System.out.println("아이디 : ");
			String id = sc.nextLine();
			if(!(id.equals("e") || id.equals("E"))){
				if(map.containsKey(id)){
					System.out.println("비밀번호 : ");
					pwd = sc.nextLine();
					if(pwd.equals(map.get(id))){
						System.out.print("로그인 성공");
						break;
					}else{
						System.out.print("비밀번호가 틀렸습니다.");
					}
				}else{
					System.out.println(id + "는 존재 하지 않습니다.");
				}

			}else{
				System.out.print("종료");
				break;
			}
		}while(true);

	}
}