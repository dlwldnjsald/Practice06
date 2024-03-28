package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) { 
		
		// User 클래스와 하위 클래스를 모두 담을수 있는 배열
		User[] users = new User[3];
		
		//----------------------------------------------------------
		
	
		User u01 = new Customer("jws", "j1234", "정우성", 1000); //고객
		User u02 = new Customer("yjs", "y2345", "이효리", 2000); //고객
		User u03 = new Employee("master", "m7788", "운영자", 5_000_000); //운영자

		//3명의 사용자 배열에 등록
		//참조 자료형의 배열은 참조 객체의 주소가 할당되는것
		//객체가 직접 들어가는 것은 아니다
		users[0] = u01;
		users[1] = u02;
		users[2] = u03;
		
		for (int i = 0; i < users.length; i++) {
			users[i].showInfo();
		}
		
		//----------------------------------------------------------
		//int salary = u03
		//u03이 안들어가기때문에 다운캐스팅 해주어야
		//u03-> user 에서 employee로 변경해줘야 
		int salary = ((Employee)u03).getSalary();
		
		//출력--------------------------------------------------------
		System.out.println("운영자의 월급은 " + salary + "원입니다.");
			
		
		
		
	}

}
