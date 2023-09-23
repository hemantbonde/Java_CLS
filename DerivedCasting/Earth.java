class Earth 
{
	public static void main(String[] args) 
	{
		Tiago t=new Tiago();
		t.Avrage();
		t.Manufacture();
		t.drive();

		Car c=t;     //Up Casting
		c.drive();
	}
}
