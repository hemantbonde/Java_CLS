class Product 
{
	String P_name;
	int P_id;
	double Price;
	int QTY;

	Product()
	{
	}

	Product (String name,int id,double p,int q)
	{
		this.P_name=name;
		this.P_id=id;
		this.Price=p;
		this.QTY=q;
	}

	public void stock()
	{
		System.out.println(P_name+" having Stock of "+QTY);
	}

	public void display()
	{
	   System.out.println("Product ID : "+P_id);
	   System.out.println("Product Name : "+P_name);	
	   System.out.println("Price : "+Price);
	   System.out.println("QTY : "+QTY);	
	}

}
