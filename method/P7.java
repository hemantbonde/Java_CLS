class P7 
{
	public static void oddcount(int n)
	{
		int c=0;
		while (n!=0)
		{
			n=n/10;
			if(n%2!=0)
			{
			 c++;
			 }
			}
		System.out.println(c);
		}
	public static void main(String[] args) 
	{
     oddcount(123);
	}
}
