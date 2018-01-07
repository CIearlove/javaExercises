package Chapter27;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class WeightedGraph<V> extends AbstractGraph<V>{
	/*
	 * Priority adjacency lists
	 */
	private List<PriorityQueue<WeightedEdge>> queues;
	/*
	 * Construct a WeightedGraph from edges and vertices stored in arrays
	 */
	protected WeightedGraph(int[][] edges, V[] vertices) {
		super(edges, vertices);
		createQueues(edges,vertices.length);
	}
	/*
	 * Create priority adjacency lists from edge arrays
	 */
	private void createQueues(int[][] edges, int numberOfVertices) {
		queues = new ArrayList<PriorityQueue<WeightedEdge>>();
		for(int i=0;i<numberOfVertices;i++){
			queues.add(new PriorityQueue<WeightedEdge>());//Create a queue
		}
		
		for(int i=0;i<edges.length;i++){
			int u = edges[i][0];
			int v = edges[i][1];
			int weight = edges[i][2];
			//Insert an edge into the queue
			queues.get(u).offer(new WeightedEdge(u,v,weight));
		}
	}

	
	/** ShortestPathTree is an inner class in WeightedGraph */
	  public class ShortestPathTree extends Tree {
	    private double[] costs; // costs[v] is the cost from v to source

	    /** Construct a path */
	    public ShortestPathTree(int source, int[] parent, 
	        List<Integer> searchOrder, double[] costs) {
	      super(source, parent, searchOrder);
	      this.costs = costs;
	    }

	    /** Return the cost for a path from the root to vertex v */
	    public double getCost(int v) {
	      return costs[v];
	    }

	    /** Print paths from all vertices to the source */
	    public void printAllPaths() {
	      System.out.println("All shortest paths from " +
	        vertices.get(getRoot()) + " are:");
	      for (int i = 0; i < costs.length; i++) {
	        printPath(i); // Print a path from i to the source
	        System.out.println("(cost: " + costs[i] + ")"); // Path cost
	      }
	    }
	  }
	  
	  /** Find single source shortest paths */
	  public ShortestPathTree getShortestPath(int sourceIndex) {
	    // T stores the vertices whose path found so far
	    List<Integer> T = new ArrayList<Integer>();
	    // T initially contains the sourceVertex;
	    T.add(sourceIndex);

	    // vertices is defined in AbstractGraph
	    int numberOfVertices = vertices.size();

	    // parent[v] stores the previous vertex of v in the path
	    int[] parent = new int[numberOfVertices];
	    parent[sourceIndex] = -1; // The parent of source is set to -1

	    // costs[v] stores the cost of the path from v to the source
	    double[] costs = new double[numberOfVertices];
	    for (int i = 0; i < costs.length; i++) {
	      costs[i] = Double.MAX_VALUE; // Initial cost set to infinity
	    }
	    costs[sourceIndex] = 0; // Cost of source is 0

	    // Get a copy of queues
	    List<PriorityQueue<WeightedEdge>> queues = deepClone(this.queues);

	    // Expand T
	    while (T.size() < numberOfVertices) {
	      int v = -1; // Vertex to be determined
	      double smallestCost = Double.MAX_VALUE; // Set to infinity
	      for (int u : T) {
	        while (!queues.get(u).isEmpty() &&
	            T.contains(queues.get(u).peek().v)) {
	          queues.get(u).remove(); // Remove the vertex in queue for u
	        }

	        if (queues.get(u).isEmpty()) {
	          // All vertices adjacent to u are in T
	          continue;
	        }

	        WeightedEdge e = queues.get(u).peek();
	        if (costs[u] + e.weight < smallestCost) {
	          v = e.v;
	          smallestCost = costs[u] + e.weight;
	          // If v is added to the tree, u will be its parent
	          parent[v] = u;
	        }
	      } // End of for

	      T.add(v); // Add a new vertex to T
	      costs[v] = smallestCost;
	    } // End of while

	    // Create a ShortestPathTree
	    return new ShortestPathTree(sourceIndex, parent, T, costs);
	  }
	  
	  /** Clone an array of queues */
	  private List<PriorityQueue<WeightedEdge>> deepClone(
	    List<PriorityQueue<WeightedEdge>> queues) {
	    List<PriorityQueue<WeightedEdge>> copiedQueues =
	      new ArrayList<PriorityQueue<WeightedEdge>>();

	    for (int i = 0; i < queues.size(); i++) {
	      copiedQueues.add(new PriorityQueue<WeightedEdge>());
	      for (WeightedEdge e : queues.get(i)) {
	        copiedQueues.get(i).add(e);
	      }
	    }

	    return copiedQueues;
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
	public void printEdges() {
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
