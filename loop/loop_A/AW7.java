class AW7 
{
	public static void main(String[] args) 
	{
		int n=10;
	    long res=1;
		System.out.println("The Multiplication of odd number between 10 to 50 is :");
		while (n<50)
		{
			if (n%2!=0)
			{
				res=res*n;
			}
			n++;
		}
		System.out.println(res);
	}
}
