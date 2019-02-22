class MyTime{
	private int hour;
	private int minute;
	private int second;

	//���幹�캯��
	MyTime(int hour,int minute,int second){
		this.setHour(hour);
		this.setMinute(minute);
		this.setSecond(second);
	}	 

	//hour�����ü���ȡ
	public void setHour(int hour){
		if(hour<0||hour>24){
			System.out.println("����ʱ�䷶Χ����");
			return;
		}else{
			this.hour=hour;
		}
	}
	public int getHour(){
		return this.hour;
	}

	//minute�����ü���ȡ
	public void setMinute(int minute){
		if(minute<0||minute>60){
			System.out.println("����ʱ�䷶Χ����");
			return;
		}else{
			this.minute=minute;
		}
	}
	public int getMinute(){
		return this.minute;
	}

	//second�����ü���ȡ
	public void setSecond(int second){
		if(second<0||second>60){
			System.out.println("����ʱ�䷶Χ����");
			return;
		}else{
			this.second=second;
		}
	}
	public int getSecond(){
		return this.second;
	}

	//����ʱ��Ӽ�����ķ���
	public void addSecond(int sec){
		if(sec<0||sec>60){
			System.out.println("����ʱ�䷶Χ����");
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
			System.out.println("����ʱ�䷶Χ����");
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
			System.out.println("����ʱ�䷶Χ����");
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
			System.out.println("����ʱ������");
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
			System.out.println("����ʱ������");
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
			System.out.println("����ʱ������");
			return;
		}
		if(hour-hou<0){
			hour=24+hour-hou;
		}else{
			hour=hour-hou;
		}
	}

	//����display����
	public void display(){
		System.out.println("���ڵ�ʱ���ǣ�"+hour+"ʱ "+minute+"�� "+second+"�롣");
	}
}

class Test0701{
	public static void main(String[] args){
	MyTime mytime=new MyTime(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
	mytime.display();
	}
}