/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public static ListNode insertionSortList(ListNode head) {
    	
    	ListNode resultNode = null;
    	A a = new A();
    	
    	while(head != null) {
    		
    		//정렬 함수 호출
    		resultNode = a.ascendingSorting(resultNode, head.val);
    		ListNode tempNode = resultNode;
    		
    		//다음 노드
    		head = head.next;
    	}
        
        
    	return resultNode;
    }
    
    

}

class A {
    public ListNode ascendingSorting(ListNode resultNode, int val) {

    	ListNode newNode = new ListNode(val);
    	
    	
    	if(resultNode == null) {
    		return newNode;
    	}
    	
    	if(val <= resultNode.val) {
    		addNode(null, newNode, resultNode);
    		return newNode;
    	}
    	
    	//첫 번째 노드 저장
    	ListNode head = resultNode;
    	
    	ListNode preNode = resultNode;
    	resultNode = resultNode.next;
    	
    	int cnt =0;
    	
    	while(resultNode != null) {
    		
    		if(val <= resultNode.val) {
    			addNode(preNode, newNode, resultNode);
    			cnt++;
    			break;
    		}
    		
    		preNode = resultNode;
    		resultNode = resultNode.next;
    		
    	}
    	
    	if(cnt == 0) {
    		addNode(preNode, newNode, null);
    	}
    	
    	
    	return head;
    }
    
    public void addNode(ListNode preNode, ListNode targetNode, ListNode postNode) {
    	
    	if(preNode == null) {
    		targetNode.next = postNode;
    		return ;
    	}
    	if(postNode == null) {
    		preNode.next = targetNode;
    		return ;
    	}
    	
    	targetNode.next = preNode.next;
		preNode.next = targetNode;    	
    	
    }
}
