package start;

import java.util.ArrayList;
import java.util.List;

public class TestUdemy {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String a = "";

		List<String> list = new ArrayList<String>();

		list.add("-");
		list.add("A");//avalin
		list.add("B");
		list.add(".");

		for (int i = 0; ++i < list.size();) {
			a += list.get(i);
		}

		if (true)
//		throw new Exception();

			System.out.println(a);

	}

}
