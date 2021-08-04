

public class Demo1 {
	public static void main(String[] args) {
		String str4=new String("Hello");
		String str1="Hello";
		String str2="Hello";
		String str3=new String("Hello");
		System.out.println(str4.hashCode()+" "+str1.hashCode()+" "+str2.hashCode()+" "+str3.hashCode());
		System.out.println(str1==str2);
		System.out.println(str1==str4);
		System.out.println(str3.equals(str4));
		
		
	}
}
