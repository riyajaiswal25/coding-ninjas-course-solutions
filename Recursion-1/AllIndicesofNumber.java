/*Given an array of length N and an integer x, you need to find all the indexes where x is present in the input array. Save all the indexes in an array (in increasing order).
//Do this recursively. Indexing in the array starts from 0.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x
Output Format :
indexes where x is present in the array (separated by space)
Constraints :
1 <= N <= 10^3
Sample Input :
5
9 8 10 8 8
8
Sample Output :
1 3 4*/

import java.util.*;//Adding to enable ArrayList
public class Solution {
    public static int[] allIndexes(int input[], int x) {
      	ArrayList<Integer> arr=	findAll(input,x,0,input.length,new ArrayList<Integer>());
      	int actual[]=new int[arr.size()];
      	for(int i=0;i<actual.length;i++){
          actual[i]=arr.get(i);
        }
      	return actual;
	}
  	public static ArrayList<Integer> findAll(int[] input,int x, int p, int r, ArrayList<Integer> ans){
     if(p>=r)
     return ans;
     if(input[p]==x){
          ans.add(p);
      }
      findAll(input,x,p+1,r,ans);

      return ans;
    }

}