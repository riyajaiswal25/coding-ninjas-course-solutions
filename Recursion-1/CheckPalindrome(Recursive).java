/*Check whether a given String S is a palindrome using recursion. Return true or false.
Input Format :
String S
Output Format :
'true' or 'false' */
public class solution {

	public static boolean isStringPalindrome(String input) {
		// Write your code here
        if(input.length()<=1)
		{
			return true;
		}
		else if(input.charAt(0)!=input.charAt(input.length()-1))
		{
			return false;
		}
		return isStringPalindrome(input.substring(1, input.length()-1));
	}
}

