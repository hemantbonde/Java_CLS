import java.util.ArrayList;
class P4
{
	public static void main(String[] args) 
	{
		ArrayList obj=new ArrayList();
		System.out.println(obj);
		System.out.println(obj.isEmpty());//isEmpty()
		obj.add(123);
		obj.add(true);
		obj.add("false");
		obj.add('a');
		System.out.println(obj);
		System.out.println(obj.isEmpty());
		System.out.println(obj.size());

		
	}
}
