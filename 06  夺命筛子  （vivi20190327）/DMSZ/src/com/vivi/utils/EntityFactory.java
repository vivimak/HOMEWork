package com.vivi.utils;

import com.vivi.entity.AtkZB;
import com.vivi.entity.GuaiWu;
import com.vivi.entity.HPZB;
import com.vivi.entity.JueSe;
import com.vivi.entity.SuDuZB;
import com.vivi.entity.ZB;
import com.vivi.utils.CommonUtils;

/*实体类对象工厂*/
public class EntityFactory {
	public static JueSe newJueSe(String name){
		JueSe js=new JueSe();
		int atk=CommonUtils.random(15,30);
		int hp=CommonUtils.random(450,600);
		js.setName(name);
		js.setAtk(atk);
		js.setHp(hp);
		return js;
	}
	public static GuaiWu newGuaiWu(){
		GuaiWu gw=new GuaiWu();
		int value=CommonUtils.random(3);
		switch(value){
		case 0:
			gw.setName("独角兽");
			gw.setAtk(CommonUtils.random(30,50));
			gw.setHp(CommonUtils.random(150,250));
			break;
		case 1:
			gw.setName("壁虎小强");
			gw.setAtk(CommonUtils.random(20,35));
			gw.setHp(CommonUtils.random(100,180));
			break;
		case 2:
			gw.setName("小松鼠");
			gw.setAtk(CommonUtils.random(5,10));
			gw.setHp(CommonUtils.random(20,50));
			break;
		}
		return gw;
	}
	public static ZB newZhenbao(){
		ZB zb=null;
		int value=CommonUtils.random(3);
		switch(value){
		case 0:
			zb=new AtkZB();
			zb.setName("草泥马力量药剂");
			break;
		case 1:
			zb=new HPZB();
			zb.setName("草泥马HP药剂");
			break;
		case 2:
			zb=new SuDuZB();
			zb.setName("凌波微步汤");
			break;
		}
		return zb;	
	}
}
