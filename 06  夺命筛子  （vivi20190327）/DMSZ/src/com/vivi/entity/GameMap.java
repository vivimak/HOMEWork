package com.vivi.entity;

import com.vivi.utils.CommonUtils;

/*��Ϸ��ͼ
 * 0--��ͨ����
 * 1--�䱦����
 * 2--�������*/

public class GameMap {
	/*��ͼ����*/
	public static final int Map_Length=100;
	private int[] map=new int[Map_Length];
	private static GameMap instance=new GameMap();
	public static GameMap getInstance(){
		return instance;
	}
	
	/*��ʼ����ͼ�ϵĹ�����䱦*/
	private GameMap(){
		//�䱦�͹��������
		int count=Map_Length/4;
		//�����䱦
		for(int i=0;i<count;i++){
			int n=CommonUtils.random(0,Map_Length-1);
			if(map[n]!=0){
				i--;
			}else{
				map[n]=1;
			}
		}
		//�������
		for(int i=0;i<count;i++){
			int n=CommonUtils.random(0,Map_Length-1);
			if(map[n]!=0){
				i--;
			}else{
				map[n]=2;
			}
		}
	}
	/*��ȡ�������ࣺ0��ͨ���ӣ�1�䱦���ӣ�2�������*/
	public int getType(int index){
		return map[index];
	}//д��ط�������д����GameMap���������ˣ��������Ӧ�ö���������
}
