/*Given a string, compute recursively a new string where all 'x' chars have been removed.
Input format :
String S
Output format :
Modified String
Constraints :
1 <= |S| <= 10^3
where |S| represents the length of string S. 
Sample Input 1 :
xaxb
Sample Output 1:
ab
Sample Input 2 :
abc
Sample Output 2:
abc
Sample Input 3 :
xx
Sample Output 3: */

public class solution {

	// Return the changed string
	public static String removeX(String input){
		// Write your code here
      if(input.length()==1){
        if(input.equals("x")){
          return "";
        }else{
          return input;
        }
      }
      char arr[]=input.toCharArray();
      char arr1[]=new char[arr.length-1];
      for(int index=0;index<arr.length-1;index++){
        arr1[index]=arr[index];
      }
      String s1=new String(arr1);
      String s=removeX(s1);
      String s2=Character.toString(arr[arr.length-1]);
      if(s2.equals("x")){
        s2="";
      	return s+s2;  
      }
      return s+s2;
	}
}
