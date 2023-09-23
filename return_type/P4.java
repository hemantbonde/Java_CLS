class P4 
{
	public static int max(int a,int b ,int c, int d)
	{
	 int op=a>b&&a>c&&a>d?a:b>c&&b>d?b:c>d?c:d;
     System.out.println("max value "+op);
	 return op;
	}
	public static void main(String[] args) 
	{
		int res=max(23,12,65,43);
		System.out.println(res);
	}
}
