class Example04 
{
	static void m1(int p){
	int q=10;
	if (p==10)
	{
		int r=20;
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
	}
		System.out.println(p);
		System.out.println(q);
		//System.out.println(r);  System can not find the variable because it is inside if block so another block can not access
		
}
	public static void main(String[] args) 
	{
		m1(10);
		m1(20);
	}
}
