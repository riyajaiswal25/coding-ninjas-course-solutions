/*Given an array of length N, you need to find and return the sum of all elements of the array.
Do this recursively.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Output Format :
Sum */
public class Solution {

	public static int sum(int input[]) {
        if(input.length == 1)
            return input[0];
        int smallInput[] = new int[input.length-1];
        for(int i=1; i<input.length; i++)
        {
            smallInput[i-1] = input[i];
        }
        int smallAns = sum(smallInput);
        return smallAns+input[0];
     }
}