package com.vivi.entity;

import com.vivi.utils.CommonUtils;
import com.vivi.entity.ZB;
import com.vivi.entity.GameMap;

public class SuDuZB extends ZB {
	public void method(JueSe js){
		/*产生2-6的随机数*/
		int n=CommonUtils.random(2,6);
		int position=js.getPosition();
		position=position+n;
		js.setPosition(position);
		/*如果角色位置超过最大位置，则设其位置为数组最大下标*/
		if(js.getPosition()>GameMap.Map_Length-1){
			js.setPosition(GameMap.Map_Length-1);
		}
	}
}
