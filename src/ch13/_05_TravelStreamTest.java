package ch13;

import java.util.ArrayList;
import java.util.List;

class TravelCustomer {

	private String name;
	private int age;
	private int price;

	public TravelCustomer(String name, int age, int price) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
	}

	public TravelCustomer() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "이름 : " + name + " 나이 : " + age + " 가격 : " + price;
	}

}

public class _05_TravelStreamTest {

	public static void main(String[] args) {

		/*
		 * 시나리오
		 * 1.고객의 명단을 출력
		 * 2.여행의 총 비용 계산
		 * 3.고객 중 20세 이상인 사람의 이름을 정렬 출력
		 */
		
		TravelCustomer[] customers = {
							new TravelCustomer("한진원",31,500000),
							new TravelCustomer("강창완",28,700000),
							new TravelCustomer("서상현",31,900000),
							new TravelCustomer("유선희",15,800000),
							new TravelCustomer("강민아",29,850000)
		};
		
		List<TravelCustomer> customerList = new ArrayList<TravelCustomer>();

		for (int i = 0; i < customers.length; i++) {
			customerList.add(customers[i]);
		}
		
		System.out.println("==========고객출력============");
		//스트림생성.map() 중간연산.forEach()최종연산
		//map() - 클래스가 가진 자료 중 이름만 출력하는 경우 사용
		customerList.stream().forEach(c -> System.out.println(c));
		System.out.println();
		
		//스트림생성.mapToInt() 중간연산.sum()최종연산
		//mapToInt() : map의 값 price를 int형으로 변환
		System.out.println("총 여행 비용 : " +customerList.stream().mapToInt(c -> c.getPrice()).sum());
		
		System.out.println("==========20세 이상 고객 며단 정렬하여 출력============");
		//filter() : 조건을 넣고 그 조건에 맞는 참인 경우만 요소 추출
		customerList.stream().filter(c -> c.getAge()>= 20).map(c -> c.getName()).sorted().forEach(s -> System.out.println(s));
		
		
	}
	
}
