class AW8 
{
	public static void main(String[] args) 
	{
		int n=10;
	    long res=1;
		System.out.println("The Multiplication of odd number between 10 to 50 is :");
		do
		{
			if (n%2!=0)
			{
				res=res*n;
			}
			n++;
		}
		while (n<50);
		System.out.println(res);
	}
}
