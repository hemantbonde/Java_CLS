class P3 
{
	public static void main(String[] args) 
	{
		int n=123;
		int r=0;
		int m=1;
        int s=0;
		int c=0;
		while (n>0)
		{
			r=n%10;
			s=s+(r*r);
			n=n/10;
			c++;
		}
		System.out.println(s);

	}
}
