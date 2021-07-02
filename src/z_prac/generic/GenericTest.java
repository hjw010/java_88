package z_prac.generic;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GenericTest {
	public static void main(String[] args) {
		
		Student stu1 = new Student("한진원", 31);
		Student stu2 = new Student("강창완", 28);
		RecycleClass<String,Student> rm = new RecycleClass<String,Student>();
		rm.add(stu1.getName(), stu1);
		rm.add(stu2.getName(), stu2);
		justCall.method01(rm);
		rm.remove("강창완");
		justCall.method01(rm);
	}
}
class justCall{
	public static <K,V>void method01(RecycleClass<K,V> map){
		map.getAll();
	}
}

class RecycleClass<K,V>{
	
	Map<K, V> map;
	public RecycleClass() {
		map = new HashMap<K, V>();
	}
	
	public void add(K k ,V v) {
		map.put(k, v);
	}
	
	public void remove(K key) {
		if(map.containsKey(key)) {
			map.remove(key);
			System.out.println("삭제완료");
		}else {
			System.out.println("데이터없음");
		}
	}
	
	public void getAll() {
		Set<Map.Entry<K, V>> entries =  map.entrySet();
		for(Map.Entry<K, V> entry : entries) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}

class Student{

	private String name;
	private int age;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	@Override
	public String toString() {
		return name + " " + age; 
	} 
}
