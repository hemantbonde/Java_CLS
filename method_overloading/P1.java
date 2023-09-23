class P1 
{
	public static void add(int a,int b)
	{
	    double res =a+b;
		System.out.println(a+" + "+b+" = "+res);
	}
	public static void add(int a,double b)
	{
	    double res =a+b;
		System.out.println(a+" + "+b+" = "+res);
	}
	public static void add(double a,int b)
	{
	    double res =a+b;
		System.out.println(a+" + "+b+" = "+res);
	}
	public static void add(double a,double b)
	{
	    double res =a+b;
		System.out.println(a+" + "+b+" = "+res);
	}
	public static void sub(int a,int b)
	{
	    double res =a-b;
		System.out.println(a+" - "+b+" = "+res);
	}
	public static void sub(int a,double b)
	{
	    double res =a-b;
		System.out.println(a+" - "+b+" = "+res);
	}
	public static void sub(double a,int b)
	{
	    double res =a-b;
		System.out.println(a+" - "+b+" = "+res);
	}
	public static void sub(double a,double b)
	{
	    double res =a-b;
		System.out.println(a+" - "+b+" = "+res);
	}
	public static void mul(int a,int b)
	{
	    double res =a*b;
		System.out.println(a+" * "+b+" = "+res);
	}
	public static void mul(int a,double b)
	{
	    double res =a*b;
		System.out.println(a+" * "+b+" = "+res);
	}
	public static void mul(double a,int b)
	{
	    double res =a*b;
		System.out.println(a+" * "+b+" = "+res);
	}
	public static void mul(double a,double b)
	{
	    double res =a*b;
		System.out.println(a+" * "+b+" = "+res);
	}
	public static void div(int a,int b)
	{
	    double res =a/b;
		System.out.println(a+" / "+b+" = "+res);
	}
	public static void div(int a,double b)
	{
	    double res =a/b;
		System.out.println(a+" / "+b+" = "+res);
	}
	public static void div(double a,int b)
	{
	    double res =a/b;
		System.out.println(a+" / "+b+" = "+res);
	}
	public static void div(double a,double b)
	{
	    double res =a/b;
		System.out.println(a+" / "+b+" = "+res);
	}
	public static void main(String[] args) 
	{
		add(12,56);
		add(25,23.456);
		add(25.456,56);
		add(4684.4564,5464.3546);
		sub(65,41);
		sub(985,542.212);
		sub(546.658,123);
		sub(866.561,64.6554);
		mul(12,5);
		mul(45,5.5066);
		mul(45.892,56);
		mul(456.325,456.325);
		div(343,7);
		div(343.465,7);
		div(343,7.455);
		div(343.465,7.5646);
	}
}
