//��1900�굽ĳ���������
import java.util.Scanner;
class TotalDays{	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("��������ݣ�");
		int year=in.nextInt();
		int sum=0;
		for(int i=1900;i<=year;i++){
			if(i%4==0&&i%100!=0||i%400==0){
				sum=sum+366;
			}else{
				sum=sum+365;
			}
		}
		System.out.println("��1900�굽"+year+"��һ��"+sum+"��");
	}
}

