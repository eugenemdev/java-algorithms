package dataStructures.binaryTree;

import java.util.ArrayList;
import java.util.List;

public class PrintTopSideHierarchy {

	private TreeNode root;
	private List<TreeNode> listNode = new ArrayList<TreeNode>();
	private String outtop = "";
	private String out = "";
	private List<ArrayList<TreeNode>> mainList = new ArrayList<ArrayList<TreeNode>>();
	private String spacesArray[];
	private int spaceBetweenNumbersFactor = 2;
	private int spaceBetweenNumbers = 1;
	private int countLevel = getMaxLevel();
	private int widthNumber = 1; // by default
	private String leftSlash = "\\";
	private String rigthSlash = "/";
	private String outSpaces = "";
	private String outSpacesAuto = "";

	public PrintTopSideHierarchy(TreeNode node) {
		root = node;
	}

	@Override
	public String toString() {

		putNodeList(root);
		putDoubleList(0);
		getIterationDoubleList();

		return outtop;
	}

	public void getIterationDoubleList() {
		countLevel = getMaxLevel();

		for (int i = mainList.size() - 1; i >= 0; i--) {
			// row iteration
			iterateRowDoubleList(i);
			// after iteration need write data to outtop
			exportOuttop();
		}
	}

	private String exportOuttop() {
		spacesArray[0] = outSpaces;
		String otherSpaces = "";

		for (int f = spacesArray.length - 1; f >= 0; f--) {
			if (spacesArray[f] != null) {
				if (f == spacesArray.length - 1) {
					otherSpaces += spacesArray[f];
				} else {
					otherSpaces += "\n" + spacesArray[f];
				}
			}
		}
		// main out
		outtop = otherSpaces + "\n" + out + "\n" + outtop;
		return outtop;
	}

	private void iterateRowDoubleList(int rowNumber) {

		List<TreeNode> children = new ArrayList<TreeNode>();
		TreeNode child = new TreeNode();
		List<TreeNode> parents = new ArrayList<TreeNode>();
		TreeNode parent = new TreeNode();

		int j = mainList.get(rowNumber).size();

		children = mainList.get(rowNumber);

		j--;

		int exp = getMaxLevel() - rowNumber;
		int lines = (int) Math.pow(2, exp);

		spacesArray = new String[lines];

		while (j >= 0) {

			if (rowNumber != 0) {
				parents = mainList.get(rowNumber - 1);				
			} else {
				parents = mainList.get(rowNumber);
			}
			child = children.get(j);
			parent = searchParent(child, parents);

			// function for fill outtop
			if (parent != null) {
				fillOuttop(child, parent, rowNumber, lines); // i = currentLevel;
			}

			j--;

		}
	}

	private String getSpacesOtherNumberRow(int currentLevel) {
		String spaces = "";
		for (int i = 0; i < spaceBetweenNumbers; i++) {
			spaces += " ";
		}

		// correction
		// when lvl 4 ... 0
		// lvl 3 ... 1
		// lvl 2 ... 2
		int j = spaceBetweenNumbers - 1;
		while (j > 0) {
			spaces += " ";
			j--;
		}
		return spaces;
	}

	private void fillOuttop(TreeNode child, TreeNode parent, int currentLevel, int lines) {

		// new row
		if (countLevel != currentLevel) {

			// level minus
			countLevel--;
			// here code for factors multiplication
			spaceBetweenNumbers = (int) Math.pow(spaceBetweenNumbersFactor, getMaxLevel() - countLevel);
			// next out for numbers
			out = getSpacesFirstNumberRow();
			// new out for spaces
			outSpaces = getSpacesFirstNumberRow();
			outSpacesAuto = getSpacesFirstNumberRow(); // row after first space

		}

		if (child == parent.right) {

			out += child.value + getSpacesOtherNumberRow(currentLevel);
			// 1 space
			outSpaces += rigthSlash + getSpacesOtherNumberRow(currentLevel).substring(widthNumber);
			// multi spacing
			if (getMaxLevel() - currentLevel != 0) {
				getMultiSpacesRigth(lines, currentLevel);
			}

		} else if (child == parent.left) {
			out += child.value + getSpacesOtherNumberRow(currentLevel);
			// 1 space
			outSpaces += " " + leftSlash + getSpacesOtherNumberRow(currentLevel);
			// multi space
			if (getMaxLevel() - currentLevel != 0) {
				getMultiSpacesLeft(lines, currentLevel);
			}
		} else if (parent != null) { // Spitz 0
			out += child.value;
		}

	}

