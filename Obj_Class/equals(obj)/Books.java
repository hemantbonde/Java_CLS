class Books 
{
	int lib_no;

	Books()
	{
			
	}

	Books(int n)
	{
		this.lib_no=n;
	}

	
	public boolean equals(Object var)
	{
		boolean res=false;
		if (this.lib_no==((Books)var).lib_no)
		{
			res=true;
		}
		return res;
	}
}
