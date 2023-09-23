class P1 
{
	public static void main(String[] args) 
	{
		String arr[]={"java","c","c++","python","python"}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;i<arr.length;j++){
				if(arr[i]==arr[j]){
					System.out.println("Duplicate is present of :"+arr[i]);
				}
				else{
					System.out.println("Duplicate is not present");
				}
			}
		}
	}
}
