//package com.javaex.ex01;
//
//public class Customer extends Person {//부모 person클래스 상속받기
//	
//	//필드 만들기-----------------------
//		private int cNo;
//		private int point;
//	//내가 작성한 코드와 선생님코드와 일치
//	//name,hp는 person으로부터 상속받았기때문에 다시 선언 해줄필요 없다
//	//----------------------------------------------------
//		
//		//선생님 코드 아래와 같이..
//		public Customer () {
//			System.out.println("Customer 생성자 (0) 호출");
//		}
//		//-------요아래 코드는 선생님작성하신 코드와 일치함
//		public Customer(String name, String hp, int cNo, int point) {
//			super(name, hp);     //부모 생성자 호출해준다
//			this.cNo = cNo;
//			this.point = point;
//			System.out.println("Customer 생성자 Person(4) 호출");
//			
//		} 
//	//----------------------------------
//		//getter,setter// 내가 작성한 코드와 선생님 코드와 일치
//			public int getcNo() {
//			return cNo;
//		}
//		
//		public void setcNo() {
//			this.cNo = cNo;
//			
//		}
//		
//		public int getpoint() {
//			return point;
//		}
//		
//		public void setpoint() {
//			this.point = point;
//			
//		}
//		//------------------------------------

//		//선생님 get코드로 써보기
//		@Override
//		public void showInfo() {
////			super.showInfo();
//			System.out.println("이름:" + super.getName()
//					+ ", #핸드폰:" + super.gethp() 
//					+ " #고객번호:" + this.getcNo() + 
//					" #포인트점수:" + this.point);	
//		}
//=======================================================================
package com.javaex.ex01;

public class Customer extends Person {//부모 person클래스 상속받기
	
	//필드 만들기-----------------------
		private int cNo;
		private int point;
	
	//----------------------------------------------------
		
		public Customer(String name, String hp, int cNo, int point) {
			super(name, hp);     //부모 생성자 호출해준다
			this.cNo = cNo;
			this.point = point;
//			System.out.println("Customer 생성자 Person(4) 호출");
			
		} 
		
	//----------------------------------
		//getter,setter// 내가 작성한 코드와 선생님 코드와 일치
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
		
		
