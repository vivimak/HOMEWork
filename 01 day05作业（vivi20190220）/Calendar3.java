//����
import java.util.Scanner;
class  Calendar3{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("�������ֹ�꣺");
		int inputyear=in.nextInt();
		System.out.println("�������ֹ�£�");
		int inputmonth=in.nextInt();
		System.out.println("�������ֹ�գ�");
		int inputday=in.nextInt();
		//�����������
		int yearSum=0;
		for(int year=1900;year<inputyear;year++){
			if(year%4==0&&year%100!=0||year%400==0){
				yearSum+=366;
			}else{
				yearSum+=365;
			}
		}
		//���·�������
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
		int sum2=yearSum+monthSum;
		System.out.println("��1900��1��1�յ�"+inputyear+"��"+inputmonth+"��"+inputday+"�յ���������"+sum+"��");
		int weekday=sum%7;
		System.out.println(inputyear+"��"+inputmonth+"��"+inputday+"��������"+weekday);
		int weekday2=(sum2+1)%7;//����1�ŵ�����
		

		//��������ж�����
		int dayCount=0;
		switch(inputmonth){
			case 1:case 3:case 5:case 7:case 8:case 10:case 12:
				dayCount=31;
				break;
			case 4:case 6:case 9:case 11:
				dayCount=30;
				break;
			case 2:
				if(inputyear%4==0&&inputyear%100!=0||inputyear%400==0){
					dayCount=29;
				}else{
					dayCount=28;
				}
				break;
		}


		//��ӡ�·�������
		System.out.println("��\tһ\t��\t��\t��\t��\t��");
		for(int i=1;i<=weekday2;i++){
			System.out.print("\t");
		}
		for(int i=1;i<=dayCount;i++){
			System.out.print(i+"\t");
			if((sum2+i)%7==6){
				System.out.println();
			}
		}
	}
}
