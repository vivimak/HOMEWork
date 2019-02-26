/*
Day07
题目4：使用面向对象的思想完成下列需求：
有两所中学分别叫“华中”和“武中”，建校时间分别是1907和1893，各有一名校长。华中共22个班，武中有12个班，每个老师带一个班，
每个班的学生人数不等，分别是30-50人之间。
程序产生数据后，打印效果如下：

学校：华中
校长：(姓名：xxx，年龄：xx ，毕业院校：xxx)
建校时间：1907年
所属国家：天朝
共22个班级。

班级号：xxx  班主任：xxx  共x个学生。
一大波学生袭来
姓名：xxx  年龄：xxx  性别：x
姓名：xxx  年龄：xxx  性别：x

班级号：xxx  班主任：xxx  共x个学生。
一大波学生袭来
姓名：xxx  年龄：xxx  性别：x
姓名：xxx  年龄：xxx  性别：x

-----------劳资是分割线----------------

学校：武中
校长：(姓名：xxx，年龄：xx ，毕业院校：xxx)
建校时间：1893年
所属国家：天朝
共12个班级。

班级号：xxx  班主任：xxx  共x个学生。
一大波学生袭来
姓名：xxx  年龄：xxx  性别：x
姓名：xxx  年龄：xxx  性别：x

班级号：xxx  班主任：xxx  共x个学生。
一大波学生袭来
姓名：xxx  年龄：xxx  性别：x
姓名：xxx  年龄：xxx  性别：x

出题者注：把所有班级和班级中的所有学生全部打印完*/


/*作业代码如下：*/


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
		String message2="姓名："+this.name+"\t年龄："+this.age+"\t性别："+(sex?"男":"女");
		return message2;
	}
}

/*班级类*/
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
	private BanJi[] banJi;//定义班级
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
		String message4="学校："+Schoolname+"\n校长:"+headmaster.toString()+"\n建校时间："+foundingYear+"年\n所属国家："+country+"\n共"+banJi.length+"个班级";
		return message4;
	}
}

/*测试类*/
class Test0704{
	public static void main(String[] args){
		
		School hz=new School("华中",1907,"天朝");
		School wz=new School("武中",1893,"天朝");
		Headmaster headmaster1=new Headmaster("哗哗哗",50,"北大");
		Headmaster headmaster2=new Headmaster("丫丫",65,"清华");
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
	
			for(int i=0;i<bj.length;i++){//遍历hz班级数组元素
					Student[] stuArr=new Student[3];
					for(int j=0;j<stuArr.length;j++){//stu学生数据遍历
					Student stu=new Student("学生"+j,15,j%2==0);
					stuArr[j]=stu;
				}
				String classNumber=(110+i)+" ";
				BanJi banji=new BanJi(classNumber,classNumber+"班主任");
				banji.setStudent(stuArr);
				bj[i]=banji;
			}
		}
		
		//打印华中学校信息
		System.out.println(hz.toString());
		BanJi[] hzBJ=hz.getBanJi();
		for(int i=0;i<hzBJ.length;i++){
			System.out.println(hzBJ[i].toString());
		}
		System.out.println("\n\n----------------劳资是分割线------------------\n\n");
		
		//打印武中学校信息
		System.out.println(wz.toString());
		BanJi[] wzBJ=wz.getBanJi();
		for(int i=0;i<wzBJ.length;i++){
			System.out.println(wzBJ[i].toString());
		}
	}
}