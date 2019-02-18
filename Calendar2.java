/*求1900年到2019年2月18日，总天数？打印星期*/
import java.util.Scanner;
class  Calendar2{
	public static void main(String[] args) {
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
		boolean bool=false;
		if(year%4==0&&year%100!=0||year%400==0){
			bool=true;
		}
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
				monthDays=31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				monthDays=30;
				break;
			case 2:
				if(bool){
					monthDays=29;
					break;
				}else{
					monthDays=28;
					break;
				}
			}
			monthDays+=monthDays;
		}
		sum=yearDays+monthDays+day;
		System.out.println("从1990年至"+year+"年"+month+"月"+day+"日，一共"+sum+"天");
		int weekday=(sum+1)%7+1;//该月1号的星期
		System.out.println(year+"年"+month+"月第一天是星期"+weekday);
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		int n=0;
		for(int i=0;i<weekday;i++){
			System.out.print("\t");	
			n++;
		}
		for(int i=1;i<=day;i++){
			System.out.print(i+"\t");
			n++;
			if(n==7){
				System.out.println();
				n=0;
			}	
		}
	}
}