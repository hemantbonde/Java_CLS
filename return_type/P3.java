class P3 
{
	public static String vowel(char ch)
	{
	 if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	 {
       System.out.println("the given character "+ch+" is vowel");
	 }
	 else
		{
			System.out.println("the given character "+ch+" is Consonant");
		}
		return "PARIS";
	}
	public static void main(String[] args) 
	{
		System.out.println(vowel('h'));
	}
}
