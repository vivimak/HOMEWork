package com.vivi.entity;

public class GuaiWu {
	//怪物名字
	private String name;
	//攻击力
	private int atk;
	//hp生命值
	private int hp;
	//设置接收接口
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
	/*攻击角色*/
	public void gongJi(JueSe js){
		int hp=js.getHp();
		hp=hp-atk;
		js.setHp(hp);
		if(js.getHp()<0){
			js.setHp(0);
		}
	}
	
}
