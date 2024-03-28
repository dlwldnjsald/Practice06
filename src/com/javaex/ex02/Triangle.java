package com.javaex.ex02;

public class Triangle extends Shape{
	
	//필드
	private int width;
	private int height;
	
	//생성자
	public Triangle() {
		System.out.println("생성자 Triangle (0) 호출");
		
	}//기본생성자 생성
	
	public Triangle(int width, int height) {
		super("검정", "빨강");
		this.width = width;
		this.height = height;
		System.out.println("생성자 Triangle (2) 호출");
		
	}
	
	public Triangle(String FillColor,
			String LineColor,
			int width,
			int height) {
		
	// 먼저 부모 초기화
	super(FillColor,LineColor);
	this.width = width;
	this.height = height;
	
	System.out.println("생성자 Triangle (4) 호출");
	}
}
	
	


