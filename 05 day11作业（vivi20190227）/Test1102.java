/*
Day11
��ҵ�����д���ͷɻ���������ɻ��ʹ��㶼�߱����е���Ϊ������һ�������ʹ���ͷɻ����죡��
���������˷������ʹ�øú������ɿ����������죡��*/


//������нӿ�
interface Fly{
	public abstract void flying(); 
}

//��������̳нӿ�
class Dayan implements Fly{
	public void flying(){
		System.out.println("�����������");
	}
}

class Plane implements Fly{
	public void flying(){
		System.out.println("�ɻ���������");
	}
}

class FengZheng implements Fly{
	public void flying(){
		System.out.println("���ݷ�������");
	}
}

//������
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
