package com.vivi.entity;

public class GuaiWu {
	//��������
	private String name;
	//������
	private int atk;
	//hp����ֵ
	private int hp;
	//���ý��սӿ�
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
	/*������ɫ*/
	public void gongJi(JueSe js){
		int hp=js.getHp();
		hp=hp-atk;
		js.setHp(hp);
		if(js.getHp()<0){
			js.setHp(0);
		}
	}
	
}
