package Collectiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {

		List<String> namelist = Collections.synchronizedList(new ArrayList<String>());

		namelist.add("tom");
		namelist.add("harry");
		namelist.add("puter");

		// Collections.synchronizedlist is not for add,addall, remove ,remove all,
		// to fetch/traverse the values from the list --- we have to use explicit
		// synchronisation

		Iterator<String> it = namelist.iterator();

		synchronized (it) {

			while (it.hasNext()) {
				System.out.println(it.next());
			}
		}
		System.out.println("++++++++++++++");

		// CopyOnWriteArrayList-- to be used for all,
		// fetch,traverse,add,addall,remove,removeall--to achieve explicit
		// synchronisatiom

		CopyOnWriteArrayList<String> emplist = new CopyOnWriteArrayList<String>();

		emplist.add("tom");
		emplist.add("harry");
		emplist.add("putter");

		Iterator<String> IT1 = emplist.iterator();

		while (IT1.hasNext()) {
			System.out.println(IT1.next());
		}

	}
}
