/*
 * Second Largest Element In Tree
Send Feedback
Given a generic tree, find and return the node with second largest value in given tree. Return NULL if no node with required value is present.
Input format :
Elements in level order form separated by space (as per done in class). Order is - 

Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element 
Output format:
Second Largest node data
Sample Input 1 :
10 3 20 30 40 2 40 50 0 0 0 0 
Sample Output 1 :
40
 */

public class Solution {

    /*	TreeNode structure 
     * 
     * class TreeNode<T> {
            T data;
            ArrayList<TreeNode<T>> children;
    
            TreeNode(T data){
                this.data = data;
                children = new ArrayList<TreeNode<T>>();
            }
        }*/
        
            
        
        static TreeNode<Integer> max;
        static TreeNode<Integer> secondMax;
        
        private static void traversal(TreeNode<Integer> root){
            if(root == null){
                return;
            }
            
            if(max == null){
                max = root;
            }else{
                
                if(root.data > max.data){
                    secondMax = max;
                    max = root;
                }else if(secondMax == null || root.data > secondMax.data){
                    if(root.data != max.data){
                        secondMax = root;
                    }
                    
                }
            }
            
            for(int i = 0; i < root.children.size(); ++ i){
                traversal(root.children.get(i));
            }
            
        }
        
        
        public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){
            traversal(root);
            return secondMax;
    
        }
        
        
    }
    