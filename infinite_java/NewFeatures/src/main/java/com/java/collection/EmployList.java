package com.java.collection;

import java.util.ArrayList;
import java.util.List;

public class EmployList {
	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1,"Avesh",34344));
		employList.add(new Employ(2,"Subhra",34344));
		employList.add(new Employ(3,"Ariz",34344));
		employList.add(new Employ(4,"Anirudha",34344));
		
		System.out.println("Employ records are ");
		employList.forEach(x ->{
			System.out.println(x);
		});
	}
}
