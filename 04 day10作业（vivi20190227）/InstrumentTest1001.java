/*
Day 10
作业一：1.请编码实现如下需求：乐器（Instrument）分为：钢琴(Piano)、小提琴(Violin)
各种乐器的弹奏（play）方法各不相同
。编写一个测试类InstrumentTest，
要求：
编写方法testPlay，对各种乐器进行弹奏测试。要依据乐器的不同进行相应的弹奏，
在main方法中进行测试。*/

//定义父类-乐器
abstract class Instrument{
	public abstract void play(); 
}

//定义子类
class Piano extends Instrument{
	public void play(){
		System.out.println("钢琴弹奏");
	}
}

class Violin extends Instrument{
	public void play(){
		System.out.println("小提琴弹奏");
	}
}

//测试类
class InstrumentTest1001{
	public static void main(String[] args){
		Piano piano=new Piano();
		Violin violin=new Violin();
		piano.play();
		violin.play();
	}
}
