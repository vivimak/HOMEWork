//判断闰年、平年
import java.util.Scanner;
class  LeapYear{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("请输入年份：");
		int year=in.nextInt();
		if(year%4==0&&year%100!=0||year%400==0){
			System.out.println(year+"  是闰年");
		}else{
			System.out.println(year+"  是平年");
		}
	}
}
