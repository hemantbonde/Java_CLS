class P1 
{
	public static void main(String[] args) 
	{
		int[] array=null;
		System.out.println(1);
		try
		{
		  int res=array[2];
		}
		catch (Exception  obj)
		{
			System.out.println(obj);
		}
		System.out.println(2);
	}
}
