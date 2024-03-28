package com.javaex.ex04;

public class User {
	
	//필드-------------------------------------------
	protected String id;
	protected String password;
	protected String name;
	
//	private String id;
//	private String password;
//	private String name;
	//id,password,name의 총3개의 필드 선언함
	//외부에서 악용하지않도록 가급적 private으로 필드는 은닉한다
	//protected로 변경해보기 //
	
	//-생성자-----------------------------------------
	public User() {
		
	}					//기본생성자
	
	public User(String id, String password, String name) {
		this.id =id;
		this.password = password;
		this.name =name;
		
	}			//외부데이터 내부에 할당해주는 전체필드생성자 세팅
	
	//기본생성자와 전체필드생성자 총 2개 만들기
	
	//getter&setter----------------------------------
	
	public String getid() {
		return id;
	}
	
	public void setid(String id) {
		this.id = id;
	}
	
	public String getpassword() {
		return password;
	}
	
	public void setpassword(String password) {
		this.password = password;
	}
	
	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	//showInfo() 출력메소드 -----------------------------
	
	public void showInfo() {
		System.out.println("#id:" + id +
				", #password:" + password +
				", #name:" + name);
		
	}
	
	
	
}
