class P4 
{
	public static void main(String[] args) 
	{

		int[] var= null;
		String a="rama";

		try
		{
			try
			{
			  int re=var[5];	
			}
			catch (Exception obj1)
			{
				System.out.println(obj1+"          1");
			}

		     int res=a.charAt(6);
			}

		catch (Exception obj)
		{
			System.out.println(obj+"              2");
		}
	}
}
