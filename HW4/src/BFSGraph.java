import java.util.*;

public class BFSGraph {
    private final int V;
    private final LinkedList[] adj;
    private final Queue<Integer> queue;

    public BFSGraph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
        queue = new LinkedList<Integer>();
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    public void BFS(int n) {
        boolean[] nodes = new boolean[V];
        int a;
        nodes[n] = true;
        queue.add(n);
        while (queue.size() != 0) {
            n = queue.poll();
            System.out.print(n + " ");
            for (int i = 0; i < adj[n].size(); i++) {
                a = (int) adj[n].get(i);
                if (!nodes[a]) {
                    nodes[a] = true;
                    queue.add(a);
                }
            }
        }
    }
}