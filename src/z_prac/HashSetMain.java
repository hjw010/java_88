package z_prac;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetMain {

	public static void main(String[] args) {
		
		
		Set<String> strSet = new HashSet<String>();
		String[] strArray ={
		 				"강",
		 				"아",
		 				"지"
		};
		
		for (int i = 0; i < strArray.length; i++) {
			strSet.add(strArray[i]);
		}
		System.out.println(strSet);
		Iterator<String> itr = strSet.iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}
		
	}
}
