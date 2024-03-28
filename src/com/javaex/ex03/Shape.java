package com.javaex.ex03;

public class Shape {
	
	protected String fillColor;
	protected String lineColor;
	
	
	public Shape() {
		
	}
	//생성자 선언하지 않으면 
	//기본 생성자를 자동으로 추가
	//임의로 생성자를 선언하면
	//기본 생성자를 자동으로 추가하지않음
	//객체화를 위해 필수로 생성자를 거쳐야 한다
	
	public Shape(String fillColor, String lineColor) {
	this.fillColor = fillColor;
	this.lineColor = lineColor;
	
	}
	
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
		
	}
	
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
	
}

