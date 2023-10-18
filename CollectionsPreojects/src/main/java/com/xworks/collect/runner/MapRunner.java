package com.xworks.collect.runner;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapRunner {

	public static void main(String[] args) {
		
		//generics
		Map<Long, String> map = new HashMap<Long, String>();
		map.put(8217634102L, "Aishwarya"); //Entry
		map.put(8217634102L, "Aishwarya"); //Entry
		map.put(8217634102L, "Aishwarya"); //Entry
		map.put(8217634102L, "Aishwarya"); //Entry
		map.put(8217634102L, "Aishwarya"); //Entry
		
		Set<Long> mobileKeys = map.keySet();
		mobileKeys.forEach(System.out::println);   //method references
		mobileKeys.forEach(k -> System.out.println(k));
		map.keySet().forEach(k -> System.out.println(k));
		
		
		Collection<String> value = map.values();
		value.forEach(v -> System.out.println(v));
		map.values().forEach(v -> System.out.println(v));
		
		Map<String, String> nameAndEmail = new HashMap<String, String>();
		nameAndEmail.put("Aishwarya", "vnaish040697@gmail.com");
		nameAndEmail.put("Aishwarya", "vnaish040697@gmail.com");
		nameAndEmail.put("Aishwarya", "vnaish040697@gmail.com");
	}

}
