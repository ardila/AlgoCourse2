
import java.util.Stack;

public class DepthFirstPaths {
	private boolean[] marked;
	private int[] edgeTo;
	private int s;
	private Stack to_explore;
	
	
	public DepthFirstPaths(Graph G, int s){
		dfs(G, s);
	}
	
	private void dfs(Graph G, int v)
	{
		to_explore.push(v);
		while(!to_explore.isEmpty()){
			marked[v] = true;
			for (int w: G.adj(v))
				if (!marked[w])
				{
					to_explore.push(v);//dfs(G, w);
					edgeTo[w] = v;
				}
		}
	}
}
