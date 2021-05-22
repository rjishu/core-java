class Example02 
{
	static transient int x=25;//transient keyword used in only class level variables
	volatile int y=20;//volatile keyword used in class level variables only
	public static void main(String[] args) 
	{
		m1();
	}
	static void m1(){
	int p=10;
	System.out.println(p);
	m2();
}
	static void m2(){
	 int q=10;
		q=q+10;
	final2 int r=20;
	//r=r+10; this keyword used in local as well as class level variable
		System.out.println(q);
	System.out.println(r);
}
}
