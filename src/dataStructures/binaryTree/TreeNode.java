package dataStructures.binaryTree;

public class TreeNode {

	public TreeNode left, right;
	public int value;

	/*
	 * methods getRight, setRight, getLeft, setLeft, setData, getData getLevel
	 */

	public TreeNode() {
		left = null;
		right = null;
		value = 0;
	}

	public TreeNode(int n) {
		left = null;
		right = null;
		value = n;
	}

	public void setLeft(TreeNode n) {
		left = n;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setRight(TreeNode n) {
		right = n;
	}

	public TreeNode getRight() {
		return left;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getData() {
		return value;
	}

	/*
	 * 
	 * our recursion function for searching current Node
	 */

	private int searchLevelByNode(TreeNode node, TreeNode currentNode, int level) {
		// for 0 level
		if (node == currentNode) {
			return level;
		}
		if (node.left == null && node.right == null) {
			return -1;
		}
		int curLevel = level; // wenn -1, da  Knoten nicht in Teilbaum gefunden
		if (node.left != null) {
			curLevel = searchLevelByNode(node.left, currentNode, level + 1);
		}
		if (curLevel == -1 && node.right != null) {
			curLevel = searchLevelByNode(node.right, currentNode, level + 1);
		}
		return curLevel;
	}

	public int getLevel(TreeNode currentNode) {
		int level = 0;
		return searchLevelByNode(this, currentNode, level);
	}

	public boolean remove(TreeNode node) {
		if (left == node) {
			left = null;
			return true;
		} else if (right == node) {
			right = null;
			return true;
		}
		return false;
	}
}
