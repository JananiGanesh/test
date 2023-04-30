package com.greatlearning.dsa.transactionBST;

public class TransactionBSTDriver {

	private  static Node node;
	private static  Node dummy=null;
	
	public static void main(String[] args) {
		TransactionBSTDriver tree=new TransactionBSTDriver();
		TransactionBST transaction=new TransactionBST();
		
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left= new Node(55);	
		
       
		Node result=transaction.modifyBST(node,dummy);
	
		transaction.traverseRightSkewed(result);
		
	}

}
