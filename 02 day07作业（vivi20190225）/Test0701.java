/*1.在程序中，经常要对时间进行操作，但是并没有时间类型的数据。
那么，我们可以自己实现一个时间类，来满足程序中的需要。定义名为MyTime的类，
其中应有三个整型成员：时（hour），分（minute），秒（second），
为了保证数据的安全性，这三个成员变量应声明为私有。 为MyTime类定义构造方法，
以方便创建对象时初始化成员变量。再定义diaplay方法，用于将时间信息打印出来。
为MyTime类添加以下方法： 
addSecond(int sec) 
addMinute(int min) 
addHour(int hou) 
subSecond(int sec)
subMinute(int min) 
subHour(int hou)  
分别对时、分、秒进行加减运算。
*/

class MyTime{
	private int hour;
	private int minute;
	private int second;

	//定义构造函数
	MyTime(int hour,int minute,int second){
		this.setHour(hour);
		this.setMinute(minute);
		this.setSecond(second);
	}	 

	//hour的设置及获取
	public void setHour(int hour){
		if(hour<0||hour>24){
			System.out.println("输入时间范围有误！");
			return;
		}else{
			this.hour=hour;
		}
	}
	public int getHour(){
		return this.hour;
	}

	//minute的设置及获取
	public void setMinute(int minute){
		if(minute<0||minute>60){
			System.out.println("输入时间范围有误！");
			return;
		}else{
			this.minute=minute;
		}
	}
	public int getMinute(){
		return this.minute;
	}

	//second的设置及获取
	public void setSecond(int second){
		if(second<0||second>60){
			System.out.println("输入时间范围有误！");
			return;
		}else{
			this.second=second;
		}
	}
	public int getSecond(){
		return this.second;
	}

	//定义时间加减运算的方法
	public void addSecond(int sec){
		if(sec<0||sec>60){
			System.out.println("输入时间范围有误！");
			return;
		}
		if(second+sec>60){
			second=(second+sec)%60;
		}else{
			second=second+sec;
		}	
	}

	public void addMinute(int min){
		if(min<0||min>60){
			System.out.println("输入时间范围有误！");
			return;
		}
		if(minute+min>60){
			minute=(minute+min)%60;
		}else{
			minute=minute+min;
		}	
	}

	public void addHour(int hou){
		if(hou<0||hou>24){
			System.out.println("输入时间范围有误！");
			return;
		}
		if(hour+hou>24){
			hour=(hour+hou)%24;
		}else{
			hour=hour=hou;
		}	
	}


	public void subSecond(int sec){
		if(sec<0||sec>60){
			System.out.println("输入时间有误！");
			return;
		}
		if(second-sec<0){
			second=60+second-sec;
		}else{
			second=second-sec;
		}
	}

	public void subMinute(int min){
		if(min<0||min>60){
			System.out.println("输入时间有误！");
			return;
		}
		if(minute-min<0){
			minute=60+minute-min;
		}else{
			minute=minute-min;
		}
	}

	public void subHour(int hou){
		if(hou<0||hou>24){
			System.out.println("输入时间有误！");
			return;
		}
		if(hour-hou<0){
			hour=24+hour-hou;
		}else{
			hour=hour-hou;
		}
	}

	//定义display方法
	public void display(){
		System.out.println("现在的时间是："+hour+"时 "+minute+"分 "+second+"秒。");
	}
}

class Test0701{
	public static void main(String[] args){
	MyTime mytime=new MyTime(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
	mytime.display();
	}
}