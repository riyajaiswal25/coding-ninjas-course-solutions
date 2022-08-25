/*Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array. Return -1 if it is not present in the array.
First index means, the index of first occurrence of x in the input array.
Do this recursively. Indexing in the array starts from 0.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x
Output Format :
first index or -1 */

public class Solution {
	public static boolean checkNumber(int input[], int x) {
		 if(input.length == 0){
            return false;
        }
        if(input[0] == x)
            return true;
        int[] smallInput = new int[input.length - 1];
        for(int i = 0;i<smallInput.length;i++)
            smallInput[i] = input[i + 1];
        return checkNumber(smallInput,x);
	}
}