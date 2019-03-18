package Chapter27;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import Chapter27.AbstractGraph.Tree;

public abstract class AbstractGraph<V> implements Graph<V>{
	protected List<V> vertices;//Store vertices
	protected List<List<Integer>> neighbors;//Adjacency lists
	protected boolean isCyclic;//是否存在环
	/*
	 * Construct a graph from edges and vertices stored in arrays
	 */
	protected AbstractGraph(int[][] edges, V[] vertices){
		this.vertices = new ArrayList<V>();
		for(int i=0;i<vertices.length;i++){
			this.vertices.add(vertices[i]);
		}
		createAdjacencyLists(edges,vertices.length);
	}
	/*
	 * Construct a graph from edges and vertices stored in List
	 */
	protected AbstractGraph(List<Edge> edges, List<V> vertices){
		this.vertices = vertices;
		createAdjacencyLists(edges,vertices.size());
	}
	/*
	 * Construct a graph for integer vertices 0,1,2 and edge list
	 */
	protected AbstractGraph(List<Edge> edges, int numberOfVertices){
		this.vertices = new ArrayList<V>();
		for(int i=0;i<numberOfVertices;i++){
			this.vertices.add((V) new Integer(i));//vertices is {0,1,...}
		}
		createAdjacencyLists(edges,numberOfVertices);
	}
	/*
	 * Construct a graph from integer vertices 0,1,and edge array
	 */
	protected AbstractGraph(int[][] edges, int numberOfVertices){
		this.vertices = new ArrayList<V>();
		for(int i=0;i<numberOfVertices;i++){
			this.vertices.add((V) new Integer(i));//vertices is {0,1,...}
		}
		createAdjacencyLists(edges,numberOfVertices);
	}
	/*
	 * Create adjacency lists for each vertex
	 */
	private void createAdjacencyLists(int[][] edges, int numberOfVertices) {
		//Create a linked list
		neighbors = new ArrayList<List<Integer>>();
		for(int i=0;i<numberOfVertices;i++){
			neighbors.add(new ArrayList<Integer>());
		}
		
		for(int i=0;i<edges.length;i++){
			int u = edges[i][0];
			int v = edges[i][1];
			neighbors.get(u).add(v);
		}
	}
	/*
	 * Create adjacency lists for each vertex
	 */
	private void createAdjacencyLists(List<Edge> edges, int numberOfVertices) {
		//Create a linked list
		neighbors = new ArrayList<List<Integer>>();
		for(int i=0;i<numberOfVertices;i++){
			neighbors.add(new ArrayList<Integer>());
		}
		
		for(Edge edge : edges){
			neighbors.get(edge.u).add(edge.v);
		}
	}
	
	public int getSize(){
		return vertices.size();
	}
	
	public List<V> getVertices(){
		return vertices;
	}
	
	public V getVertex(int index){
		return vertices.get(index);
	}
	
	public int getIndex(V v){
		return vertices.indexOf(v);
	}
	
	public List<Integer> getNeighbors(int index){
		return neighbors.get(index);
	}
	
	public int getDegree(int v){
		return neighbors.get(v).size();
	}
	
	/*
	 * Print the edges
	 */
	public void printEdges(){
		for(int u=0;u<neighbors.size();u++){
			System.out.print("Vertex "+u+": ");
			for(int j=0;j<neighbors.get(u).size();j++){
				System.out.print("("+u+","+neighbors.get(u).get(j)+")");
			}
			System.out.println();
		}
	}
	/*
	 * Edge inner class inside the AbstractGraph class
	 */
	public static class Edge{
		public int u;//Starting vertex of the edge
		public int v;//Ending vertex of the edge
		
		public Edge(int u,int v){
			this.u = u;
			this.v = v;
		}
	}
	/*
	 * Tree inner class inside the AbstractGraph class
	 */
	public class Tree{
		private int root;//The root of the tree
		private int[] parent;//Store the parent of each vertex
		private List<Integer> searchOrders;//Store the search order
		
		public Tree(int root,int[] parent,List<Integer>searchOrders){
			this.root = root;
			this.parent = parent;
			this.searchOrders = searchOrders;
		}
		
		public Tree(int root,int[] parent){
			this.root = root;
			this.parent = parent;
		}
		
		/*
		 * Return the root of the tree
		 */
		public int getRoot(){
			return root;
		}
		/*
		 * Return the parent of vertex x
		 */
		public int getParent(int v){
			return parent[v];
		}
		/*
		 * Return an array representing search order
		 */
		public List<Integer> getSearchOrders(){
			return searchOrders;
		}
		/*
		 * Return the number of vertices found
		 */
		public int getNumberOfVerticesFound(){
			return searchOrders.size();
		}
		/*
		 * Return the path of vertices from a vertex index to root
		 */
		public List<V> getPath(int index){
			ArrayList<V> path = new ArrayList<V>();
			do{
				path.add(vertices.get(index));
				index = parent[index];
			}
			while(index != -1);
			return path;
		}
		
