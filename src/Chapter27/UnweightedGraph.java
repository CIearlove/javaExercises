package Chapter27;

import java.util.*;

public class UnweightedGraph<V> extends AbstractGraph<V> {
  /** Construct a graph from edges and vertices stored in arrays */
  public UnweightedGraph(int[][] edges, V[] vertices) {
    super(edges, vertices);
  }
  /*
	 * Construct a graph for integer vertices 0,1,2 and edge list
	 */
  public UnweightedGraph(List<Edge> edges, int numberOfVertices) {
	    super(edges, numberOfVertices);
	  }
@Override
public int[][] getAdjacencyMatrix() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void printAdjacencyMatrix() {
	// TODO Auto-generated method stub
	
}

@Override
public List<Integer> getHamiltonianPath(V vertex) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<Integer> getHamiltonianPath(int inexe) {
	// TODO Auto-generated method stub
	return null;
}

}
