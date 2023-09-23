class Library
{
	public static void main(String[] args) 
	{
		Books b1=new Books("Happry potter",101,736.68);
		b1.available();
        b1.display();

		Books b2=new Books("Bible",102,999.98);
		b2.available();
        b2.display();
	}
}
