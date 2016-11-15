package com.java.ymx.Ecxe;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class UpdateStu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<String, String>();
		map.put("01", "zhao");
		map.put("02", "qian");
		map.put("03", "sun");
		map.put("04", "li");
		map.put("05", "zhou");
		System.out.println("key集合中的元素：");
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println("\n" + "values集合中的元素：");
		Collection<String> coll = map.values();
		it = coll.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}

}
