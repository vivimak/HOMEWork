/*
������ҵ����
*/
import java.util.Scanner;
class Number{
	private int n1;
	private int n2;

	Number(int n1,int n2){
		this.n1=n1;
		this.n2=n2;
	}

	public int addition(){
		int sum=n1+n2;
		return sum;
	}

	public int subtration(){
		int sub=n1-n2;
		return sub;
	}

	public int multiplication(){
		int mul=n1*n2;
		return mul;
	}

	public int division(){
		int div=n1/n2;
		return div;
	}
}


class Test0702{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("��Ϊn1��ֵ��");
		int n1=in.nextInt();
		System.out.println("��Ϊn2��ֵ��");
		int n2=in.nextInt();
		//�ڻ����������󣬼�Ȼ��n1��n2�����˲�����Ϊʲô����ʱ����n1��n2�أ�
		//Number number=new Number(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
		//�ڻ�����ȷд������
		Number number=new Number(n1,n2);
		int sum=number.addition();
		int sub=number.subtration();
		int mul=number.multiplication();
		int div=number.division();
		System.out.println("��Ϊ:"+sum+";��Ϊ:"+sub+";��Ϊ:"+mul+";��Ϊ:"+div);
	}
}