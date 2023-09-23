class AW9 
{
	public static void main(String[] args) 
	{
		 long res=1;
		System.out.println("The Multiplication of odd number between 10 to 50 is :");
		for (int n=10;n<50;n++ )
		{
			if (n%2!=0)
			{
				res=res*n;
			}
		}
		System.out.println(res);
	}
}
