class Store 
{
	public static void main(String[] args) 
	{
		Product P1=new Product("Groundnut oil",101,147.37,25);
        System.out.println(P1.getprice());

		Product P2=new Product("Coconut oil",102,162.12,12);
		P2.setprice(152.69);
		System.out.println(P2.getprice());

		Product P3=new Product("Sunflower oil",103,127.85,8);
		System.out.println(P3.getprice());
		P3.setprice(135.65);
		System.out.println(P3.getprice());
	}
}
