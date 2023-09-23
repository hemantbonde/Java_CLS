import java.util.Scanner;
class reverseString 
{
	public static void main(String[] args) 
	{
		String s1="ramram";
		StringBuffer sb=new StringBuffer(s1);
		StringBuffer rev=sb.reverse();
		System.out.println(rev);

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String sng=sc.next();

	}
}
