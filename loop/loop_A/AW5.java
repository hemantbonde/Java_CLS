class AW5 
{
	public static void main(String[] args) 
	{
		char ch='a';
		int c=ch;
	    long res=0;
		System.out.println("The Summation of first five character is :");
		do
		{
			res=res+c;
		    c++;
		}
		while (c<'f'); 
		System.out.println(res);
	}
}
