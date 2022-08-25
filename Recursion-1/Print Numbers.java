/*Given the number 'n', write a code to print numbers from 1 to n in increasing order recursively.
Input Format :
Integer n
Output Format :
Numbers from 1 to n (separated by space) */
public class Solution {

	public static void print(int n){
		//Write your code here
       if (n >= 1)
		{
			print(n - 1);
			System.out.print(n + " ");
		}
    }

}
