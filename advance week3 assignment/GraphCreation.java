import java.util.LinkedList;

class Graph{
    int v;
    LinkedList<Integer> list[];

    Graph(int v) {
        this.v = v;
        list = new LinkedList[this.v];
        for (int i = 0; i < v; i++)
            list[i] = new LinkedList<>();
    }

    void addEdge(int a, int b) {
        list[a].add(b);
    }
}

public class GraphCreation{
    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        
  
    }
}