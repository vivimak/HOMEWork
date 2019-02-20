//求1900年1月1日到某年月日的总天数
import java.util.Scanner;
class  TotalDay2{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("请输入截止年：");
		int inputyear=in.nextInt();
		System.out.println("请输入截止月：");
		int inputmonth=in.nextInt();
		System.out.println("请输入截止日：");
		int inputday=in.nextInt();
		int yearSum=0;
		for(int year=1900;year<inputyear;year++){
			if(year%4==0&&year%100!=0||year%400==0){
				yearSum+=366;
			}else{
				yearSum+=365;
			}
		}
		int monthSum=0;
		for(int month=1;month<inputmonth;month++){
			if(month==2){
				if(inputyear%4==0&&inputyear%100!=0||inputyear%400==0){
					monthSum+=29;
				}else{
					monthSum+=28;
				}
			}else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
				monthSum+=31;
			}else{
				monthSum+=30;
			}
		}
		int sum=yearSum+monthSum+inputday;
		System.out.println("从1900年1月1日到"+inputyear+"年"+inputmonth+"月"+inputday+"日的总天数是"+sum+"天");
	}
}
