
public class Intersection {
	
	static ListNode findIntersection(ListNode one, ListNode two){
		int l1 = 0;
		int l2 = 0;
		ListNode travel1 = one;
		ListNode travel2 = two;
		ListNode result = null;
		int difference = 0;
		
		while(one != null){
			l1++;
			one = one.next;
		}
		while(two != null){
			l2++;
			two = two.next;
		}
		
		// Balance out
		if (l1 > l2){
			difference = l1 -l2;
			while (difference != 0){
				travel1 = travel1.next;
				difference--;
			}
		} else if (l2 > l1){
			difference = l2 -l1;
			while (difference != 0){
				travel2 = travel2.next;
				difference--;
			}
		}
		
		// 2 list has the same length
		while (travel2 != null){
			if (travel2.val == travel1.val) {
				result = travel2;
				break;
			}
			travel2= travel2.next;
			travel1= travel1.next;
		
		}
		
		return result;
	}
	
	public static void main(String[] args){
		ListNode temp1 = new ListNode(4, null);
		ListNode temp2 = new ListNode(3, temp1);
		ListNode temp3 = new ListNode(2, temp2);
		ListNode temp4 = new ListNode(1, temp3);
		
		ListNode temp5 = new ListNode(7, temp4);
		ListNode temp6 = new ListNode(6, temp5);
		ListNode root1 = new ListNode(5, temp6);
		
		ListNode root2 = new ListNode(8, temp4);
		
		//findIntersection(root1, root2);
		System.out.println(findIntersection(root1, root2).val);
	}
}
