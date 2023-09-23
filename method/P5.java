class P5 
{
	public static void even(int n,int m)
	{
		while (n<=m)
		{
		if (n%2==0)
		{
         System.out.println(n);
		}
		n++;
		}
	}
	public static void main(String[] args) 
	{
	 even(0,100);
	}
}
