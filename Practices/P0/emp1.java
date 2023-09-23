class emp1 
{
	String Ename;
	int Eid;
	private double Esal;

	public double getEsal()
	{
		return Esal;
	}

	public void setEsal(double a)
	{
		this.Esal=a;
	}

	emp1()
		{
			
		}
	emp1(String n,int id,double sal)
		{
			this.Ename=n;
			this.Eid=id;
			this.Esal=sal;
		}
}
