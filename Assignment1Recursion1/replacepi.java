/*Given a string, compute recursively a new string where all appearances of "pi" have been replaced by "3.14".
Constraints :
1 <= |S| <= 50
where |S| represents the length of string S. 
Sample Input 1 :
xpix
Sample Output :
x3.14x
Sample Input 2 :
pipi
Sample Output :
3.143.14
Sample Input 3 :
pip
Sample Output :
3.14p
Constraints:-
1<=|S|<=50*/


public class solution {

	// Return the changed string
	public static String replace(String input){
		// Write your code here
      if(input.length()==1){
          //System.out.println(input);
        return input;
      }
      String s1=replace(input.substring(1));
      String actual="";
      if(input.charAt(0)=='p' && s1.charAt(0)=='i'){
          actual="3.14"+s1.substring(1);
        }
        else{
          actual=input.charAt(0)+s1;
        }
        return actual;
	}
}
