package com.interviewPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class Occurances {

		public static void main(String[] args) {

			String str = "occurances";
			Map<Character, Integer> my_map = new LinkedHashMap<Character, Integer>();
			char[] str_array = str.toCharArray();
			for (char c : str_array){
				if (my_map.containsKey(c)){
					my_map.put(c, my_map.get(c) + 1);
				}else{
					my_map.put(c, 1);
				}
			}
			for (Map.Entry entry : my_map.entrySet()){
				System.out.println(entry.getKey() + " " + entry.getValue());
			}
		}
	}


