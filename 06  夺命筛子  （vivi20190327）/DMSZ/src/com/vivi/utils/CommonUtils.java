package com.vivi.utils;

import java.util.Random;
import java.util.Scanner;

/*常用工具类：定义了一些常用的函数*/
public class CommonUtils {
	private static Scanner in=new Scanner(System.in);
	private static Random random=new Random();
	
	/*产生0-n范围的随机数（不包含n本身）*/
	public static int random(int n){
		return random.nextInt(n);
	}
	/*产生a-b范围的随机数（包含a包含b）*/
	public static int random(int a,int b){
		return a+random.nextInt(b+1-a);
	}
	public static Scanner getScanner(){
		return in;
	}
}
