class P2 
{
	public static int odd(int n,int m)
	{  int c=0;
		while (n<=m)
		{
			if (n%2!=0)
			{
              c++;
			}
			n++;
		}
        System.out.println("Count of Odd number between 25 to 50  is"+c);
		return c;
	}
	public static void main(String[] args) 
	{
	 System.out.println(odd(25,50));
	}
}
