package Chapter27;
import java.io.File;
import java.io.FileNotFoundException;

import Chapter27.AbstractGraph.Edge;
import Chapter27.AbstractGraph.Tree;

public class TestBFS {
  public static void main(String[] args) throws FileNotFoundException {
	  File file = new File("file/_27_1_(1).txt");
	  UnweightedGraph<Edge> graph = _27_1_Exercises.generateGraph(file);
	  graph.printEdges();
	  Tree tree = graph.bfs(0);
  }
}
