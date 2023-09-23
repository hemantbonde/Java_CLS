class Farm 
{
	public static void main(String[] args) 
	{
		Fruit f=new BlackGrapes();
		f.grow();

		Grapes g=(Grapes) f;  //downcating from fruit to grapes
		g.grow();
		g.eat();

        BlackGrapes b=(BlackGrapes) g; //downcating from grapes to blackgrapes
		b.grow();
		b.eat();
		b.colour();
	}
}
