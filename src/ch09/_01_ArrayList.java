package ch09;

import java.awt.dnd.DragGestureEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _01_ArrayList {

	public static void main(String[] args) {
		/*
		 * 선언 
		 */
		ArrayList<String> list = new ArrayList<String>();
		list.add("딸기");//0
		list.add("피자");//1
		list.add("치킨");//2
		list.add("만두");//3
		list.add(0,"샌드위치");//인덱스 0번에 삽입 나머지 값들은 한칸씩 밀림
		list.add(1,"순살치킨너무좋아무야무야호");
		list.set(2, "어묵");// 해당인덱스 위치에 값을 변경 - 결과: 딸기가 사라지고 어묵으로 바뀜
		list.remove(2);//해당 인덱스 값 삭제
		
		System.out.println("방법1");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}

		System.out.println();
		System.out.println("방법2");
		for(String str : list) {
			System.out.print(str+" ");
		}
		
		System.out.println();
		System.out.println("방법3");
		/*
		 * 반복자(Iterator)
		 * - 사용목적 : 반복자는 java.util 패키지에 정의되어 있는 Iterator 인테퍼이스를 구현하는 객체이다.
		 * 				즉 클렉션의 원소에 접근하는 것이 목적이다.
		 * 
		 * -사용 메서드
		 *  - hasNext() :  아직 접근하지 않은 요소가 있으면 true를 반환
		 *  - next() : 다음 요소 반환 _ Object 타입을 반환 - > Object : 가장 큰 자료형
		 *  - remove() : 최근에 반한된 요소 삭제를 삭제
		 *  
		 * 
		 * */
		
		List<String> season = new ArrayList<String>();
		season.add("봄");
		season.add("여름");
		season.add("가을");
		season.add("겨울");
		
		// 인터페이스 Iterator 객체 생성 (List.iterator())
		//Iterator<E> iterator
		Iterator iterator = season.iterator();
		//값이 존재하는 동안 이동해가면서 출력
		while(iterator.hasNext()) { //ArrayList의 값이 존재하는지 체크, 리턴타입이 boolean 
			//iterator.next() <-- Object를 리턴하므로 다운케스팅 해야함
			String str = (String)iterator.next();
			System.out.print(str+" ");
		}
		
		System.out.println();
		List<String> dream = new ArrayList<String>();
		dream.add("시계여행");
		dream.add("건물주");
		dream.add("로또");
		dream.add("해외이주");
		dream.add("어학공부");
		Iterator iterator2 = dream.iterator();
		
		while(iterator2.hasNext()) {
			String str = (String)iterator2.next();
			System.out.print(str+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
