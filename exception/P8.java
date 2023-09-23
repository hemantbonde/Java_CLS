import java.io.*;
class P8 
{
	public static void main(String[] args) 
	{
		try
	{
		FileOutputStream obj=new FileOutputStream("d:\\trial.txt");
	}
	catch (FileNotFoundException obj)
	{
		System.out.println(obj);
	}	
	}
}
