/*
Day11 
作业一：1.我们假设一个饮品店要制作各种果汁，我们知道制作果汁的过程都是相似的，比如先加水，再加水果，再加冰......
只是具体配料不同而已，我们也明白这些步骤的顺序是不能改变的（我假设不能吧），如果这个店招了一个服务员，
这个服务员做事马马虎虎，老是忘记制作果汁的几个骤或者弄乱了制作顺序，导致经常制作失败，给小店带来损失，
老板招不到别人就只好继续用他，为了减少损失，老板写了一个详细的制作步骤在一张纸上，其中只是步骤的名称，
要求该服务员每次制作之前都要看一遍按上面的步骤来做，根据具体制作果汁的种类来实现具体的步骤。*/




abstract class MakingJuice{
	public abstract void addWater();
	public abstract void addFruit();
	public abstract void addIcecube();
	public void makingMethod(){
		System.out.println("制作方法如下：");
		addWater();
		addFruit();
		addIcecube();
	}
}

class AppleJuice extends MakingJuice{
	public void addWater(){
		System.out.println("加一杯饮用水");
	}
	public void addFruit(){
		System.out.println("加一个苹果");
	}
	public void addIcecube(){
		System.out.println("加5个冰块\n");
	}
}

class OrangeJuice extends MakingJuice{
	public void addWater(){
		System.out.println("加半杯饮用水");
	}
	public void addFruit(){
		System.out.println("加一个橙子");
	}
	public void addIcecube(){
		System.out.println("加8个冰块\n");
	}
}

class Test1101{
	public static void main(String[] args){
		AppleJuice apple=new AppleJuice();
		OrangeJuice orange=new OrangeJuice();
		apple.makingMethod();
		orange.makingMethod();
	}
}