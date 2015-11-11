import java.util.LinkedList;
import java.util.Queue;

public class TrimTree {
	// static Node trim(Node node, int min, int max) {
	//
	// if (node != null) {
	//
	// node.setLeft(trim(node.getLeft(), min, max));
	// node.setRight(trim(node.getRight(), min, max));
	//
	// if (node.getVal() < min) {
	// // move right to replace node
	// // delete right
	// // delete left
	// // if (node.getRight() != null) {
	// // node.setVal(node.getRight().getVal());
	// // }
	// // node.setLeft(null);
	// // node.setRight(null);
	//
	// } else if (node.getVal() > max) {
	// // move left to replace node
	// // delete right
	// // delete left
	// // if (node.getLeft() != null) {
	// // node.setVal(node.getLeft().getVal());
	// // }
	// // node.setLeft(null);
	// // node.setRight(null);
	// }
	// }
	//
	// return node;
	// }
	//
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

	//
	// public static void main(String[] args) {
	// Node root = new Node(8);
	//
	// Node temp1 = new Node(3);
	// Node temp2 = new Node(10);
	// Node temp3 = new Node(1);
	// Node temp4 = new Node(6);
	// Node temp5 = new Node(14);
	// Node temp6 = new Node(4);
	// Node temp7 = new Node(7);
	// Node temp8 = new Node(13);
	//
	// root.setLeft(temp1);
	// root.setRight(temp2);
	//
	// temp1.setLeft(temp3);
	// temp1.setRight(temp4);
	//
	// temp4.setLeft(temp6);
	// temp4.setRight(temp7);
	// temp2.setRight(temp5);
	// temp5.setLeft(temp8);
	//
	// trim(root, 5, 13);
	// printByLevel(root);
	// }

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

	static Node trim(Node node, int min, int max) {
		// if (node == null) {
		// return null;
		// }
		if (node != null) {
			node.left = trim(node.left, min, max);
			node.right = trim(node.right, min, max);

			if (node.val < min) {
				return node.right;
			}
			if (node.val > max) {
				return node.left;
			}

		}
		return node;

		// if(node==null) return null;
		//
		// if(node.val>max) return trim(node.left,min,max);
		// else if(node.val<min) return trim(node.right,min,max);
		// else {
		// node.left=trim(node.left,min,max);
		// node.right=trim(node.right,min,max);
		// }
		// return node;

	}

	public static void main(String[] args) {
		TrimTree tree = new TrimTree();
		tree.insert(8);
		tree.insert(3);
		tree.insert(10);
		tree.insert(1);
		tree.insert(6);
		tree.insert(14);
		tree.insert(4);
		tree.insert(7);
		tree.insert(13);
		trim(tree.root, 5, 13);
		printByLevel(tree.root);

	}

}
