/*
Day 10
��ҵһ��1.�����ʵ����������������Instrument����Ϊ������(Piano)��С����(Violin)
���������ĵ��ࣨplay������������ͬ
����дһ��������InstrumentTest��
Ҫ��
��д����testPlay���Ը����������е�����ԡ�Ҫ���������Ĳ�ͬ������Ӧ�ĵ��࣬
��main�����н��в��ԡ�*/

//���常��-����
abstract class Instrument{
	public abstract void play(); 
}

//��������
class Piano extends Instrument{
	public void play(){
		System.out.println("���ٵ���");
	}
}

class Violin extends Instrument{
	public void play(){
		System.out.println("С���ٵ���");
	}
}

//������
class InstrumentTest1001{
	public static void main(String[] args){
		Piano piano=new Piano();
		Violin violin=new Violin();
		piano.play();
		violin.play();
	}
}
