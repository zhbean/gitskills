package com.collectionFrame.test;

import java.util.*;

public class TestFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "张三");
		map.put(2, "李四");
		map.put(3, "王五");
		map.put(4, "赵六");
		// 遍历map得到key值
		Set<Integer> set = map.keySet();
		for (int i : set) {
			System.out.println(i);
		}
		// 遍历map得到values
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
		// 测试Itreator
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
