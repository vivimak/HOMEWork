package com.vivi.utils;

import java.util.Random;
import java.util.Scanner;

/*���ù����ࣺ������һЩ���õĺ���*/
public class CommonUtils {
	private static Scanner in=new Scanner(System.in);
	private static Random random=new Random();
	
	/*����0-n��Χ���������������n����*/
	public static int random(int n){
		return random.nextInt(n);
	}
	/*����a-b��Χ�������������a����b��*/
	public static int random(int a,int b){
		return a+random.nextInt(b+1-a);
	}
	public static Scanner getScanner(){
		return in;
	}
}
