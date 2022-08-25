/*Given the number 'n', find out and return the number of digits present in a number recursively.
Input Format :
Integer n
Output Format :
Count of digits */
public class Solution {

	public static int count(int n){
		//Write your code here
        if(n/10 == 0)
            return 1;
        return 1+count(n/10);
    }

}