package com.javaex.ex05;

public class Depart extends Employee {
		
	 //필드 작성------------------------------------
	private String department;  //부서정보 부가로 추가
	
	//생성자---------------------------------------
	//기본생성자
	public Depart() {
		
	}
	//----------------
	//name, salary, department 매개변수 생성자 
	public Depart(String name, int salary, 
			String department) {
		super(name, salary); //부모 먼저 초기화
		this.department = department; //나머지 초기화
	}
	//-------------------------------------------
	//getter,setter->about department..
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}

	//-------------------------------------------
	//showInformation()
	
	@Override
	public void showInformation() {
		System.out.println("이름:" + super.getName() + 
				", 연봉:" + super.getSalary() +
				", 부서:" + department);
		
	super.showInformation(); // 부모 showInfo()호출시
	}









}
