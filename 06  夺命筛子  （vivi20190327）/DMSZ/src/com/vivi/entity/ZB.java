package com.vivi.entity;

import com.vivi.entity.JueSe;

public abstract class ZB {
	private String name;
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public abstract void method(JueSe js);
}
