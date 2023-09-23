class AW14 
{
	public static void main(String[] args) 
	{
		int n=5;
		long res=1;
		System.out.println("The  fact of 5 is :");
		do
		{
			res=res*n;
			n-- ;
		}
		while(n>0);
        System.out.println(res);
	}
}
