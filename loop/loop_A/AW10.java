class AW10 
{
	public static void main(String[] args) 
	{
		int n=25;
		long res=0;
		System.out.println("The sum of all number between 25 to 75 div by 3 &9 is :");
		while(n<=75)
		{
			if (n%3==0&&n%9==0)
			{
				res=res+n;
			}
			n++ ;
		}
		System.out.println(res);
	}
}
