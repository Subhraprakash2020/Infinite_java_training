package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmploySort {
	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1,"Avesh",34344));
		employList.add(new Employ(2,"Subhra",23344));
		employList.add(new Employ(3,"Ariz",56344));
		employList.add(new Employ(4,"Anirudha",98344));
		
		System.out.println("Sorted by name ");
		Collections.sort(employList,(e1, e2) ->{
			return e1.getName().compareTo(e2.getName());
		});
		employList.forEach(System.out::println);
		
		Collections.sort(employList,(e1, e2) ->{
			return (int) (e1.getBasic() - e2.getBasic());
		});
		System.out.println("Sort by basic:");
		employList.forEach(System.out::println);
		
	}
}