	// calculate new rows by right
	private void getMultiSpacesRigth(int lines, int currentLevel) {

		for (int i = 1; i < lines; i++) {

			String temp = outSpacesAuto;

			if (isEmpty(spacesArray[i]) != true) {
				temp = spacesArray[i];
			}
			if (i > 1) {
				temp += getSpaces(i) + rigthSlash
						+ getSpacesOtherNumberRow(currentLevel).substring(widthNumber + i * 2 - 1);
			} else {
				temp += getSpaces(i) + rigthSlash + getSpacesOtherNumberRow(currentLevel).substring(widthNumber + i);
			}

			spacesArray[i] = temp;
		}
	}

	// calculate new rows by left
	private void getMultiSpacesLeft(int lines, int currentLevel) {

		for (int i = 1; i < lines; i++) {
			String temp = outSpacesAuto;
			
			if (isEmpty(spacesArray[i]) != true) {
				temp = spacesArray[i];
			}
			temp += leftSlash + getSpacesOtherNumberRow(currentLevel) + getSpaces(i);
			spacesArray[i] = temp;
		}
	}

	/*
	 * Utilities
	 */

	/*
	 * create double array for next calculation
	 */
	private void putDoubleList(int lvl) {
		int length = listNode.size();
		List<TreeNode> tempList = new ArrayList<TreeNode>();

		for (int i = 0; i < length; i++) {

			int levelBefore = -1;
			int levelCurrent = root.getLevel(listNode.get(i));

			if (i != 0) {
				levelBefore = root.getLevel(listNode.get(i - 1));
			}

			if (levelCurrent > levelBefore && lvl == levelCurrent) {

				tempList.add(listNode.get(i));
			}
		}
		if (lvl <= getMaxLevel()) {
			mainList.add((ArrayList<TreeNode>) tempList);
			lvl++;
			// recursion
			putDoubleList(lvl);
		}
	}

	/*
	 * put elements to TreeNode list
	 * 
	 */
	private void putNodeList(TreeNode node) {
		if (node.left != null) {
			listNode.add(node);
			putNodeList(node.left);
		}
		if (node.right != null) {
			listNode.add(node);
			putNodeList(node.right);
		}
		// last Node
		if (node.right == null && node.left == null) {
			listNode.add(node);
		}
	}

	/*
	 * find current parent for child
	 */
	private TreeNode searchParent(TreeNode child, List<TreeNode> parents) {
		TreeNode parent = new TreeNode();
		int length = parents.size();

		for (int i = 0; i < length; i++) {
			if (parents.get(i).right == child) {

				return parents.get(i);
			}

			if (parents.get(i).left == child) {
				return parents.get(i);
			}
		}

		return parent;
	}

	// get spaces for first element in the row
	private String getSpacesFirstNumberRow() {
		String spaces = "";
		for (int i = 0; i < spaceBetweenNumbers; i++) {
			spaces += " ";
		}
		spaces = spaces.substring(widthNumber);
		return spaces;
	}

	// get spaces by numbers
	private String getSpaces(int n) {
		String spaces = "";
		for (int i = 0; i < n; i++) {
			spaces += " ";
		}
		return spaces;
	}

	// check empty for element of array
	private Boolean isEmpty(String val) {
		Boolean result = val == null ? true : false;
		return result;

	}

	// get max level for all tree
	private int getMaxLevel() {
		int maxLevel = 0;
		int length = listNode.size();
		for (int i = 0; i < length; i++) {
			int l = root.getLevel(listNode.get(i));
			maxLevel = (l > maxLevel) ? l : maxLevel;
		}
		return maxLevel;
	}
}
