package Chapter27;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import Chapter27.AbstractGraph.Edge;

public class _27_4_Exercise {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("file/_27_1_(1).txt");
		UnweightedGraph<Edge> graph = _27_1_Exercises.generateGraph(file);
		graph.printEdges();
		List<List<Integer>> list = graph.getConnectedComponents();
	}
}
