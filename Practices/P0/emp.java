class emp 
{
	String Ename;
	int Eid;
	private double Esal;

	public double getEsal()
	{
		return Esal;
	}
	
	public void setEsal(double sal)
	{
		this.Esal=sal;
	}

	emp()
	{
			
	}

	emp(String name,int id,double sal)
	{
		this.Ename=name;
		this.Eid=id;
		this.Esal=sal;
		
	}
}
