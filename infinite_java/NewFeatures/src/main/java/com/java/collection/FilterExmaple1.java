package com.java.collection;

import java.util.ArrayList;
import java.util.List;

public class FilterExmaple1 {
	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1,"Avesh",34344));
		employList.add(new Employ(2,"Subhra",23344));
		employList.add(new Employ(3,"Ariz",56344));
		employList.add(new Employ(4,"Snirudha",98344));
		
		employList.stream().filter((e) -> e.getBasic() >= 50000)
		.forEach(x -> {
			System.out.println(x);
		});
		
		System.out.println("Names starts-with A");
		employList.stream().filter((e) -> e.getName().startsWith("A")).forEach(System.out::println);
	}
}
