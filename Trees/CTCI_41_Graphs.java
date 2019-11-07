package Trees;

import java.util.Iterator;
import java.util.LinkedList;

class CTCI_41_Graphs {

    private int V;
    private LinkedList<Integer> adj[];

      CTCI_41_Graphs(int v){
        V = v;
        adj = new LinkedList[V];
        for(int i=0;i<V;i++){
            adj[i] = new LinkedList();
        }
    }

    void addEdge(int v, int w) {
          adj[v].add(w);
    }

    Boolean isReachable(int s, int d) {
        boolean visited[] = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<Integer>();

        visited[s] = true;
        queue.add(s);

        Iterator<Integer> i;
        while (queue.size() != 0) {
            s = queue.poll();
            int n;
            i = adj[s].listIterator();

            while (i.hasNext()) {
                n = i.next();

                if (n == d) {
                    return true;
                }
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
        return false;

    }
    public static void main(String[] args) {
        CTCI_41_Graphs CTCI41Graphs = new CTCI_41_Graphs(4);
        CTCI41Graphs.addEdge(0,1);
        CTCI41Graphs.addEdge(0,2);
        CTCI41Graphs.addEdge(1,2);
        CTCI41Graphs.addEdge(2,0);
        CTCI41Graphs.addEdge(2,3);
        CTCI41Graphs.addEdge(3,3);

        int u = 3;
        int v = 1;
        if(CTCI41Graphs.isReachable(u,v)){
            System.out.println("there is path between "+u+" to "+v+"");
        }
        else {
            System.out.println("there is no path between "+u+" to "+v+"");

        }

    }
}
