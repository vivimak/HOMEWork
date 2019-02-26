/*
我是作业内容
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
		System.out.println("请为n1赋值：");
		int n1=in.nextInt();
		System.out.println("请为n2赋值：");
		int n2=in.nextInt();
		//壁虎：传参有误，既然用n1与n2接受了参数，为什么传的时候不是n1和n2呢？
		//Number number=new Number(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
		//壁虎：正确写法如下
		Number number=new Number(n1,n2);
		int sum=number.addition();
		int sub=number.subtration();
		int mul=number.multiplication();
		int div=number.division();
		System.out.println("和为:"+sum+";差为:"+sub+";积为:"+mul+";商为:"+div);
	}
}