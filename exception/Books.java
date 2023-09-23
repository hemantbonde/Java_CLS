class Books
{
	public static void  id(int v) throws Availability
	{
		if (v==102)
		{
			throw new Availability(" Book is not Available ");
		}
		else
		{
			System.out.println("Book Available");
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Welcome");
		try
		{
			id(104);
		}
		catch (Exception obj)
		{
			System.out.println(obj);
		}
		System.out.println("Visit again");
	}
}
