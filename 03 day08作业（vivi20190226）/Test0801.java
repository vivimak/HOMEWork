/*
Day08
��ҵһ����ơ�window����վ�����򣬸ó���߱����¼�������
1.�������վ
2.��ջ���վ
����վ���ֻ��װ10�������˺���ʾ������վ����������ա�

ͨ������̨�������������Щ����*/


class windowRecycle{
	
	//���徲̬��Ա����
	public static int count=0;

	//���徲̬����
	public static void addRecycle(){
		System.out.println("���������");
	}
	public static void cleanRecycle(){
		System.out.println("����ջ�����");
	}

}

class Test0801{
	public static void main(String[] args){
		for(int count=0;count<10;count++){
			windowRecycle.addRecycle();
		}
		System.out.println("����վ����������ա�");
		windowRecycle.cleanRecycle();
	}
}
