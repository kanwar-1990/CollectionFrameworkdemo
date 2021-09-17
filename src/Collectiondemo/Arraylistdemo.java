package Collectiondemo;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraylistdemo {
	
	public static void main(String arg[])
	{
		
		// default genrics-- if wrapper class is not given then by default it will consider Object class
		// virtual capacity=10 by default,default capacity will be null for now
		// arraylist only allows Object class, hence to add the Wrapper class is used as generics , which internally type
		//type cast primitive data type into Wrapper class
		
		ArrayList ary = new ArrayList();

		// another way of creating a object of Arraylist
		System.out.println(ary.size());// PC=0

		ArrayList<Integer> ary1 = new ArrayList<Integer>(20);
		// virtual capacity =20

		ary1.add(100);
		// Other way to create an arraylist
		ArrayList<Integer> ary2 = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40));

		System.out.println(ary2);

		ArrayList<String> ary3 = new ArrayList<String>(Arrays.asList("tom", "kanwar", "helan", "gupta"));
		System.out.println(ary3);

	}

}
