package javaInterviewPrograms;

import java.util.*;

public class RemoveDupInt {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 4, 4, 5 };

		Set<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}

		int[] newArr = new int[set.size()];
		int index = 0;
		for (Integer num : set) {
			newArr[index++] = num;
		}

		System.out.println("Original Array: " + Arrays.toString(arr));
		System.out.println("New Array: " + Arrays.toString(newArr));

		/*
		 * Here, we first create a LinkedHashSet to store the unique elements from the
		 * array. We then loop through the array and add each element to the set. Since
		 * a LinkedHashSet maintains the insertion order of elements, the order of
		 * elements in the set will be the same as the order of elements in the original
		 * array.
		 * 
		 * Next, we create a new array of the same size as the set and copy the elements
		 * from the set to the new array. Finally, we print out both the original and
		 * the new array.
		 * 
		 * This will output:
		 * 
		 * sql Copy code Original Array: [1, 2, 2, 3, 4, 4, 5] New Array: [1, 2, 3, 4,
		 * 5]
		 */

// Here's a shorter code snippet to remove duplicates from an array in Java:

		int[] arr1 = { 1, 2, 2, 3, 4, 4, 5 };
		int[] uniqueArr = Arrays.stream(arr1).distinct().toArray();
		System.out.println(Arrays.toString(uniqueArr));

	}
}
/*
 * In this code, we first create the original array arr. We then use the
 * distinct() method from the Arrays class to remove the duplicates from the
 * array. The distinct() method returns a stream of distinct elements, which we
 * convert back to an array using the toArray() method. Finally, we print out
 * the unique array using the Arrays.toString() method.
 * 
 * This will output:
 * 
 * [1, 2, 3, 4, 5]
 */
