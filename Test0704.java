

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
		String message2="������"+this.name+"\t���䣺"+age+"\t�Ա�"+(sex?"��":"Ů");
		return message2;
	}
}

/*�༶��*/
class BanJi{
	private String classNumber;
	private String teacherName;
	private Student[] stuArr;
	public BanJi(String classNumber,String teacherName,Student[] stuArr){
		this.classNumber=classNumber;
		this.teacherName=teacherName;
		this.stuArr=stuArr;
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
	private BanJi[] banji;//����༶
	public School(String Schoolname,Headmaster headmaster,int foundingYear,String country){
		this.Schoolname=Schoolname;
		this.headmaster=headmaster;
		this.foundingYear=foundingYear;
		this.country=country;
	}
	public String toStrong(){
		String message4="ѧУ��"+Schoolname+"\nУ��:"+headmaster.toString()+"\n��Уʱ�䣺"+foundingYear+"��\n�������ң�"+country+"\n��"+banji.length+"���༶";
		return message4;
	}
}

/*������*/
class Test0704{
	public static void main(String[] args){
		Headmaster headmaster1=new Headmaster("������",50,"����");
		Headmaster headmaster2=new Headmaster("ѾѾ",65,"�廪");
		School school1=new School("����",headmaster1,1907,"�쳯");
		School school2=new School("����",headmaster2,1893,"�쳯");
		//school1.lehgth=22;
		//school2.length=12;

	