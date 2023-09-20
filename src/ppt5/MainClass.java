package ppt5;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {
		
		HashMap<String, Double> map = new HashMap<>();
		map.put("Linux", 77.5);
		map.put("MariaDB", 73.0);
		map.put("C", 65.0);
		map.put("C++", 65.0);
		map.putAll(Map.of("Java", 50.0, "Network", 50.0));
		map.put("Java", 63.0);
		
		/*
		//순회
		for(String key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}
		map.forEach((key, value)-> {
			System.out.println(key + " : " + value);
		});
		*/
		/*
		for(Map.Entry<String, Double> elem : map.entrySet()) {
			System.out.println(elem.getKey() + " : " + elem.getValue());
		}*/
		
		//조회
		System.out.println(map.containsKey("Linux"));
		System.out.println(map.containsKey(100.0));
		
		Set<String> subject = map.keySet();
		
		System.out.println(subject.size());
		for(var elem : subject) {
			System.out.println(elem);
		}
		Collection<Double> scores = map.values();
		System.out.println(scores.size());
		for(var elem : scores) {
			System.out.println(elem);
		}
		
	}
}

