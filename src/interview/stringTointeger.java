package interview;

public class stringTointeger {
	public static void main(String[] args) {
		String s="100";
		int sum=0;
		for(int i=0;i<s.length();i++) {
			int num=s.charAt(i)-48;
			sum=sum*10+num;
		}
		System.out.println(sum);
	}

}
