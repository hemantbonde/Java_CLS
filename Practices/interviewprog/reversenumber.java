import java.util.Scanner;
class reversenumber 
{
	public static void main(String[] args) 
	{
		
//logic 1
        int a=1234;
		int res=0;
		while(a!=0)
		{
			res=res*10+a%10;//0*10+1234%10=4
			a=a/10;//123
		}

		System.out.println(res);
/*
//logic 2 
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter number : ");
		int n=sc.nextInt();
        StringBuffer sb=new StringBuffer(String.valueOf(n));
		StringBuffer rev=sb.reverse();
		System.out.println(rev);  
//logic 3
       StringBuilder sbl=new StringBuilder();//create object 
	   sbl.append(n);//append our number to sbl
	   StringBuilder rev1=sbl.reverse();//reverse no & stored in rev1
	   System.out.println(rev1);   */
//logic 4
       StringBuffer sb=new StringBuffer(a);
	   StringBuffer rev2=sb.reverse();
	   System.out.println(rev2);

	}
}
