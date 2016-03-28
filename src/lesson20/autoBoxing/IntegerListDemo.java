package lesson20.autoBoxing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IntegerListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List list = new ArrayList(10);
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}

		Iterator i = list.iterator();
		while (i.hasNext()) {
			int num = (Integer) i.next();
			Integer obj = num;
			int prim = obj;
		}

		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(new Integer(5));
		list2.add(7);

		Iterator<Integer> i2 = list2.iterator();
		while (i2.hasNext()) {
			int num = i2.next();
		}
	}
}
