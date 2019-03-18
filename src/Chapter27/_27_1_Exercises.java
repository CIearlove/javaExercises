package Chapter27;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Chapter27.AbstractGraph.Edge;
import Chapter27.AbstractGraph.Tree;

public class _27_1_Exercises {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("file/_27_1_(1).txt");
		Graph<Edge> graph = generateGraph(file);
		graph.printEdges();
		if(isConnectedGraph(graph)){
			System.out.println("The graph is connected.");
		}
		else
			System.out.println("The graph is not connected.");
	}
	/**
	 * 从文件读入图
	 * @param file
	 * @return 无权图
	 * @throws FileNotFoundException
	 */
	public static UnweightedGraph<Edge> generateGraph(File file) throws FileNotFoundException{
		List<Edge> edges = new ArrayList<Edge>();
		Scanner input = new Scanner(file);
		int numberOfVertices = input.nextInt();
		input.nextLine();
		for(int i=0;i<numberOfVertices;i++){
			String s = input.nextLine();
			String[] c = s.split("[\\s+]");//将顶点字符串转为顶点数组
			for(int j=1;j<c.length;j++){
				Edge edge = new Edge(i,Integer.parseInt(c[j]));//Generate edge
				edges.add(edge);//生成邻居链表
			}
		}
		return new UnweightedGraph(edges,numberOfVertices);//生成无加权图
	}
	/**
	 * 判定该图是否是连通的。
	 * @param g
	 * @return
	 */
	public static boolean isConnectedGraph(Graph g){
		Tree tree = g.dfs((int) g.getVertex(0));
		if(tree.getNumberOfVerticesFound() == g.getSize())
			return true;
		return false;
	}
}
