import java.util.*;

public class AdjacencyMatrixGraph implements GraphInterface {

    ArrayList<Node> nodes;
    private static int matrix[][];
    StringBuilder b = new StringBuilder();

    AdjacencyMatrixGraph(int size) {
        nodes = new ArrayList<>();
        matrix = new int[size][size];
    }// end constructor

    public void addNode(Node node) {
        nodes.add(node);
    }// end addNode

    /**
     * Sets an edge with a value of 1
     * 
     * @param source      Initial node
     * @param destination Direction the node is going to (child)
     */
    public void addEdge(int source, int destination) {
        matrix[source][destination] = 1;
    }// end addEdge

    /**
     * Checks if the source has a destination
     * 
     * @param source      Initial node
     * @param destination Direction the node is going to (child)
     * @return True if there is an edge, false if there is no edge
     */
    public boolean checkEdge(int source, int destination) {
        if (matrix[source][destination] == 1) {
            return true;
        } else {
            return false;
        }
    }// end checkEdge

    /**
     * Performs Breadth-first Traversal
     * 
     * @param start       The beginning Node
     * @param numOfVertex The total number of Nodes
     */
    public String BFS(int start, int numOfVertex) {
        StringBuilder c = new StringBuilder();
        // array to keep track of what nodes the algorithem has seen
        boolean[] seen = new boolean[numOfVertex];
        // filling array to set all of the nodes as unseen
        Arrays.fill(seen, false);
        // temp value
        int temp;
        List<Integer> list = new ArrayList<>();
        list.add(start);
        // setting start as seen
        seen[start] = true;

        while (!list.isEmpty()) {
            temp = list.get(0);
            // Print the current node/vertex
            System.out.print(nodes.get(temp).data + " ");
            c.append(nodes.get(temp).data + " ");
            list.remove(list.get(0));

            // For every adjacent vertex to the current vertex
            for (int i = 0; i < numOfVertex; i++) {
                if (matrix[temp][i] == 1 && (!seen[i])) {
                    list.add(i);
                    seen[i] = true;
                }
            }
        }
        return (c.toString());
    }

    /**
     * Performs Depth-first Traversal
     * 
     * @param start       The beginning Node
     * @param seen        Array to see if node has been seen
     * @param numOfVertex The total number of Nodes
     */
    public String DFS(int start, boolean[] seen, int numOfVertex) {
        // prints start node
        System.out.print(nodes.get(start).data + " ");
        b.append(nodes.get(start).data + " ");
        // setting start node as seen
        seen[start] = true;
        // for number of nodes DFS if not seen
        for (int i = 0; i < numOfVertex; i++) {
            if (matrix[start][i] == 1 && (!seen[i])) {
                DFS(i, seen, numOfVertex);
            }
        }
        return (b.toString());
    }

    /**
     * Prints the graph as 1's and 0's whether or not it contains an edge
     * 
     * @return An adjacency matrix of the Graph
     */
    public void printGraph() {
        System.out.print("  ");
        for (Node node : nodes) {
            System.out.print(node.data + " ");
        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(nodes.get(i).data + " ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}