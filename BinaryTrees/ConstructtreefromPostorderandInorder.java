/*
 * Construct Tree from Postorder and Inorder
Send Feedback
For a given postorder and inorder traversal of a Binary Tree of type integer stored in an array/list, create the binary tree using the given two arrays/lists. You just need to construct the tree and return the root.
Note:
Assume that the Binary Tree contains only unique elements. 
Input Format:
The first line of input contains an integer N denoting the size of the list/array. It can also be said that N is the total number of nodes the binary tree would have.

The second line of input contains N integers, all separated by a single space. It represents the Postorder-traversal of the binary tree.

The third line of input contains N integers, all separated by a single space. It represents the inorder-traversal of the binary tree.
Output Format:
The given input tree will be printed in a level order fashion where each level will be printed on a new line. 
Elements on every level will be printed in a linear fashion. A single space will separate them.
Constraints:
1 <= N <= 10^4
Where N is the total number of nodes in the binary tree.

Time Limit: 1 sec
Sample Input 1:
7
4 5 2 6 7 3 1 
4 2 5 1 6 3 7 
Sample Output 1:
1 
2 3 
4 5 6 7 
Sample Input 2:
6
2 9 3 6 10 5 
2 6 3 9 5 10 
Sample Output 2:
5 
6 10 
2 3 
9 
 */


	
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

public class Solution {

public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
    //Your code goes here
    BinaryTreeNode<Integer> temp = result(postOrder,inOrder,0,inOrder.length-1, 0 ,postOrder.length-1);
    return temp;
}
// public static int postIndex=postOrder.length-1;

public static BinaryTreeNode<Integer> result( int []postOrder , int []inOrder ,int is, int ie , int ps , int pe){
    if(is>ie){
        return null;
    }
    
    int a=postOrder[pe];
    // z--;
    BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(a);
    if(is==ie){return root;}
    int rootIndex=is;
    for(int i=is;i<=ie;i++){
         if(inOrder[i]==root.data){
             rootIndex=i;
             break;
         }
    }
    
    
    root.left=result(postOrder,inOrder,is,rootIndex-1,ps,ps-is+rootIndex-1);
    root.right=result(postOrder,inOrder,rootIndex+1,ie,pe-ie+rootIndex,pe-1);
    
    return root;
    
}

}