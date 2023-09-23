import java.io.*;
class P7 
{
	public static void main(String[] args) throws FileNotFoundException,NullPointerException
	
	{
		int[] v=null;
		System.out.println(1);
		FileOutputStream o=new FileOutputStream("d:\\ramram.txt");
		try
		{
		System.out.println(v[6]);	
		}
		catch (NullPointerException trash)
		{
			System.out.println(trash);
		}

		finally
		{
			System.out.println(2);
		}

		System.out.println("end");
	}
}
