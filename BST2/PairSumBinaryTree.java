/*Pair Sum Binary Tree
Send Feedback
Given a binary tree and an integer S, print all the pair of nodes whose sum equals S.
Note:
1. Assume the given binary tree contains all unique elements.
2. In a pair, print the smaller element first. Order of different pairs doesn't matter.
Input format :
The first line of input contains data of the nodes of the tree in level order form. The data of the nodes of the tree is separated by space. If any node does not have a left or right child, take -1 in its place. Since -1 is used as an indication whether the left or right nodes exist, therefore, it will not be a part of the data of any node.
The following line of input contains an integer, that denotes the value of S.
Output Format :
Print each pair in a new line, as described in the task. 
Constraints:
Time Limit: 1 second
Sample Input 1:
5 10 6 2 3 -1 -1 -1 -1 -1 9 -1 -1
15
Sample Output 1:
5 10
6 9*/

/*
	
	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

 */
import java.util.Arrays;
public class Solution {

	static void pairSum(BinaryTreeNode<Integer> root, int sum) {

		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
        if(root==null)
            return;
        int[] arr=arrayInsertion(root);
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]==sum){
                System.out.println(arr[i]+" "+arr[j]);
                i++;
                j--;}
            else if(arr[i]+arr[j]<sum)
                i++;
            else 
                j--;

        }
	}
    private static int[] arrayInsertion(BinaryTreeNode<Integer> root){

        if(root==null){
            int[] arr=new int[0];
            return arr;}
        int firstData=root.data;

            int[] jrr= arrayInsertion(root.left);

        int[] krr= arrayInsertion(root.right);
        int[] finalArray=new int[1+jrr.length+krr.length];
        int k=0;
        finalArray[k]=firstData;
        k++;
        for(int i=0;i<jrr.length;i++)
        {  finalArray[k]=jrr[i];
         k++;
        }
        for(int i=0;i<krr.length;i++)
        {
            finalArray[k]=krr[i];
            k++;
        }
        return finalArray;

    }
   
}


