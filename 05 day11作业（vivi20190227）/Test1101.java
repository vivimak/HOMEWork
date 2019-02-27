/*
Day11 
��ҵһ��1.���Ǽ���һ����Ʒ��Ҫ�������ֹ�֭������֪��������֭�Ĺ��̶������Ƶģ������ȼ�ˮ���ټ�ˮ�����ټӱ�......
ֻ�Ǿ������ϲ�ͬ���ѣ�����Ҳ������Щ�����˳���ǲ��ܸı�ģ��Ҽ��費�ܰɣ���������������һ������Ա��
�������Ա��������������������������֭�ļ��������Ū��������˳�򣬵��¾�������ʧ�ܣ���С�������ʧ��
�ϰ��в������˾�ֻ�ü���������Ϊ�˼�����ʧ���ϰ�д��һ����ϸ������������һ��ֽ�ϣ�����ֻ�ǲ�������ƣ�
Ҫ��÷���Աÿ������֮ǰ��Ҫ��һ�鰴����Ĳ������������ݾ���������֭��������ʵ�־���Ĳ��衣*/




abstract class MakingJuice{
	public abstract void addWater();
	public abstract void addFruit();
	public abstract void addIcecube();
	public void makingMethod(){
		System.out.println("�����������£�");
		addWater();
		addFruit();
		addIcecube();
	}
}

class AppleJuice extends MakingJuice{
	public void addWater(){
		System.out.println("��һ������ˮ");
	}
	public void addFruit(){
		System.out.println("��һ��ƻ��");
	}
	public void addIcecube(){
		System.out.println("��5������\n");
	}
}

class OrangeJuice extends MakingJuice{
	public void addWater(){
		System.out.println("�Ӱ뱭����ˮ");
	}
	public void addFruit(){
		System.out.println("��һ������");
	}
	public void addIcecube(){
		System.out.println("��8������\n");
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