		/*
		 * Print a path from the root to vertex v
		 */
		public void printPath(int index){
			List<V> path = getPath(index);
			System.out.print("A path from "+vertices.get(root)+" to "+vertices.get(index)+":");
			for(int i = path.size()-1;i>=0;i--){
				System.out.print(path.get(i)+" ");
			}
			System.out.println();
		}
		
		/*
		 * Print the whole tree
		 */
		public void printTree(){
			System.out.println("Root is: "+vertices.get(root));
			System.out.print("Edges: ");
			for(int i=0;i<parent.length;i++){
				if(parent[i] != -1){
					//Display the edge
					System.out.print("("+vertices.get(parent[i])+","+vertices.get(i)+") ");
				}
			}
			System.out.println();
		}
	}
	
	/*
	 * Obtain a DFS tree starting from vertex v
	 */
	public Tree dfs(int v){
		List<Integer> searchOrders = new ArrayList<Integer>();
		int[] parent = new int[vertices.size()];
		for(int i=0;i<parent.length;i++){
			parent[i]=-1;//Initialize parent[i] to -1
		}
		
		//Mark visited vertices
		boolean[] isVisited = new boolean[vertices.size()];
		
		//Recursively search
		dfs(v,parent,searchOrders,isVisited);
		
		//Return a search tree
		return new Tree(v,parent,searchOrders);
		
	}
	/**
	 * 
	 * @param v
	 * @param parent
	 * @param searchOrders
	 * @param isVisited
	 * @return 是否构成环
	 */
	private void dfs(int v, int[] parent, List<Integer> searchOrders, boolean[] isVisited) {
		//Store the visited vertex
		searchOrders.add(v);
		isVisited[v] = true;//Vertex v is visited
		for(int i:neighbors.get(v)){
			if(!isVisited[i]){
				parent[i] = v;//The parent of vertex i is v
				dfs(i,parent,searchOrders,isVisited);//Recursive search
			}
			else if(i!=parent[v]){//如果访问过，且不是其父节点，那么就构成环
				isCyclic = true;
			}
		}
	}
	
	/**
	 * Starting bfs search from vertex v
	 */
	public Tree bfs(int v){
		List<Integer> searchOrders = new ArrayList<Integer>();
		int[] parent = new int[vertices.size()];
		for(int i=0;i<parent.length;i++){
			parent[i]=-1;//Initialize parent[i] to -1
		}
		LinkedList<Integer> queue = new LinkedList<Integer>();//list used as a queue

		//Mark visited vertices
		boolean[] isVisited = new boolean[vertices.size()];
		queue.add(v);//Enqueue v
		isVisited[v] = true;//Vertex v is visited
		while(!queue.isEmpty()){
			int u = queue.poll();//Dequeue to u
			searchOrders.add(u);//u searched
			for(int w : neighbors.get(u)){
				if(!isVisited[w]){
					queue.offer(w);//Enqueue w
					parent[w] = u;//The parent of w is u
					isVisited[w] = true;//Mark is visited
				}
			}
		}
		
		return new Tree(v,parent,searchOrders);
	}
	/**
	 * Find out the path between two vertices by DFS
	 * @param u src vertice
	 * @param v des vertice
	 * @return the path between two vertices
	 */
	public List<Integer> getPath(int u,int v){
		ArrayList<Integer> path = new ArrayList<Integer>();
		Tree tree = dfs(u);
		while(u != v){
			path.add((Integer) vertices.get(v));
			v = tree.parent[v];
			if(v == -1)
				return null;
		}
		path.add((Integer) vertices.get(v));
		return path;
	}
	/**
	 * 找出一个图表中所有连通部分
	 * @return 图中有n个连通部分，方法就返回一个有n个元素的线性表，每个元素都包含了连通部分的顶点。
	 */
	public List<List<Integer>> getConnectedComponents(){
		
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		List<Integer> vertexIndices = new ArrayList<Integer>();	
		for (int i = 0; i < vertices.size(); i++)
			vertexIndices.add(i);  
		while (vertexIndices.size() > 0){
			Tree tree = dfs(vertexIndices.get(0));
			list.add(tree.getSearchOrders());
			vertexIndices.removeAll(tree.getSearchOrders());
		}
		return list;
	}
	/**
	 * 判定图中是否存在环
	 * 图只有树边和反向边，如果有反向边那么就有环，否则就是树或森林
	 */
	public void isCyclic(int v){
		List<Integer> searchOrders = new ArrayList<Integer>();
		int[] parent = new int[vertices.size()];
		for(int i=0;i<parent.length;i++){
			parent[i]=-1;//Initialize parent[i] to -1
		}
		//Mark visited vertices
		boolean[] isVisited = new boolean[vertices.size()];
		dfs(v,parent,searchOrders,isVisited);
	}
	/**
	 * 找出图中的环
	 */
	public List<Integer> getACycle(){
		return null;
	}
}
