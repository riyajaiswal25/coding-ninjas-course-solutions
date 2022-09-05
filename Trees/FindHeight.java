/*
 * Code : Find Height
Send Feedback
Given a generic tree, find and return the height of given tree.
Input Format:
The first line of input contains data of the nodes of the tree in level order form. The order is: data for root node, number of children to root node, data of each of child nodes and so on and so forth for each node. The data of the nodes of the tree is separated by space.  
Output Format :
The first and only line of output prints the height of the given generic tree.
Constraints:
Time Limit: 1 sec
Sample Input 1:
10 3 20 30 40 2 40 50 0 0 0 0 
Sample Output 1:
3
 */

public class Solution {
	public static int getHeight(TreeNode<Integer> root){
		if (root == null){
            return 0;
        }
        
        int maxOfHeightsOfChildren = 0;                 //'maxOfHeightsOfChildren' aka maximum height amongst 
        for(int i = 0; i < root.children.size(); ++i){  //the heights of all children of the current node
            int maxHeightOfCurrentChild = getHeight(root.children.get(i));
            
            if (maxHeightOfCurrentChild > maxOfHeightsOfChildren){
                maxOfHeightsOfChildren = maxHeightOfCurrentChild;
            }
            
        } 
        
        return maxOfHeightsOfChildren + 1; //plus one for the root node itself
        
        
	}
}