package com.javaex.ex01;

public class PersonApp {

	public static void main(String[] args) {

		Person p = new Person("정우성", "010-1111-2222");
		p.showInfo();
		
		
		Customer s = new Customer("유재석", "010-2222-3333", 1, 1000);
		s.showInfo();
		

	}

}

