package Stringopreation;

public class Str
{

	public static void main (String[]args)
	{
		String s = "Aaditya Bhurkunde";
		
		String s1 = "AADITYA BHURKUNDE";
		
		System.out.println(s.length());                  // to measure length
		
		System.out.println(s.charAt(2));                 // index value retrieve start from zero.
		
		System.out.println(s.substring(2));             // retrieve remaining string
		
		System.out.println(s.substring(2, 10));         // one index point to another index point .
		
		System.out.println(s.equals(s1));              // compare between between the string 
		
		System.out.println(s.equalsIgnoreCase(s1));       // compare but not case matter
		
		System.out.println(s.concat(s1));              // join the string
		
		System.out.println(s.concat(" "+s));                      // space
		
		System.out.println(s.concat(" punekar"));         // join the string in exiting string
		
		System.out.println(s.indexOf('d'));            // index value of  char -- first appearance
		
		System.out.println(s.replace('a', 'j'));          // to replace existing char with new char
		
		System.out.println(s.trim());          // remove the space from left and right side
		
		System.out.println(s.startsWith("Aad"));       // start with  char
		
		System.out.println(s.endsWith("de"));            // end with char
		
		
		}    
}
