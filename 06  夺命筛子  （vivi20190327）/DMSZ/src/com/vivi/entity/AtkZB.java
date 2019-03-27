package com.vivi.entity;

import com.vivi.entity.ZB;

public class AtkZB extends ZB{
	public void method(JueSe js){
		int atk=js.getAtk();
		atk=atk+5;
		js.setAtk(atk);
	}
}
