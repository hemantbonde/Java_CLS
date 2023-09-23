class P2 
{   int a;
	public void ace()
	{
	a=56;
	System.out.println(a);
	int a=34;
	System.out.println(a);
	this.a=40;
	System.out.println(this.a);
	}
	public static void main(String[] args) 
	{
		System.out.println("Start");
		P2 obj=new P2();
		obj.ace();
		System.out.println("END");
	}
}
