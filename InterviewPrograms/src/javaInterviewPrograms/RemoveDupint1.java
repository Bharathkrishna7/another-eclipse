package javaInterviewPrograms;

import java.util.*;

public class RemoveDupint1 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 4, 1, 5, 4 };

		// Convert array to list to remove duplicates
		List<Integer> list = new ArrayList<>();
		for (int i : arr) {
			if (!list.contains(i)) {
				list.add(i);
			}
		}

		// Convert list back to array
		int[] result = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			result[i] = list.get(i);
		}

		System.out.println(Arrays.toString(result));
	}
}
