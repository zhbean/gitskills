package com.collectionFrame.test;

import java.util.*;

public class TestFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "����");
		map.put(2, "����");
		map.put(3, "����");
		map.put(4, "����");
		// ����map�õ�keyֵ
		Set<Integer> set = map.keySet();
		for (int i : set) {
			System.out.println(i);
		}
		// ����map�õ�values
		Collection<String> collection = map.values();
		for (String str : collection) {
			System.out.println(str);
		}
		
		Iterator it1 = collection.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}

		Set<String> set1 = new HashSet<String>();
		set1.add("111");
		set1.add("111");
		set1.add("333");
		for (String i : set1) {
			System.out.println(i);

		}
		// ����Itreator
		List<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("aaa");
		list.add("ccc");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
