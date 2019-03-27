package com.vivi.entity;

import com.vivi.utils.CommonUtils;
import com.vivi.entity.GuaiWu;

public class JueSe {
	//角色名字
	private String name;
	//攻击力
	private int atk;
    //生命值
	private int hp;
	//当前位置
	private int position=-1;
	//创建读取公共接口
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getAtk(){
		return atk;
	}
	public void setAtk(int atk){
		this.atk=atk;
	}
	public int getHp(){
		return hp;
	}
	public void setHp(int hp){
		this.hp=hp;
	}
	public int getPosition(){
		return position;
	}
	public void setPosition(int position){
		this.position=position;
	}
	/*掷筛子*/
	public static int zhiShaizi(){
		return CommonUtils.random(1,6);
	}
	/*攻击怪物*/
	public void gongJi(GuaiWu gw){
		int hp=gw.getHp();
		hp=hp-atk;
		gw.setHp(hp);
		if(gw.getHp()<0){
			gw.setHp(0);
		}
	}
	public String toString(){
		return "角色昵称："+name+"\n攻击力："+atk+"\nHP生命值："+hp+"\n当前所在位置："+(position+1);
	}
}
