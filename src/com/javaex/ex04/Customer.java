package com.javaex.ex04;

public class  Customer extends User {
	
	
	//필드선언
	private int point;
	
	
	//생성자 ->기본생성자
	public Customer() {
		
	}
	
	
	//id, password,name, point 설정
	public Customer(String id,
			String password,
			String name,
			int point) {
		
		super(id, password, name);
		this.point = point;
	}
	
	//point와 관련된 getter&setter설정
	public int getPoint() {
		return point;
	}
	
	public void setPoint(int point) {
		this.point = point;
	}
	
	//showInfo메서드를 부모로부터 물려받았음 
	//point라고 하는 부가 변수를 갖고있진 않기때문에 
	//부모로부터 물려받은 메소드를 무시하고 자신의 코드를 새로 세팅해준다
	//이게 바로 override
	
	@Override
	public void showInfo() {
		System.out.println("#아이디:" + id +
							", #비밀번호: " + password +
							", #이름:" + name +
							", #포인트:" + point);
		
	}
	
	
	
	
	
	
	
	
	
	
}
