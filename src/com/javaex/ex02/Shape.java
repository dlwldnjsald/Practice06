package com.javaex.ex02;

public class Shape {
	//필드
	private String FillColor;
	private String LineColor;


	public Shape() {
		System.out.println("생성자 Shape (0) 호출");
	}
	
	public Shape(String Fillcolor,String LineColor) {
		this.FillColor = Fillcolor;
		this.LineColor = LineColor;
		System.out.println("생성자 Shape (2) 호출");
	}	
	
	


}

