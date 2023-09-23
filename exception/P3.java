class P3 
{
	public static void main(String[] args) 
	{
		int[] var=null;
		try
		{
		  int res=var[2];
		}
		catch (Exception obj)
		{
          System.out.println(obj);
		}
		catch (ArrayIndexOutOfBoundsException obj)
		{
			System.out.println(obj);
		}
		System.out.println("Hello World!");
	}
}
