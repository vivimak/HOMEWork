package com.vivi.entity;

import com.vivi.utils.CommonUtils;

/*游戏地图
 * 0--普通格子
 * 1--珍宝格子
 * 2--怪物格子*/

public class GameMap {
	/*地图长度*/
	public static final int Map_Length=100;
	private int[] map=new int[Map_Length];
	private static GameMap instance=new GameMap();
	public static GameMap getInstance(){
		return instance;
	}
	
	/*初始化地图上的怪物和珍宝*/
	private GameMap(){
		//珍宝和怪物的数量
		int count=Map_Length/4;
		//放入珍宝
		for(int i=0;i<count;i++){
			int n=CommonUtils.random(0,Map_Length-1);
			if(map[n]!=0){
				i--;
			}else{
				map[n]=1;
			}
		}
		//放入怪物
		for(int i=0;i<count;i++){
			int n=CommonUtils.random(0,Map_Length-1);
			if(map[n]!=0){
				i--;
			}else{
				map[n]=2;
			}
		}
	}
	/*获取格子种类：0普通格子；1珍宝格子；2怪物格子*/
	public int getType(int index){
		return map[index];
	}//写错地方咯，你写到了GameMap函数里面了，这个函数应该定义在类中
}
