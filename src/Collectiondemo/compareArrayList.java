package Collectiondemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class compareArrayList {

	public static void main(String[] args) {

		// sort and equals--for comparing sorting is done--bcz index by index comparison
		// is done

		ArrayList<Integer> ar1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		System.out.println(ar1);

		ArrayList<Integer> ar2 = new ArrayList<Integer>(Arrays.asList(1, 4, 3, 2, 5, 10, 7, 9, 6));
		System.out.println(ar2);

		ArrayList<Integer> ar3 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

		Collections.sort(ar1);
		Collections.sort(ar2);
		System.out.println(ar2);

		System.out.println(ar1.equals(ar2));// false
		System.out.println(ar1.equals(ar3));// true

		// compare to arraylist and find the additional element

		ArrayList<String> ar4 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E", "F"));

		ArrayList<String> ar5 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E", "G"));

		ar4.removeAll(ar5);
		System.out.println(ar4);

		// Compare two arraylist to find the missing element

		ArrayList<String> ar6 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E", "F"));

		ArrayList<String> ar7 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E", "G"));

		ar7.removeAll(ar6);

		System.out.println(ar7);

		// finding common element in two arrays

		ArrayList<String> lang = new ArrayList<String>(Arrays.asList("Java", "c#", "python", "ruby", "scala"));

		ArrayList<String> lang1 = new ArrayList<String>(Arrays.asList("Java", "c#", "python", "ruby"));

		lang.retainAll(lang1);

		System.out.println(lang);

	}

}
