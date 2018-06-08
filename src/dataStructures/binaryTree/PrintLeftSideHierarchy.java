package dataStructures.binaryTree;

import java.util.Hashtable;

public class PrintLeftSideHierarchy {

	private TreeNode root;
	private Hashtable<Integer, Boolean> ATables = new Hashtable<Integer, Boolean>();

	public PrintLeftSideHierarchy(TreeNode node) {
		root = node;
	}

	private String output = "";

	private String generateSpaces(int num, int value) {

		String setLinePreffix = "|   ";
		String setEmptyPreffix = "    ";

		if (num != 0) {
			for (int i = 1; i < num; i++) {

				// debugging out
				// System.out.println("i: "+i);
				// System.out.println("level: "+num);
				// System.out.println("hashTables.get(i-1) : "+ ATables.get(i-1));

				if (ATables.get(i - 1) == true) {
					output += setLinePreffix;
				} else if (ATables.get(i - 1) == false) {
					output += setEmptyPreffix;
				}
				/*
				 * step by step for understanding this algorithm
				 * 
				 * if(num == 2) { if(i == 1 && hashTables.get(i -1) == true) {
				 * output+=setLinePreffix; }else if(i == 1 && hashTables.get(i - 1) == false){
				 * output+=setEmptyPreffix; }
				 * 
				 * } if(num == 3) { if (i == 1 && hashTables.get(i - 1)==true){
				 * output+=setLinePreffix; }else if (i == 1 && hashTables.get(i - 1)==false){
				 * output+=setEmptyPreffix; } if(i == 2 && hashTables.get(i - 1)==true) {
				 * output+=setLinePreffix; }else if(i == 2 && hashTables.get(i - 1)==false) {
				 * output+=setEmptyPreffix; }
				 * 
				 * }
				 */
			}
		}
		return output;
	}

	private String printLeft(TreeNode node) {
		output += "\n";
		int level = root.getLevel(node.left);

		if (level >= 0) {
			ATables.put(level - 1, true);
			generateSpaces(level, node.left.value);
			output += "├── ";
		}
		output += "" + node.left.value;
		return output;
	}

	private String printRight(TreeNode node) {
		int level = root.getLevel(node.right);
		output += "\n";

		if (level >= 0) {
			generateSpaces(level, node.right.value);
			ATables.put(level - 1, false);
			output += "└── ";
		}

		output += "" + node.right.value;
		return output;
	}

	private String printChild(TreeNode node) {
		if (node.left != null) {
			printLeft(node);
			printChild(node.left);
		}
		if (node.right != null) {

			printRight(node);
			printChild(node.right);
		}
		return output;
	}

	@Override
	public String toString() {
		output += root.value;
		ATables.put(0, true);
		printChild(root);
		return output;
	}

}
