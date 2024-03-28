package com.javaex.ex01;

public class Person {
	//person이 상위클래스 부모클래스, customer가 하위클래스 자식클래스로 설정됨
	
	protected String name;
	protected String hp;      //필드에 name,hp 2개 선언;
	
	//----------------------------------------------
	
	//생성자// 

	public Person() {
		
    }                       //기본 생성자 선언
	
	public Person(String name, String hp) {
		this.name = name;
		this.hp = hp;
			
	}								//생성자 name,hp
	//외부로 받는 name데이터를 이 위의 name변수에 할당해준다
	//외부로 받는 hp데이터를 이 위의 hp변수에 핼당해준다
	
	//------------------------------------------------
	
	//getter,setter//
	
	public String getName() {
		return name;
	}
	public void setName(String name) { //return안하니까 void
		this.name = name;				//외부name값 할당
	}
	
	//--------------------------------
	public String gethp() {
		return hp;
	}
	public void sethp(String hp) {
		this.hp = hp;
	}
	
	//--------------------------------------------------
	
	//showInfo()영역만들기//
	
	public void showInfo() {
		System.out.println("이름:" + name + ", #hp:" + hp);
		
	}
	
	//--------------------------------------------------
		
}
