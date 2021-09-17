package Collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {

		ArrayList<String> StudentList = new ArrayList<String>();

		StudentList.add("Amit");
		StudentList.add("Ali");
		StudentList.add("summit");
		StudentList.add("Pratheek");

		System.out.println("==1===");

		// for loop
		for (int i = 0; i < StudentList.size(); i++)

		{
			System.out.println(StudentList.get(i));
		}

		System.out.println("==2===");
		// for each loop

		for (String e : StudentList) {
			System.out.println(e);
		}
		System.out.println("==3===");

		// JDK 8-- stream with lamdha function

		StudentList.stream().forEach(ele -> System.out.println(ele));

		System.out.println("==4===");

		// Iterator

		Iterator<String> e = StudentList.iterator();

		System.out.println(e.hasNext());

	}

}
