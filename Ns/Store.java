class Store 
{
	public static void main(String[] args) 
	{
		Product P1=new Product("Groundnut oil",101,147.37,25);
		P1.stock();
        P1.display();

		Product P2=new Product("Coconut oil",102,162.12,12);
		P2.stock();
        P2.display();

		Product P3=new Product("Sunflower oil",103,127.85,8);
		P3.stock();
        P3.display();
	
	    
	}
}
