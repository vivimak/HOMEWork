package com.vivi.entity;

import com.vivi.entity.ZB;

/*Hp����ֵ�䱦*/
public class HPZB extends ZB{
	public void method(JueSe js){
		int hp=js.getHp();
		hp=hp+130;
		js.setHp(hp);
	}
}
