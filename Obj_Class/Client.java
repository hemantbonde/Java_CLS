class Client   
{
	long Ac_id;

	Client()
	{
	}

	Client(long id )
	{
		this.Ac_id=id;
	}

	public String toString()
	{
		return "SBI"+Ac_id;  //Progremmer generated Address After overriding
	}
}
