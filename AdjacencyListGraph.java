import java.util.*;

public class AdjacencyListGraph implements GraphInterface {
    ArrayList<LinkedList<Node>> adjlist;

    AdjacencyListGraph() {
        adjlist = new ArrayList<>();
    }// end constrcutor

    /**
     * Creates a new linkedList object with type Node and adds the node to the
     * object.
     * It then adds the list with added node to LinkedList
     * 
     * @param node
     */
    public void addNode(Node node) {
        LinkedList<Node> currentList = new LinkedList<>();
        currentList.add(node);
        adjlist.add(currentList);
    }

    public void addEdge(int source, int destination) {
        LinkedList<Node> currentList = adjlist.get(source);
        Node destinationNode = adjlist.get(destination).get(0);
        currentList.add(destinationNode);
    }

    public boolean checkEdge(int source, int destination) {
        LinkedList<Node> currentList = adjlist.get(source);
        Node destinationNode = adjlist.get(destination).get(0);

        for (Node node : currentList) {
            if (node == destinationNode) {
                return true;
            }
        }
        return false;
    }

    public void printGraph() {
        for (LinkedList<Node> currentList : adjlist) {
            for (Node node : currentList) {
                System.out.print(node.data + " ==> ");
            }
            System.out.println();
        }
    }

    public String printString() {
        StringBuilder b = new StringBuilder();
        for (LinkedList<Node> currentList : adjlist) {
            for (Node node : currentList) {
                b.append(node.data + " ");
            }
        }
        return b.toString();
    }
}
