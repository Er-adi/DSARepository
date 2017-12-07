import java.util.ArrayList;

public class AdjLinkedList {

	private ArrayList<Integer> vertices;
	private ListNode[] edges;
	private int vertexCount =0;
	
	public AdjLinkedList(int vertexCount) {
		this.vertexCount = vertexCount;
		edges = new ListNode[vertexCount] ;
		vertices = new ArrayList<Integer>();
		for(int i =0 ;i< vertexCount;i++)
		{
			vertices.add(i);
			edges[i] = new ListNode();
		}
	}
	
	public void addEdge (int Source , int Destination) {
		int i = vertices.indexOf(Source);
		int j = vertices.indexOf(Destination);
		if(i!= -1 || j!= -1) {
			edges[i].insertAtBeginning(Destination);
			edges[j].insertAtBeginning(Source);
		}
	}
	 
}
