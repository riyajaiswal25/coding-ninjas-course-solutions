/*Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to return the answer.
Do this recursively.
Input format :
Two integers x and n (separated by space)
Output Format :
x^n (i.e. x raise to the power n) */

public class Solution {

	public static int power(int x, int n) {
        if(n==0)
        {
            return 1;
        }
        else if(n==1)
        {
            return x;
        }
        else{
            return x*power(x,n-1);
        }
	}
}