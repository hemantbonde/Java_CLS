class P2 
{
	public static void main(String[] args) 
	{
		int n=123;
		int c=0;
		while (n>0)
		{
			n=n%10;
			n=n/10;
			if (n%2==0)
			{
				c++;
			}

		}
		System.out.println(c);
	}
}
