package com.javaex.ex01;

public class Customer extends Person {//부모 person클래스 상속받기
	
	//필드 만들기-----------------------
		private int cNo;
		private int point;
	//내가 작성한 코드와 선생님코드와 일치
	//name,hp는 person으로부터 상속받았기때문에 다시 선언 해줄필요 없다
	//----------------------------------------------------
		
		//Person클래스에서 기본 생성자인 
	    //public Person() { }를 선언했으므로 요기 아래코드로 바로 가기?
		
//		public Customer(String name, String hp, int cNo, int point) {
//			super(name, hp);
//			this.cNo = cNo;
//			this.point = point;
//			
//		} //로 작성해주고
		
		//선생님 코드 아래와 같이..
		public Customer () {
			
		}
		
		public Customer(String name, String hp, int cNo, int point) {
			super(name,hp); //부모 생성자 호출
		}
	
	//----------------------------------
		//getter,setter
		public Customer(int cNo, int point) {
			this.cNo = cNo;
			this.point = point;
			
//			System.out.println( " stuent (1 parameter))");// 
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
//			super.showInfo();
			System.out.println("이름:" + name + ", #핸드폰:" + hp + " #고객번호:" + cNo + " #포인트점수:" + point);	
		}
				
		
		
		
	

	
}
