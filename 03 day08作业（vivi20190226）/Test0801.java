/*
Day08
作业一：设计“window回收站”程序，该程序具备以下几个功能
1.加入回收站
2.清空回收站
回收站最多只能装10个，满了后提示“回收站已满，请清空”

通过控制台输入命令完成这些功能*/


class windowRecycle{
	
	//定义静态成员变量
	public static int count=0;

	//定义静态方法
	public static void addRecycle(){
		System.out.println("加入回收箱");
	}
	public static void cleanRecycle(){
		System.out.println("已清空回收箱");
	}

}

class Test0801{
	public static void main(String[] args){
		for(int count=0;count<10;count++){
			windowRecycle.addRecycle();
		}
		System.out.println("回收站已满，请清空。");
		windowRecycle.cleanRecycle();
	}
}
