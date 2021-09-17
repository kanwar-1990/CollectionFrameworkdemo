package Collectiondemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Arraylistmethod {

	public static void main(String args[])

	{

		ArrayList<String> ar1 = new ArrayList<String>();

		ar1.add("python");
		ar1.add("java");
		ar1.add("c#");
		ar1.add("ruby");

		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("TestNG");
		ar2.add("selenium");

		// addding to ArrayList

		ar1.addAll(ar2);

		System.out.println(ar1);

		ar1.addAll(2, ar2);

		System.out.println(ar1);

		// clone

		ArrayList<String> list = (ArrayList<String>) ar1.clone();
		System.out.println(list);

		System.out.println(ar1.contains("ruby"));
		System.out.println(ar1.contains("c1"));
		System.out.println(ar1.indexOf("java") > 0);

		// lastindexof

		ArrayList<String> lastindex = new ArrayList<String>(
				Arrays.asList("hello", "john", "helen", "guru", "john", "helen"));

		int i = lastindex.lastIndexOf("helen");
		System.out.println(i);

		// remove

		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("java", "python", "c#", "ruby", "scala"));

		list1.remove("ruby");

		System.out.println(list1);

		System.out.println(list1.remove(0));
		System.out.println(list1);

		// remove if: A good use case

		ArrayList<Integer> evennu = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

		evennu.removeIf(num -> num % 2 == 0);
		System.out.println(evennu);

		ArrayList<Integer> oddnu = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

		oddnu.removeIf(num -> num % 2 == 1);
		System.out.println(oddnu);

		// retain all

		ArrayList<String> namelist = new ArrayList<String>(
				Arrays.asList("Tom", "Harry", "putar", "Tom", "lisa", "feleni"));

		namelist.retainAll(Collections.singleton("Tom"));

		System.out.println(namelist);

		// sublist
		ArrayList<String> namelist1 = new ArrayList<String>(
				Arrays.asList("Tom", "Harry", "putar", "Tom", "lisa", "feleni"));

		ArrayList<String> namelist2 = new ArrayList<String>(namelist1.subList(2, 5));

		System.out.println(namelist2);

		// Convertion ArrayList to Array

		ArrayList<Integer> Convert = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

		Object[] e = Convert.toArray();

		System.out.println(Arrays.toString(e));

		for (Object dim : e) {
			System.out.println(dim);
		}

	}
}
