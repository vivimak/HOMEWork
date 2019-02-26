/*求1900年到2019年2月18日，总天数？打印星期*/
import java.util.Scanner;
class  Calendar{
	public static void main(String[] args) {
		//壁虎：不用创建那么多的Scanner对象，一个就够用了，多个浪费内存
		Scanner y=new Scanner(System.in);
		System.out.println("请输入年");
		int year=y.nextInt();
		Scanner m=new Scanner(System.in);
		System.out.println("请输入月");
		int month=m.nextInt();
		Scanner d=new Scanner(System.in);
		System.out.println("请输入日");
		int day=d.nextInt();
		int monthDays=0;
		int yearDays=0;
		int sum=0;
		
		//壁虎：应该把计算闰年还是平年的代码放循环里面（见我的代码），
		//放外面你就只计算你输入的年份是闰还是平了，假设你输入的是：2019，变量year的值不就是2019
		boolean bool=false;
		if(year%4==0&&year%100!=0||year%400==0){
			bool=true;
		}
		//壁虎：在循环里面去计算该年是闰还是平（见我的代码）
		for(int i=1900;i<year;i++){
			if(bool){
				yearDays+=366;
			}else{
				yearDays+=365;
				}
		}
		
		
		for(int j=1;j<=month-1;j++){
			switch(j){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				//壁虎：假设第N次循环时，monthDays值为100了，
				//下句代码一执行，立刻退成31...(正确写法见我的代码)
				monthDays=31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				//壁虎：同上
				monthDays=30;
				break;
			case 2:
				if(bool){
					//壁虎：同上
					monthDays=29;
					break;
				}else{
					//壁虎：同上
					monthDays=28;
					break;
				}
			}
			//壁虎：前面出问题了，此处写对又有何用
			monthDays+=monthDays;
		}
		sum=yearDays+monthDays+day;
		System.out.println("从1990年至"+year+"年"+month+"月"+day+"日，一共"+sum+"天");
		int weekday=(sum+1)%7+1;//该月1号的星期
		System.out.println(year+"年"+month+"月第一天是星期"+weekday);
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		for(int i=0;i<weekday;i++){
			System.out.print("\t");	
		}
		for(int i=1;i<=day;i++){
			System.out.print(i+"\t");
			if((sum+i)%7==6){
				System.out.println();
			}	
		}
	}
}