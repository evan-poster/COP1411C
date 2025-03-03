record TreeNode(int key, TreeNode left, TreeNode right) {
	public void printInorder() {
		if (left != null) {
			left.printInorder();
		}
		System.out.print(key + " ");
		if (right != null) {
			right.printInorder();
		}
	}

	public void printPreorder() {
		System.out.print(key + " ");
		if (left != null) {
			left.printPreorder();
		}
		if (right != null) {
			right.printPreorder();
		}
	}

	public void printPostorder() {
		if (left != null) {
			left.printPostorder();
		}
		if (right != null) {
			right.printPostorder();
		}
		System.out.print(key + " ");
	}
}
