package com.javaex.ex01;
//1)먼저 부모 필드 생성하기
//2)그다음 자식필드 생성하기

public class Person {
	//person이 상위클래스 부모클래스, customer가 하위클래스 자식클래스로 설정됨
	
//	protected String name;
//	protected String hp;      //필드에 name,hp 2개 선언;
	private String name;
	private String hp;  	//필드엔 private로 정보 은닉하기 (선생님코드)
	
	//----------------------------------------------
	
	//생성자//생성자만드는것에 집중하자
	public Person() {
		System.out.println("생성자 Person(0) 호출");
	}								//?(선생님코드
//	public Person() {
//		
//    }              //기본 생성자 선언(옆의 주석처리한 코드는 내가 작성한 코드)
	//--------------------------------------------------
	public Person(String name, String hp) {
		this.name = name;
		this.hp = hp;
			
	}//이부분은 선생님 코드와 같이 작성함 생성자 name,hp
	//외부로 받는 name데이터를 이 위의 name변수에 할당해준다
	//외부로 받는 hp데이터를 이 위의 hp변수에 핼당해준다
	
	
	//------------------------------------------------
	
	//getter,setter//아래 작성한 코드는 선생님코드와 일치
	
	public String getName() { 		
		return name;			//내부 name데이터 뽑아서 밖으로 돌려준다 리턴
	}
	public void setName(String name) { //외부데이터를 받아서 내부에 세팅해주니
										//리턴할필요가 없어서 void도 작성 
		this.name = name;				//외부name값 할당
	}
	
	//---------------
	public String gethp() {
		return hp;
	}
	public void sethp(String hp) {
		this.hp = hp;
	}
	
	//--------------------------------------------------
	
	//showInfo()영역만들기//출력을 위한 코드 출력 메서드인 showInfo()
	//이 아래 부분도 선생님 코드와 일치함//
	public void showInfo() {
		System.out.println("이름:" + name + ", #핸드폰:" + hp);
		
	}
	
	//--------------------------------------------------
		
}
