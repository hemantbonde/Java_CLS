class P1 
{
	public static void main(String[] args) 
	{
		int a=23;
		double b=a;

		double c=34.5465;
		int d=(int)c;

		int j=12;
		int k=1;


		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(a>c&&a>j&&a>k?a:c>j&&c>k?c:j>k?j:k);
	}
}
