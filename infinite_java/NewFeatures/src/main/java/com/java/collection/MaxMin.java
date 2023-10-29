//package com.java.collection;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class MaxMin {
//	public static void main(String[] args) {
//		List<Employ> employList = new ArrayList<Employ>();
//		employList.add(new Employ(1,"Avesh",34344));
//		employList.add(new Employ(2,"Subhra",23344));
//		employList.add(new Employ(3,"Ariz",56344));
//		employList.add(new Employ(4,"Anirudha",98344));
//		
//		Employ employMax = employList.stream().max((m1, m2) -> m1.getBasic() > m2.getBasic() ? 1 : -1);
//		
//		System.out.println("EMploy with max.basic");
//		System.out.println(employMax);
//		
//		System.out.println("Employ with min. basic");
//		Employ employMin = employList.stream().min(m1,m2 -> m1.getBasic() > m2.getBasi() ? 1: -1).get();
//		
//		System.out.println(employMin);
//		
//	}
//}
