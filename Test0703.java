/*day7��ҵ����
Ϊ�������ķۡ�дһ���ࣺclass WuMingFen Ҫ��
(1).���������ԣ�����:String theMa ���۵ķ���(��)��int quantity���Ƿ������boolean likeSoup��
(2).дһ�����췽�����Ա��ڼ򻯳�ʼ�����̣��磺
WuMingFen f1 = new WuMingFen("ţ��",3,true);
(3).���ع��췽����ʹ�ó�ʼ�����̿��Զ�������û��ָ����Ĭ�ϲ�������
WuMingFen f2 = new WuMingFen("ţ��",2);

����ӡ����۵���Ϣ��*/

class WuMingFen{
	private String theMa;
	private int quantity;
	private boolean likeSoup;

	//��д���췽��
	public WuMingFen(String theMa,int quantity,boolean likeSoup){
		this.theMa=theMa;
		this.quantity=quantity;
		this.likeSoup=likeSoup;
	}

	public WuMingFen(String theMa,int quantity){
		this.theMa=theMa;
		this.quantity=quantity;
	}

	public String toString(){
		String soup=likeSoup?"��":"����";
		return"��һ��"+theMa+"��,"+quantity+"��;"+soup+"����";
	}
}

class Test0703{
	public static void main(String[] args){
		WuMingFen f1 = new WuMingFen("ţ��",3,true);
		WuMingFen f2 = new WuMingFen("����",2);
		System.out.println(f1.toString());
		System.out.println(f2.toString());
	}
}