package q543E;



public class solution {
	
	public int diameterOfBinaryTree(TreeNode root) {
        
		int leftmax = 0 , rightmax = 0;
		
		if(root.left != null) leftmax = md(root.left, 0);
		if(root.right != null) rightmax = md(root.right, 0);
		
		return leftmax + rightmax;
		
    }
	
	int md(TreeNode root, int d) {
		
		if(root == null) return d;
		d++;
        return Math.max(md(root.left , d),md(root.right, d));
	}
	

}
