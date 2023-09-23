class P6 
{
	public static void count(int n,int m,int c)
	{
		while (n>m)
		{
			n=n/10;
            c++;
		}
		System.out.println("Count of given number is "+c);
	}
    public static void main(String[] args) 
	{
		count(123,0,0);
	}
}
