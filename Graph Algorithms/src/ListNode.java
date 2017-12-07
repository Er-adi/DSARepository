
public class ListNode {
	private int data;
	private ListNode next;
	ListNode(){
		this.data = 0;
		this.next = null;
	}
	
	ListNode(int data){
		this.data = data;		
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public ListNode getNext() {
		return next;
	}
	public void setNext(ListNode next) {
		this.next = next;
	}

	public void insertAtBeginning(int data) {
		this.data = data;
				
	}
	
}
