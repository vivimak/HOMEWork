/*
我是作业内容
*/
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


class BihuTest0702{
	public static void main(String[] args){
		Number number=new Number(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
		int sum=number.addition();
		int sub=number.subtration();
		int mul=number.multiplication();
		int div=number.division();
		System.out.println("和为:"+sum+";差为:"+sub+";积为:"+mul+";商为:"+div);
	}
}