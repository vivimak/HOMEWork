/*��1900�굽2019��2��18�գ�����������ӡ����*/
import java.util.Scanner;
class  Calendar{
	public static void main(String[] args) {
		//�ڻ������ô�����ô���Scanner����һ���͹����ˣ�����˷��ڴ�
		Scanner y=new Scanner(System.in);
		System.out.println("��������");
		int year=y.nextInt();
		Scanner m=new Scanner(System.in);
		System.out.println("��������");
		int month=m.nextInt();
		Scanner d=new Scanner(System.in);
		System.out.println("��������");
		int day=d.nextInt();
		int monthDays=0;
		int yearDays=0;
		int sum=0;
		
		//�ڻ���Ӧ�ðѼ������껹��ƽ��Ĵ����ѭ�����棨���ҵĴ��룩��
		//���������ֻ��������������������ƽ�ˣ�������������ǣ�2019������year��ֵ������2019
		boolean bool=false;
		if(year%4==0&&year%100!=0||year%400==0){
			bool=true;
		}
		//�ڻ�����ѭ������ȥ�������������ƽ�����ҵĴ��룩
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
				//�ڻ��������N��ѭ��ʱ��monthDaysֵΪ100�ˣ�
				//�¾����һִ�У������˳�31...(��ȷд�����ҵĴ���)
				monthDays=31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				//�ڻ���ͬ��
				monthDays=30;
				break;
			case 2:
				if(bool){
					//�ڻ���ͬ��
					monthDays=29;
					break;
				}else{
					//�ڻ���ͬ��
					monthDays=28;
					break;
				}
			}
			//�ڻ���ǰ��������ˣ��˴�д�����к���
			monthDays+=monthDays;
		}
		sum=yearDays+monthDays+day;
		System.out.println("��1990����"+year+"��"+month+"��"+day+"�գ�һ��"+sum+"��");
		int weekday=(sum+1)%7+1;//����1�ŵ�����
		System.out.println(year+"��"+month+"�µ�һ��������"+weekday);
		System.out.println("��\tһ\t��\t��\t��\t��\t��");
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