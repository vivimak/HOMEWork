/*day7作业三：
为“无名的粉”写一个类：class WuMingFen 要求：
(1).有三个属性：面码:String theMa ，粉的分量(两)：int quantity，是否带汤：boolean likeSoup。
(2).写一个构造方法，以便于简化初始化过程，如：
WuMingFen f1 = new WuMingFen("牛肉",3,true);
(3).重载构造方法，使得初始化过程可以多样化，没有指定则默认不带汤。
WuMingFen f2 = new WuMingFen("牛肉",2);

最后打印这碗粉的信息。*/

class WuMingFen{
	private String theMa;
	private int quantity;
	private boolean likeSoup;

	//编写构造方法
	public WuMingFen(String theMa,int quantity,boolean likeSoup){
		this.theMa=theMa;
		this.quantity=quantity;
		this.likeSoup=likeSoup;
	}

	public WuMingFen(String theMa,int quantity){
		this.theMa=theMa;
		this.quantity=quantity;
	}

	public String toString(){
		String soup=likeSoup?"带":"不带";
		return"来一个"+theMa+"粉,"+quantity+"两;"+soup+"汤。";
	}
}

class Test0703{
	public static void main(String[] args){
		WuMingFen f1 = new WuMingFen("牛肉",3,true);
		WuMingFen f2 = new WuMingFen("猪肉",2);
		System.out.println(f1.toString());
		System.out.println(f2.toString());
	}
}