package ch13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//477
public class _04_ArrayListStream {

	public static void main(String[] args) {
	
		List<String> list = new ArrayList<String>();
		list.add("한마스");
		list.add("김드워드");
		list.add("나잭");
		
		Stream<String> stream = list.stream();
		stream.forEach(s -> System.out.print(s+" " ));
		System.out.println();
		
		list.stream().sorted().forEach(s -> System.out.print(s+" "));
		System.out.println();
		list.stream().map(s -> s.length()).forEach(i -> System.out.println(i));
		
	}
}
