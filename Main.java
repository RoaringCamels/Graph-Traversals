import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.print("Adjacency Matrix Graph representation");
        System.out.println("\n");
        int numOfNodes = 9;
        AdjacencyMatrixGraph graph = new AdjacencyMatrixGraph(numOfNodes);
        graph.addNode(new Node("A"));
        graph.addNode(new Node("B"));
        graph.addNode(new Node("C"));
        graph.addNode(new Node("D"));
        graph.addNode(new Node("E"));
        graph.addNode(new Node("F"));
        graph.addNode(new Node("G"));
        graph.addNode(new Node("H"));
        graph.addNode(new Node("I"));

        /**
         * A = 0
         * B = 1
         * C = 2
         * D = 3
         * E = 4
         * F = 5
         * G = 6
         * H = 7
         * I = 8
         */
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(0, 3);
        graph.addEdge(1, 4);
        graph.addEdge(3, 6);
        graph.addEdge(4, 5);
        graph.addEdge(4, 7);
        graph.addEdge(6, 7);
        graph.addEdge(5, 2);
        graph.addEdge(5, 7);
        graph.addEdge(7, 8);
        graph.addEdge(2, 1);
        graph.addEdge(8, 5);
        graph.printGraph();

        System.out.println();
        System.out.println("Breath-first Traversal Order with an Adjacency Matrix:");
        // BFS starting at A or 0
        graph.BFS(0, numOfNodes);
        System.out.println("\n");
        System.out.println("Depth-first Traversal Order with an Adjacency Matrix:");
        // BFS starting at A or 0
        boolean[] seen = new boolean[numOfNodes];
        graph.DFS(0, seen, numOfNodes);
        System.out.println("\n");
        /*********************************************************************************** */
        System.out.println("******************************************");
        System.out.print("Adjacency List Graph Representation");
        System.out.println("\n");
        AdjacencyListGraph listGraph = new AdjacencyListGraph();

        listGraph.addNode(new Node("A"));
        listGraph.addNode(new Node("B"));
        listGraph.addNode(new Node("C"));
        listGraph.addNode(new Node("D"));
        listGraph.addNode(new Node("E"));
        listGraph.addNode(new Node("F"));
        listGraph.addNode(new Node("G"));
        listGraph.addNode(new Node("H"));
        listGraph.addNode(new Node("I"));

        listGraph.addEdge(0, 1);
        listGraph.addEdge(0, 4);
        listGraph.addEdge(0, 3);
        listGraph.addEdge(1, 4);
        listGraph.addEdge(3, 6);
        listGraph.addEdge(4, 5);
        listGraph.addEdge(4, 7);
        listGraph.addEdge(6, 7);
        listGraph.addEdge(5, 2);
        listGraph.addEdge(5, 7);
        listGraph.addEdge(7, 8);
        listGraph.addEdge(2, 1);
        listGraph.addEdge(8, 5);
        listGraph.printGraph();
        System.out.println("\n");
    }
}
