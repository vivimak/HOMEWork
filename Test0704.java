

/*校长类*/
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
		String message="（姓名："+this.name+"，年龄："+age+"，毕业院校："+school+")";
		return message;
	}
}

/*学生类*/
class Student{
	private String name;
	private int age;
	private boolean sex;//（性别：true男，false女）
	public Student(String name,int age,boolean sex){
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
	public String toString(){
		String message2="姓名："+this.name+"\t年龄："+age+"\t性别："+(sex?"男":"女");
		return message2;
	}
}

/*班级类*/
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
		String message3="班级号:"+classNumber+"\t班主任："+teacherName+"\t共"+stuArr.length+"个学生\n一大波学生来袭\n";
		for(int i=0;i<stuArr.length;i++){
			message3+=stuArr[i].toString()+"\n";
		}
		return message3;
	}
}

/*学校类*/
class School{
	private String Schoolname;//定义学校名字
	private Headmaster headmaster;//定义校长
	private int foundingYear;//定义建校时间
	private String country;// 定义国家
	private BanJi[] banji;//定义班级
	public School(String Schoolname,Headmaster headmaster,int foundingYear,String country){
		this.Schoolname=Schoolname;
		this.headmaster=headmaster;
		this.foundingYear=foundingYear;
		this.country=country;
	}
	public String toStrong(){
		String message4="学校："+Schoolname+"\n校长:"+headmaster.toString()+"\n建校时间："+foundingYear+"年\n所属国家："+country+"\n共"+banji.length+"个班级";
		return message4;
	}
}

/*测试类*/
class Test0704{
	public static void main(String[] args){
		Headmaster headmaster1=new Headmaster("哗哗哗",50,"北大");
		Headmaster headmaster2=new Headmaster("丫丫",65,"清华");
		School school1=new School("华中",headmaster1,1907,"天朝");
		School school2=new School("武中",headmaster2,1893,"天朝");
		//school1.lehgth=22;
		//school2.length=12;

	