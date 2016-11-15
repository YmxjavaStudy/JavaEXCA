package com.java.ymx.Ecxe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<String, String>();
		Emp emp = new Emp("006", "zhou");
		Emp emp1 = new Emp("004", "wu");
		Emp emp2 = new Emp("003", "zhen");
		Emp emp3 = new Emp("002", "wang");
		map.put(emp.getID(), emp.getNAME());
		map.put(emp1.getID(), emp1.getNAME());
		map.put(emp2.getID(), emp2.getNAME());
		map.put(emp3.getID(), emp3.getNAME());

		Set<String> set = map.keySet();
		Iterator<String> iterable = set.iterator();
		while (iterable.hasNext()) {
			String string = (String) iterable.next();
			String name = (String) map.get(string);
			System.out.println(string + " " + name);
		}

		TreeMap<String, String> treeMap = new TreeMap<String, String>();
		treeMap.putAll(map);
		Iterator<String> iter = treeMap.keySet().iterator();
		System.out.println("Treemap集合：");
		while (iter.hasNext()) {
			String string = (String) iter.next();
			String name = (String) treeMap.get(string);
			System.out.println(string + " " + name);
		}
	}

}
