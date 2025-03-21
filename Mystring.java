import java.util.Scanner;
public class Mystring{
	public static void main(String []args){
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("1.charAt():Returns the character at the specified index ");
		System.out.println("Enter a String ");
		str=sc.nextLine();
		System.out.println("Character at 0th index :"+str.charAt(0));
		System.out.println("---------------------------------------------------------------------");
		System.out.println("2.endsWith():Checks whether a string ends with the specified character(s) ");
		System.out.println("Enter a String ");
		str=sc.nextLine();
		System.out.println("String ends with 'Hel': "+str.endsWith("Hel"));   
		System.out.println("String ends with 'llo': "+str.endsWith("llo"));
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("3.concat():Appends a string to the end of another string");
		System.out.println("Enter String1 ");
		String str1=sc.nextLine();
		System.out.println("Enter String2 ");
		String str2=sc.nextLine();
		System.out.println("Concatenated result is: "+str1.concat(str2));
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("4.toUpperCase():Converts a string to upper case letters");
		System.out.println("5.toLowerCase():Converts a string to lower case letters");
		System.out.println("Enter a String ");
		str=sc.nextLine();
		System.out.println("Given string in uppercase: "+str.toUpperCase());
		System.out.println("Given string in lowercase: "+str.toLowerCase());
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("6.compareTo():Compares two strings lexicographically");
		System.out.println("Enter String1 ");
		String mstr1=sc.nextLine();
		System.out.println("Enter String2 ");
		String mstr2=sc.nextLine();
		System.out.println("Comparison result: "+mstr1.compareTo(mstr2));
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("7.substring():Returns a new string which is the substring of a specified string");
		String myStr = "Hello, World!";
		System.out.println("Substring of "+myStr+"from index 7-12 is --> "+myStr.substring(7, 12));
}
}
