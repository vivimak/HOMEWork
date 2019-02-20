//求1900年到某年的总天数
import java.util.Scanner;
class TotalDays{	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("请输入年份：");
		int year=in.nextInt();
		int sum=0;
		for(int i=1900;i<=year;i++){
			if(i%4==0&&i%100!=0||i%400==0){
				sum=sum+366;
			}else{
				sum=sum+365;
			}
		}
		System.out.println("从1900年到"+year+"年一共"+sum+"天");
	}
}

