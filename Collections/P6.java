import java.util.HashSet;
class P6 
{
	public static void main(String[] args) 
	{
		HashSet obj=new HashSet();
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
