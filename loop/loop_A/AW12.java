class AW12 
{
	public static void main(String[] args) 
	{
		 long res=0;
		System.out.println("The sum of all number between 25 to 75 div by 3 &9 is :");
		for (int n=25;n<=75;n++ )
		{
			if (n%3==0&&n%9==0)
			{
				res=res+n;
			}
		}
		System.out.println(res);
	}
}
