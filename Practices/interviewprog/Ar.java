class Ar 
{
	public static void main(String[] args) 
	{
		int[] n={1,2,3,4,5};
		int sum=0;

		System.out.println("even");
		for (int i=0;i<n.length;i++ )
		{
			
			if (n[i]%2==0)
			{
				
				System.out.println(n[i]);
			}
			
		}

		System.out.println("odd");
		for (int i=0;i<n.length;i++ )
		{
			
			if (n[i]%2!=0)
			{
				
				System.out.println(n[i]);
			}

		}
		//System.out.println(sum);
		System.out.println(n[]);
	}
}
