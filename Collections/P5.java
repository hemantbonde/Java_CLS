import java.util.Vector;
class P5
{
	public static void main(String[] args) 
	{
		Vector obj=new Vector();
		System.out.println(obj);
		System.out.println(obj.isEmpty());
		obj.add(123);
		obj.add(true);
		obj.add("false");
		obj.add('a');
		System.out.println(obj);
		System.out.println(obj.isEmpty());
		System.out.println(obj.size());
	}
}
