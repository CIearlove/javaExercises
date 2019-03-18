package Chapter27;

import java.io.File;
import java.io.FileNotFoundException;

import Chapter27.AbstractGraph.Edge;

public class _27_6_Exercises {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File("file/_27_1.txt");
		UnweightedGraph<Edge> graph = _27_1_Exercises.generateGraph(file);
		graph.printEdges();
		graph.isCyclic(0);
		if(graph.isCyclic){
			System.out.println("图中有环。");
		}
		else
			System.out.println("图中无环。");
	}

}
