/**
 * 
 * #3: explain what is Binary Tree(BT), what is Binary Search Tree (BST) ? Use Java 'record' to create a five-node BT and BST
 * 
 * #4: Use the five node BST above, print the node value, use pre-order, in-order & post-order respectively.
 * 
 * Student Notes:
 * 
 * Since 4 referencces 3, they are both done here.
 * A binary tree is a tree data structure in which each node has at most two children, which are referred to as the left child and the right child.
 * 
 * A binary search tree (BST) is a binary tree where the value of each node is greater than the value of its left child and less than the value of its right child.
 * 
 */

public class Exercise_3_4 {
    
	public static void main(String[] args) {
        // Exercise #3
        // Binary Tree (BT)
        TreeNode bt = new TreeNode(1,
            new TreeNode(2,
                new TreeNode(4, null, null),
                new TreeNode(5, null, null)
            ),
            new TreeNode(3, null, null)
        );

        // Binary Search Tree (BST)
        TreeNode bst = new TreeNode(3,
            new TreeNode(1, null, 
                new TreeNode(2, null, null)
            ),
            new TreeNode(5,
                new TreeNode(4, null, null),
                null
            )
        );

        // Exercise #4
        // Print the node value, use pre-order, in-order & post-order respectively.
        System.out.println("BT Pre-order:");
        bt.printPreorder();
        System.out.println("\nBT In-order:");
        bt.printInorder();
        System.out.println("\nBT Post-order:");
        bt.printPostorder();
        System.out.println("\nBST Pre-order:");
        bst.printPreorder();
        System.out.println("\nBST In-order:");
        bst.printInorder();
        System.out.println("\nBST Post-order:");
        bst.printPostorder();

        System.out.println();
    }
}
