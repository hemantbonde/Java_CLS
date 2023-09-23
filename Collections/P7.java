import java.util.ArrayList;
class P7
{
	public static void main(String[] args) 
	{
		ArrayList obj=new ArrayList();
	
		obj.add(123);
		obj.add(true);
		obj.add("false");
		obj.add('a');
		System.out.println(obj);

		ArrayList obj1=new ArrayList();
		obj1.add(true);
		obj1.add("false");
		obj1.add('a');
		//obj1.add(obj);//add whole object  to object1
		obj1.addAll(obj);//add all element in object to object1 

		
		System.out.println(obj1);
		System.out.println(obj.contains('b'));
		System.out.println(obj1.indexOf('a'));
		

		
	}
}
