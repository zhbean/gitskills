package com.collectionFrame.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestGit {
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

	}
}
