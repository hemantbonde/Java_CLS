class Street 
{
	public static void main(String[] args) 
	{
		Animal a=new Animal();
		a.walk();
		
		try
		{
			Dog d=(Dog)a;
		}
		catch (RuntimeException obj)
		{
			System.out.println(obj);
		}		
	    System.out.println("end");
	}
}
