package javaInterviewPrograms;

import java.util.*;

public class RemoveDuplicateName {
	public static void main(String[] args) {
		String[] names = { "John", "Jane", "John", "Bob", "Alice", "Bob" };

		// Convert array to list to remove duplicates
		List<String> list = Arrays.asList(names);
		Set<String> set = new HashSet<>(list);

		// Convert set back to array
		String[] result = new String[set.size()];
		set.toArray(result);

		System.out.println(Arrays.toString(result));

		/*
		 * This code first converts the array to a list using the Arrays.asList()
		 * method. It then create s a HashSet from the list, which automatically removes
		 * duplicates. Finally, it converts the HashSet back to an array using the
		 * toArray() method. The resulting array contains only the unique names of the
		 * original array.
		 * 
		 * Note that the order of the names in the resulting array is not guaranteed to
		 * be the same as in the original array, since HashSet does not maintain order.
		 * If you need to preserve the order, you can use a LinkedHashSet instead of a
		 * HashSet.
		 */

	}
}
