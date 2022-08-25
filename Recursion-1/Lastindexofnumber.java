/*Given an array of length N and an integer x, you need to find and return the last index of integer x present in the array. Return -1 if it is not present in the array.
Last index means - if x is present multiple times in the array, return the index at which x comes last in the array.
You should start traversing your array from 0, not from (N - 1).
Do this recursively. Indexing in the array starts from 0.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x
Output Format :
last index or -1 */
public class Solution {

	public static int lastIndex(int input[], int x) {
       if(input.length<=1){
          if(input[0]==x){
            return 0;
          }else{
            return -1;
          }
        }
      	int []smallArray=new int[input.length-1];
      	for(int index=1;index<input.length;index++){
          smallArray[index-1]=input[index];
        }
	    int val=lastIndex(smallArray,x);
      	if(val==-1){
          if(input[0]==x){
            return 0;
          }
        }
      	if(val>=0){
	      	return ++val;
        }
      	return -1;
	}
}