package com.greatlearning.dsa.transactionBST;

public class TransactionBST {

	public Node modifyBST(Node node, Node par) {
		if(node == null) {
			return par;                                    
		}
		Node newRoot = modifyBST(node.left, node);              
		node.left = null;                                               
		node.right = modifyBST(node.right, par);                      
		return newRoot;                                                 
	}

	public void traverseRightSkewed(Node root)
	{
		if(root == null){
			return;
		}
		System.out.print(root.data + " ");
		traverseRightSkewed(root.right);       
	}

}
