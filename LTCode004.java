class ListNode {
    int val;
    ListNode next;
    
    // Constructor with no arguments
    ListNode() {}
    
    // Constructor with the value
    ListNode(int val) {
        this.val = val;
    }
    
    // Constructor with value and next node
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class LTCode004 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Initialize a dummy head and a current pointer to build the result list.
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        
        // Carry to keep track of sums that exceed 9.
        int carry = 0;
        
        // Traverse both lists until both are null and no carry remains.
        while (l1 != null || l2 != null || carry != 0) {
            // Get the values from l1 and l2, if they are not null, otherwise use 0.
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            
            // Update carry for next iteration (sum divided by 10).
            carry = sum / 10;
            
            // The digit to store in the result is the sum modulo 10.
            current.next = new ListNode(sum % 10);
            
            // Move current pointer to the newly created node.
            current = current.next;
        }
        
        // Return the result starting from the next of dummyHead (skip the dummy node).
        return dummyHead.next;
    }

    public static void main(String[] args) {
        // Test case 1: l1 = [2, 4, 3], l2 = [5, 6, 4]
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        
        LTCode004 solution = new LTCode004();
        ListNode result = solution.addTwoNumbers(l1, l2);
        
        // Print the result
        System.out.print("Result: ");
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        // Expected output: 7 0 8
    }
}
