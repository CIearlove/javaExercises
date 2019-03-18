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
	 * ���ļ�����ͼ
	 * @param file
	 * @return ��Ȩͼ
	 * @throws FileNotFoundException
	 */
	public static UnweightedGraph<Edge> generateGraph(File file) throws FileNotFoundException{
		List<Edge> edges = new ArrayList<Edge>();
		Scanner input = new Scanner(file);
		int numberOfVertices = input.nextInt();
		input.nextLine();
		for(int i=0;i<numberOfVertices;i++){
			String s = input.nextLine();
			String[] c = s.split("[\\s+]");//�������ַ���תΪ��������
			for(int j=1;j<c.length;j++){
				Edge edge = new Edge(i,Integer.parseInt(c[j]));//Generate edge
				edges.add(edge);//�����ھ�����
			}
		}
		return new UnweightedGraph(edges,numberOfVertices);//�����޼�Ȩͼ
	}
	/**
	 * �ж���ͼ�Ƿ�����ͨ�ġ�
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
