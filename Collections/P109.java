import java.util.ArrayList;
class P109 
{
	public static void main(String[] args) 
	{
		ArrayList obj=new ArrayList();
		obj.add(3);
		obj.add("now");
		obj.add(true);

		ArrayList obj1=new ArrayList();
		obj1.add(3);
		obj1.add("then");
		obj1.add(23.236);
		obj1.add(obj);
	
		System.out.println(obj1);

		obj1.remove(obj);

		System.out.println(obj1);

	}
}
