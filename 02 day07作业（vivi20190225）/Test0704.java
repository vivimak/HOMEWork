/*
Day07
��Ŀ4��ʹ����������˼�������������
��������ѧ�ֱ�С����С��͡����С�����Уʱ��ֱ���1907��1893������һ��У�������й�22���࣬������12���࣬ÿ����ʦ��һ���࣬
ÿ�����ѧ���������ȣ��ֱ���30-50��֮�䡣
����������ݺ󣬴�ӡЧ�����£�

ѧУ������
У����(������xxx�����䣺xx ����ҵԺУ��xxx)
��Уʱ�䣺1907��
�������ң��쳯
��22���༶��

�༶�ţ�xxx  �����Σ�xxx  ��x��ѧ����
һ��ѧ��Ϯ��
������xxx  ���䣺xxx  �Ա�x
������xxx  ���䣺xxx  �Ա�x

�༶�ţ�xxx  �����Σ�xxx  ��x��ѧ����
һ��ѧ��Ϯ��
������xxx  ���䣺xxx  �Ա�x
������xxx  ���䣺xxx  �Ա�x

-----------�����Ƿָ���----------------

ѧУ������
У����(������xxx�����䣺xx ����ҵԺУ��xxx)
��Уʱ�䣺1893��
�������ң��쳯
��12���༶��

�༶�ţ�xxx  �����Σ�xxx  ��x��ѧ����
һ��ѧ��Ϯ��
������xxx  ���䣺xxx  �Ա�x
������xxx  ���䣺xxx  �Ա�x

�༶�ţ�xxx  �����Σ�xxx  ��x��ѧ����
һ��ѧ��Ϯ��
������xxx  ���䣺xxx  �Ա�x
������xxx  ���䣺xxx  �Ա�x

������ע�������а༶�Ͱ༶�е�����ѧ��ȫ����ӡ��*/


/*��ҵ�������£�*/


/*У����*/
class Headmaster{
	private String name;
	private int age;
	private String school;
	public Headmaster(String name,int age,String school){
		this.name=name;
		this.age=age;
		this.school=school;
	}
	public String toString(){
		String message="��������"+this.name+"�����䣺"+age+"����ҵԺУ��"+school+")";
		return message;
	}
}

/*ѧ����*/
class Student{
	private String name;
	private int age;
	private boolean sex;//���Ա�true�У�falseŮ��
	public Student(String name,int age,boolean sex){
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
	public String toString(){
		String message2="������"+this.name+"\t���䣺"+this.age+"\t�Ա�"+(sex?"��":"Ů");
		return message2;
	}
}

/*�༶��*/
class BanJi{
	private String classNumber;
	private String teacherName;
	private Student[] stuArr;
	public BanJi(String classNumber,String teacherName){
		this.classNumber=classNumber;
		this.teacherName=teacherName;
	}
	public void setStudent(Student[] stuArr){
		this.stuArr=stuArr;
	}
	public Student[] getStudent(){
		return stuArr;
	}
	public String toString(){
		String message3="�༶��:"+classNumber+"\t�����Σ�"+teacherName+"\t��"+stuArr.length+"��ѧ��\nһ��ѧ����Ϯ\n";
		for(int i=0;i<stuArr.length;i++){
			message3+=stuArr[i].toString()+"\n";
		}
		return message3;
	}
}

/*ѧУ��*/
class School{
	private String Schoolname;//����ѧУ����
	private Headmaster headmaster;//����У��
	private int foundingYear;//���彨Уʱ��
	private String country;// �������
	private BanJi[] banJi;//����༶
	public void setBanJi(BanJi[] banJi){
		this.banJi=banJi;
	}
	public BanJi[] getBanJi(){
		return banJi;
	}
	public void setHeadmaster(Headmaster headmaster){
		this.headmaster=headmaster;
	}
	public Headmaster getHeadmaster(){
		return this.headmaster;
	}
	public School(String Schoolname,int foundingYear,String country){
		this.Schoolname=Schoolname;
		this.foundingYear=foundingYear;
		this.country=country;
	}
	public String toString(){
		String message4="ѧУ��"+Schoolname+"\nУ��:"+headmaster.toString()+"\n��Уʱ�䣺"+foundingYear+"��\n�������ң�"+country+"\n��"+banJi.length+"���༶";
		return message4;
	}
}

/*������*/
class Test0704{
	public static void main(String[] args){
		
		School hz=new School("����",1907,"�쳯");
		School wz=new School("����",1893,"�쳯");
		Headmaster headmaster1=new Headmaster("������",50,"����");
		Headmaster headmaster2=new Headmaster("ѾѾ",65,"�廪");
		hz.setHeadmaster(headmaster1);
		wz.setHeadmaster(headmaster2);
	
		BanJi[] hzBanji=new BanJi[22];
		BanJi[] wzBanji=new BanJi[12];
		Student[] hzstu=new Student[3];
		Student[] wzstu=new Student[4];
	
		for(int xueID=0;xueID<2;xueID++){
			BanJi[] bj=null;
			if(xueID==0){
				bj=new BanJi[22];
				hz.setBanJi(bj);
			}else{
				bj=new BanJi[12];
				wz.setBanJi(bj);
			}
	
			for(int i=0;i<bj.length;i++){//����hz�༶����Ԫ��
					Student[] stuArr=new Student[3];
					for(int j=0;j<stuArr.length;j++){//stuѧ�����ݱ���
					Student stu=new Student("ѧ��"+j,15,j%2==0);
					stuArr[j]=stu;
				}
				String classNumber=(110+i)+" ";
				BanJi banji=new BanJi(classNumber,classNumber+"������");
				banji.setStudent(stuArr);
				bj[i]=banji;
			}
		}
		
		//��ӡ����ѧУ��Ϣ
		System.out.println(hz.toString());
		BanJi[] hzBJ=hz.getBanJi();
		for(int i=0;i<hzBJ.length;i++){
			System.out.println(hzBJ[i].toString());
		}
		System.out.println("\n\n----------------�����Ƿָ���------------------\n\n");
		
		//��ӡ����ѧУ��Ϣ
		System.out.println(wz.toString());
		BanJi[] wzBJ=wz.getBanJi();
		for(int i=0;i<wzBJ.length;i++){
			System.out.println(wzBJ[i].toString());
		}
	}
}