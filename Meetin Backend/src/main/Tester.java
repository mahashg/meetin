package main;

import meetin.database.model.Events;

public class Tester {

	public static void main(String[] args) {
		Events ev = new Events();
		ev.setDescription("blah");
		ev.setId(2);
		
		Events ev2 = new Events();
		ev2.setDescription("blah");
		ev2.setId(2);
		
		
		System.out.println(ev);
		System.out.println(ev2);
		System.out.println(ev.equals(ev2));
		System.out.println(ev2.equals(ev));
		System.out.println(ev == ev2);
	}

}
