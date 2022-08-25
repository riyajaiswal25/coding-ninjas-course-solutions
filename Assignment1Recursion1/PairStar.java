/*Given a string S, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".
Input format :
String S
Output format :
Modified string
Constraints :
0 <= |S| <= 1000
where |S| represents length of string S.
Sample Input 1 :
hello
Sample Output 1:
hel*lo
Sample Input 2 :
aaaa
Sample Output 2 :
a*a*a*a */

public class solution {

	// Return the updated string
	public static String addStars(String s) {
		// Write your code here
       if(s.length()==1){
        return s;
      }
      char arr1[]=s.toCharArray();
      char arr2[]=new char[arr1.length-1];
      for(int index=0;index<arr1.length-1;index++){
        arr2[index]=arr1[index];
      }
      String temp2=new String(arr2);
      String actual=addStars(temp2);
      String s3=Character.toString(arr1[arr1.length-1]);
      if(actual.charAt(actual.length()-1)==arr1[arr1.length-1]){
        return actual+"*"+s3;
      }
      return actual+s3;
	}
}
