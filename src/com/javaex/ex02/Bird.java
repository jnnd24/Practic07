package com.javaex.ex02;

public abstract class Bird {
	
	//필
    private String name;

	
	//생
	public Bird() {
		super();
	}
    
	public Bird(String name) {
		super();
		this.name = name;
	}

	//GS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//메일
	
	public void fly() {
		
	}
	
	public void sing() {
		
	}
	
	public void showName() {
		
	}
	
	
	


}
