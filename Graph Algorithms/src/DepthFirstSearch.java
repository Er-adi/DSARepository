import java.util.Stack;

class Vertex{
	public char label;
	public boolean visited;

	public Vertex(char label) {
		this.label = label;
		this.visited = false;
	}
		
}

public class DepthFirstSearch{

		
	private final int maxVertices = 20;
	private Vertex vertexList[];
	private boolean adjMatrix[][];
	private int vertexCount;

	private Stack<Integer> theStack;
		
	public DepthFirstSearch() {
	
		vertexList = new Vertex[maxVertices];
		adjMatrix = new AdjMatrix(maxVertices).getAdjMatrix();
		vertexCount = 0;
		theStack = new Stack<Integer>();
		
	}
	
	public void addVertex(char label)
	{
		vertexList[vertexCount++] = new Vertex(label);
	}
	
	public void displayVertex(int v)
	{
		System.out.println(vertexList[v].label);
	}
	
	public int getAdjUnvisitedVertex(int v) {
		for (int j =0;j< vertexCount;j++)
			if(adjMatrix[v][j] == true && vertexList[j].visited == false )
				return j;
		return -1;
	}
	
	public void dfs()
	{
		vertexList[0].visited = true;
		displayVertex(0);
		theStack.push(0);
		while(!theStack.isEmpty()) {
			int v = getAdjUnvisitedVertex(theStack.peek());
			if(v==-1)
				theStack.pop();
			else
			{
				vertexList[v].visited=true;
				displayVertex(v);
				theStack.push(v);
			}
			
		}
		
		for(int j=0;j<vertexCount;j++)
			vertexList[j].visited= false;
	}
	
	
		
}