package com.javaex.ex01;

public class Customer extends Person {		//부모 person클래스 상속받기
	
	//필드 만들기-----------------------
		private int cNo;
		private int point;
		
	//--------------------------------
		
		//Person클래스에서 기본 생성자인 
	    //public Person() { }를 선언했으므로
		
		public Customer(String name, String hp, int cNo, int point) {
			super(name, hp);
			this.cNo = cNo;
			this.point = point;
			
			System.out.println( " Customer(3 parameter))");
		} //로 작성해주고
	
	//----------------------------------
		//getter,setter
		public Customer(int cNo, int point) {
			super("Unknown", 0);
			this.cNo = cNo;
			this.point = point;
			
			System.out.println( " stuent (1 parameter))");// 
		}
		//-------------------------------
		public int getcNo() {
			return cNo;
		}
		
		public void setcNo() {
			this.cNo = cNo;
			
		}
		
		public int getpoint() {
			return point;
		}
		
		public void setpoint() {
			this.point = point;
			
		}
		//------------------------------------
		@Override
		public void showInfo() {
			super.showInfo();
			System.out.println("이름:" + name + ", #hp:" + hp + " #고객번호:" + cNo + " #포인트점수:" + point);	
		}
				
		
		
		
	

	
}
