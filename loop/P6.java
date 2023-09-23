class P6 
{
	public static void main(String[] args) 
	{
		int n=0;
		System.out.println(" The number divisible by 7 and 3 between 0 to 100 are : ");
		while ((n>=0&&n<=100))
		{
			if (n%7==0&&n%3==0)
			{
				System.out.println(n);
					}
			n++;
		}
	}
}
