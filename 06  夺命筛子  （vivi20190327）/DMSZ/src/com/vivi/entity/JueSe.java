package com.vivi.entity;

import com.vivi.utils.CommonUtils;
import com.vivi.entity.GuaiWu;

public class JueSe {
	//��ɫ����
	private String name;
	//������
	private int atk;
    //����ֵ
	private int hp;
	//��ǰλ��
	private int position=-1;
	//������ȡ�����ӿ�
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
	/*��ɸ��*/
	public static int zhiShaizi(){
		return CommonUtils.random(1,6);
	}
	/*��������*/
	public void gongJi(GuaiWu gw){
		int hp=gw.getHp();
		hp=hp-atk;
		gw.setHp(hp);
		if(gw.getHp()<0){
			gw.setHp(0);
		}
	}
	public String toString(){
		return "��ɫ�ǳƣ�"+name+"\n��������"+atk+"\nHP����ֵ��"+hp+"\n��ǰ����λ�ã�"+(position+1);
	}
}
