import java.util.LinkedList;
import java.util.Queue;


public class RotateTree {
	public class Node {
		int val;
		Node left, right;

		public Node(int data) {
			this.val = data;
			left = right = null;
		}
	}

	private Node root = null;

	public boolean insert(int value) {
		if (root == null) {
			root = new Node(value);

		} else {
			root = insert(value, root);
		}
		return true;
	}

	public Node insert(int value, Node node) {
		if (node == null) {
			node = new Node(value);

		} else {
			if (node.val > value) {
				node.left = insert(value, node.left);
			} else {
				node.right = insert(value, node.right);
			}
		}
		return node;
	}
	static void printByLevel(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);

		while (!q.isEmpty()) {
			Node temp = q.remove();

			System.out.println(temp.val + " ");

			if (temp.left != null)
				q.add(temp.left);
			if (temp.right != null)
				q.add(temp.right);

		}
	}
	
	static Node rotate (Node node){
		
		if (node != null){
			node.left = rotate(node.left);
			node.right = rotate(node.right);
			
			Node temp = node.left;
			node.left = node.right;
			node.right = temp;
		}
		
		
		
		return node;
	}
	
	
	public static void main(String[] args) {
		RotateTree tree = new RotateTree();
		tree.insert(8);
		tree.insert(3);
		tree.insert(10);
		tree.insert(1);
		tree.insert(6);
		tree.insert(14);
		tree.insert(4);
		tree.insert(7);
		tree.insert(13);
//		trim(tree.root, 5, 13);
		rotate(tree.root);
		printByLevel(tree.root);

	}
}
