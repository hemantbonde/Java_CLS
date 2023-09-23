class B extends A 
{
	static int var=10;

	public static void test()
	{
		System.out.println("test-B");
	}
	 
	static
	{
		System.out.println("SIB-B");
	}

	public static void main(String[] args) 
	{
		System.out.println(B.var);
		System.out.println(A.var);
		B.test();
		A.test();
	}
}
