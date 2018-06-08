package dataStructures.binaryTree;

public class Program {
	private static int counter = 0;
	
	
	public static TreeNode createTree(int size) {
		TreeNode node = new TreeNode();
		node.setValue(counter++ % 10);
		if (size != 0) {
			node.setLeft(createTree(size - 1));
			node.setRight(createTree(size - 1));
			
		}
		return node;
	}
	
	public static void main(String[] args) throws Exception {
		
		TreeNode a1 = new TreeNode();
		TreeNode a2 = new TreeNode();
		TreeNode a3 = new TreeNode();
		TreeNode a4 = new TreeNode();
		TreeNode a5 = new TreeNode();
		TreeNode a6 = new TreeNode();
		TreeNode a7 = new TreeNode();
		TreeNode a8 = new TreeNode();
		TreeNode a9 = new TreeNode();
		TreeNode a10 = new TreeNode();
		TreeNode a11 = new TreeNode();
		TreeNode a12 = new TreeNode();
		TreeNode a13 = new TreeNode();
		TreeNode a14 = new TreeNode();
		TreeNode a15 = new TreeNode();
		
				
		a1.setValue(1);
		a2.setValue(2);
		a3.setValue(3);
		a4.setValue(4);
		a5.setValue(5);
		a6.setValue(6);
		a7.setValue(7);
		a8.setValue(8);
		a9.setValue(9);
		a10.setValue(10);
		a11.setValue(11);
		a12.setValue(12);
		a13.setValue(13);
		a14.setValue(14);
		a15.setValue(15);
		
		
				
		a1.setLeft(a2);
		a1.setRight(a3);
		
		a2.setLeft(a4);
		a2.setRight(a5); 
		
		a3.setLeft(a6);
		a3.setRight(a7);
		
		a4.setLeft(a8);
		a4.setRight(a9);
		
		a5.setLeft(a10);
		a5.setRight(a11); 
		
		a6.setLeft(a12);
		a6.setRight(a13);
		
		a7.setLeft(a14);
		a7.setRight(a15);				
		
		
		
		//System.out.println(a1);		
				
		//System.out.println("-----------------Left side hierarchy-------------------------");
		//TreeNode nodeA = createTree(4); 
		//System.out.println(new PrintLeftSideHierarchy(nodeA));
		System.out.println("-----------------Top side hierarchy -------------------------");				
		TreeNode nodeB = createTree(4); 
		// nodeB.remove(nodeB.right);
		System.out.println(new PrintTopSideHierarchy(nodeB));
		
		/*
		
		-----------------Left side hierarchy-------------------------
			0
			├── 1
			|   ├── 2
			|   |   ├── 3
			|   |   |   ├── 4
			|   |   |   └── 5
			|   |   └── 6
			|   |       ├── 7
			|   |       └── 8
			|   └── 9
			|       ├── 0
			|       |   ├── 1
			|       |   └── 2
			|       └── 3
			|           ├── 4
			|           └── 5
			└── 6
			    ├── 7
			    |   ├── 8
			    |   |   ├── 9
			    |   |   └── 0
			    |   └── 1
			    |       ├── 2
			    |       └── 3
			    └── 4
				├── 5
				|   ├── 6
				|   └── 7
				└── 8
				    ├── 9
				    └── 0
		
		
		 * -----------------Top side hierarchy -------------------------
               
				               0
				              / \                      
				             /   \                     
				            /     \                    
				           /       \                   
				          /         \                  
				         /           \                 
				        /             \                
				       /               \               
				       6               1               
				      / \             / \          
				     /   \           /   \         
				    /     \         /     \        
				   /       \       /       \       
				   4       7       9       2       
				  / \     / \     / \     / \    
				 /   \   /   \   /   \   /   \   
				 8   5   1   8   3   0   6   3   
				/ \ / \ / \ / \ / \ / \ / \ / \ 
				0 9 7 6 3 2 0 9 5 4 2 1 8 7 5 4 
		 * 
		 * 
		 */
	}
}
