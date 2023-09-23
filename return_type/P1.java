class P1 
{
	public static double si(int p,double r,int t)
	{
		double i=p*r*t*0.01;
		System.out.println("The simple intest on "+p+" is "+i);
        return i;
	}
	public static void main(String[] args) 
	{
	System.out.println(si(90000,5.80,1));	
	}
}
