package com.vivi.utils;

import com.vivi.entity.AtkZB;
import com.vivi.entity.GuaiWu;
import com.vivi.entity.HPZB;
import com.vivi.entity.JueSe;
import com.vivi.entity.SuDuZB;
import com.vivi.entity.ZB;
import com.vivi.utils.CommonUtils;

/*ʵ������󹤳�*/
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
			gw.setName("������");
			gw.setAtk(CommonUtils.random(30,50));
			gw.setHp(CommonUtils.random(150,250));
			break;
		case 1:
			gw.setName("�ڻ�Сǿ");
			gw.setAtk(CommonUtils.random(20,35));
			gw.setHp(CommonUtils.random(100,180));
			break;
		case 2:
			gw.setName("С����");
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
			zb.setName("����������ҩ��");
			break;
		case 1:
			zb=new HPZB();
			zb.setName("������HPҩ��");
			break;
		case 2:
			zb=new SuDuZB();
			zb.setName("�貨΢����");
			break;
		}
		return zb;	
	}
}
