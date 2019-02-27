/*
Day11
作业二：有大雁和飞机两个事物，飞机和大雁都具备飞行的行为，定义一个函数送大雁和飞机上天！！
后期增加了风筝事物，使用该函数依旧可以送它上天！！*/


//定义飞行接口
interface Fly{
	public abstract void flying(); 
}

//定义事物，继承接口
class Dayan implements Fly{
	public void flying(){
		System.out.println("大雁飞上天了");
	}
}

class Plane implements Fly{
	public void flying(){
		System.out.println("飞机飞上天了");
	}
}

class FengZheng implements Fly{
	public void flying(){
		System.out.println("风筝飞上天了");
	}
}

//测试类
class Test1102{
	public static void main(String[] args){
		Dayan dy=new Dayan();
		Plane plane=new Plane();
		FengZheng fz=new FengZheng();
		dy.flying();
		plane.flying();
		fz.flying();
	}
}
