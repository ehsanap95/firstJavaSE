package start;

import java.util.ArrayList;
import java.util.List;

public class Starter {

	private int a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String b;
	
		System.out.println("Start Java From Linux");
	
		List<String> list = new ArrayList<String>();
	
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("4.5");
		list.add("5");
		list.add("6");
		list.add("Saaaaaaaalaaaaaaaaaaaaammmmm");
	
		for (String string : list) {
			System.out.println(string);
		}
	
	}

	public void newMethod() throws Exception {
		String b;
	
		System.out.println("Start Java From Linux");
	
		List<String> list = new ArrayList<String>();
	
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");
	
		for (String string : list) {
			System.out.println(string);
		}
		
		if(true)
		throw new Exception();
	
		System.out.println("salam");
		
	}

}
