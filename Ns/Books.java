class Books 
{
	String B_name;
	int B_id;
	double Price;
 
	Books()
	{
	}

	Books (String name,int id,double p)
	{
		this.B_name=name;
		this.B_id=id;
		this.Price=p;
	}

	public void available()
	{
		System.out.println("The book name "+B_name+" is Available ");
	}

	public void display()
	{
	   System.out.println("Book ID : "+B_id);
	   System.out.println("Book Name : "+B_name);	
	   System.out.println("Price : "+Price);
	}
}
