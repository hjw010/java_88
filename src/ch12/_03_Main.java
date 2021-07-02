package ch12;

import java.util.ArrayList;
import java.util.List;

public class _03_Main {

	public static void main(String[] args) {
		
			_03_Enum e1 = new _03_Enum(Animal.CAT,"스미스");
			_03_Enum e2 = new _03_Enum(Animal.DOG,"조지");
			_03_Enum e3 = new _03_Enum(Animal.COW,"브랜드");
			
			List<_03_Enum> list = new ArrayList<_03_Enum>();
			
			list.add(e1);
			list.add(e2);
			list.add(e3);
			
			for (_03_Enum en : list) {
				System.out.println(en.getKind() + " " +en.getName());
			}
			
			
			
			
	}
}
