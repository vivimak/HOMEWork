package com.vivi.entity;

import com.vivi.utils.CommonUtils;
import com.vivi.entity.ZB;
import com.vivi.entity.GameMap;

public class SuDuZB extends ZB {
	public void method(JueSe js){
		/*����2-6�������*/
		int n=CommonUtils.random(2,6);
		int position=js.getPosition();
		position=position+n;
		js.setPosition(position);
		/*�����ɫλ�ó������λ�ã�������λ��Ϊ��������±�*/
		if(js.getPosition()>GameMap.Map_Length-1){
			js.setPosition(GameMap.Map_Length-1);
		}
	}
}
