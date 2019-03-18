package Chapter27;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import Chapter27.AbstractGraph.Edge;
import Chapter27.AbstractGraph.Tree;

public class _27_5_Exercises {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File("file/_27_1_(1).txt");
		UnweightedGraph<Edge> graph = _27_1_Exercises.generateGraph(file);
		graph.printEdges();
		ArrayList<Integer> path = (ArrayList<Integer>) graph.getPath(0,5);
	}

}
