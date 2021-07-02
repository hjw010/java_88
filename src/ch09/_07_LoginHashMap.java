package ch09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class _07_LoginHashMap {

	public static void main(String[] args) {
		
		/*
		 * [시험]
		 * 
		 * 1. id, pwd 5건을 hashTable에 저장(hashMap에 저장)
		 * 	  id       pwd
		 * 	"hong"  "hong1234"
		 * 	"park"  "park1234"
		 * .......
		 * 5개의 데이터
		 * 
		 * 2. 콘솔로부터 id,pwd 입력 받는다.(로그인 할때)
		 * 
		 * 3. 1과 2를 비교해서 아이디가 없으면 "입력한 아이디가 존재하지 않습니다." 출력
		 * 3. 아이디가 있으면 비밀번호와 비교해서 일치하면 "로그인 성공." 출력 / 불일치하면 "비밀번호가 일치하지 않습니다." 출력
		 * 
		 * 4.Q나 q이면 종료
		 */
		//1.
		/*
		String[] ids = {
						"han",
						"you",
						"kim",
						"moo",
						"seo"
		};
		Map<String, String> map = new HashMap<String, String>();
		for (int i = 0; i < ids.length; i++) {
			map.put(ids[i], ids[i]+1234);
		}
		//2.
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		
		if(id.equals("q") || id.equals("Q")) {
			System.out.println("종료");
		}else {
			if(map.containsKey(id)) {
				System.out.print("비밀번호 : ");
				String pwd = sc.nextLine();
				if(map.containsValue(pwd) && pwd.equals(id+1234)) {
					System.out.println("로그인 성공.");
				}else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			}else {
				System.out.println("입력하신 " +id+ " 는 존재하지 않습니다." );
			}
		}
		*/
		
		String[] ids = {
				"han",
				"you",
				"kim",
				"moo",
				"seo"
		};
		Map<String, String> map = new HashMap<String, String>();
		
		for (int i = 0; i < ids.length; i++) {
			map.put(ids[i], ids[i]+1234);
		}
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			if(id.equals("q") || id.equals("Q")) {
				System.out.println("종료");
				break;
			}else {
				if(map.containsKey(id)) {
					System.out.print("비밀번호 : ");
					String pwd = sc.nextLine();
					//map.containsValue(pwd) && pwd.equals(id+1234)
					if(map.get(id).equals(pwd)) {
						System.out.println("로그인 성공.");
						break;
					}else {
						System.out.println("비밀번호가 일치하지 않습니다.");
					}
				}else {
					System.out.println("입력하신 " +id+ " 는 존재하지 않습니다." );
				}
			}
		}while(true);
		
		
		/*
		Iterator<String> itr = map.keySet().iterator();
		while(itr.hasNext()){
			String key = itr.next();
			System.out.println(map.get(key));
		}
		*/
		
		
		
		
		
	}
}
