public interface GraphInterface {
    public void addNode(Node node);

    public void addEdge(int source, int destination);

    public boolean checkEdge(int source, int destination);

    public void printGraph();
}
