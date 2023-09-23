class DuplicateArray 
{
	public static void main(String[] args) 
	{ 
		boolean flag=false;
		String arr[]={"java","c","c++","python","Ruby"};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					System.out.println("Duplicate is present of :"+arr[i]);
					flag=true;
				}
			}
		}
		if(flag==false){
		System.out.println("Duplicate is not present");
		}
	}
}
