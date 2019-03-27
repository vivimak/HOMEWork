package com.vivi.utils;

import java.util.Scanner;

import com.vivi.entity.JueSe;
import com.vivi.entity.GuaiWu;
import com.vivi.entity.GameMap;
import com.vivi.entity.ZB;
import com.vivi.utils.CommonUtils;

public class ViewUtils {
	/*false��ʾ��Ϸδ������true��ʾ��Ϸ����*/
	private static boolean isGameOver=false;
	private static Scanner in=CommonUtils.getScanner();
	public static void sop(Object obj){
		System.out.println(obj);
	}
	public static void startGame(){
		sop("*****��ӭ�������ɸ����Ϸ*****");
		sop("*****�������ɫ���ǳ�*****");
		/*������ɫ����*/
		String name=in.next();
		JueSe js=EntityFactory.newJueSe(name);
		sop(js.toString());
		do{
			zhiShaizi(js);
		}while(!isGameOver);
		sop("*****��Ϸ����*****");
	}
	public static void zhiShaizi(JueSe js){
		sop("*****�Ƿ�ʼ��ɸ�ӣ���y/n��*****");
		String input=in.next();
		if(input.equals("y")){
			int value=JueSe.zhiShaizi();
			/*ǰ������*/
			js.setPosition(js.getPosition()+value);
			/*�ж�ǰ�����Ӻ��Ƿ񳬳���ͼ�ϵ����һ�����ӣ�����ǣ��ص����һ������*/
			if(js.getPosition()>GameMap.Map_Length-1){
				js.setPosition(GameMap.Map_Length-1);
			}
			sop("����"+value+"���㣬ǰ����ǰλ��Ϊ��"+(js.getPosition()+1));
			/*��ȡ��������*/
			int type=GameMap.getInstance().getType(js.getPosition());
			
			switch(type){
			case 0:
				break;
			case 1:
				//�����䱦
				ZB zb=EntityFactory.newZhenbao();
				sop("�����䱦"+zb.getName()+"�����Ե�֮��");
				//�䱦���ؼ�
				zb.method(js);
				break;
			case 2:
				//��������
				GuaiWu gw=EntityFactory.newGuaiWu();
				sop("��������"+gw.getName()+"��ʼ��Է���ɱ");
				//�������ɫ���๥����ֱ��ĳ��������ֹͣ
				do{
					js.gongJi(gw);
					gw.gongJi(js);
				}while(js.getHp()>0&&gw.getHp()>0);
				//�ж����ķ�����
				if(gw.getHp()==0){
					sop("*****�����ѱ�ɱ��****");
				}else{
					sop("*****"+js.getName()+"��Ϸʧ��****");
					isGameOver=true;
				}
				break;
			 }
			sop(js.toString());
			//�ж��Ƿ񵽴��յ�
			if(js.getPosition()==GameMap.Map_Length-1)
				isGameOver=true;
		}
	}
}
