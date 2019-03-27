package com.vivi.utils;

import java.util.Scanner;

import com.vivi.entity.JueSe;
import com.vivi.entity.GuaiWu;
import com.vivi.entity.GameMap;
import com.vivi.entity.ZB;
import com.vivi.utils.CommonUtils;

public class ViewUtils {
	/*false表示游戏未结束；true表示游戏结束*/
	private static boolean isGameOver=false;
	private static Scanner in=CommonUtils.getScanner();
	public static void sop(Object obj){
		System.out.println(obj);
	}
	public static void startGame(){
		sop("*****欢迎进入夺命筛子游戏*****");
		sop("*****请输入角色的昵称*****");
		/*产生角色对象*/
		String name=in.next();
		JueSe js=EntityFactory.newJueSe(name);
		sop(js.toString());
		do{
			zhiShaizi(js);
		}while(!isGameOver);
		sop("*****游戏结束*****");
	}
	public static void zhiShaizi(JueSe js){
		sop("*****是否开始掷筛子？（y/n）*****");
		String input=in.next();
		if(input.equals("y")){
			int value=JueSe.zhiShaizi();
			/*前进格子*/
			js.setPosition(js.getPosition()+value);
			/*判断前进格子后是否超出地图上的最后一个格子，如果是，回到最后一个格子*/
			if(js.getPosition()>GameMap.Map_Length-1){
				js.setPosition(GameMap.Map_Length-1);
			}
			sop("掷了"+value+"个点，前进后当前位置为："+(js.getPosition()+1));
			/*获取格子类型*/
			int type=GameMap.getInstance().getType(js.getPosition());
			
			switch(type){
			case 0:
				break;
			case 1:
				//产生珍宝
				ZB zb=EntityFactory.newZhenbao();
				sop("遇到珍宝"+zb.getName()+"开启霸道之旅");
				//珍宝加特技
				zb.method(js);
				break;
			case 2:
				//产生怪物
				GuaiWu gw=EntityFactory.newGuaiWu();
				sop("遇到怪物"+gw.getName()+"开始与对方厮杀");
				//怪物与角色互相攻击，直到某方死亡才停止
				do{
					js.gongJi(gw);
					gw.gongJi(js);
				}while(js.getHp()>0&&gw.getHp()>0);
				//判断是哪方死亡
				if(gw.getHp()==0){
					sop("*****怪物已被杀死****");
				}else{
					sop("*****"+js.getName()+"游戏失败****");
					isGameOver=true;
				}
				break;
			 }
			sop(js.toString());
			//判断是否到达终点
			if(js.getPosition()==GameMap.Map_Length-1)
				isGameOver=true;
		}
	}
}
