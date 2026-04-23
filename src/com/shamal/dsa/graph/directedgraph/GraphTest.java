package com.shamal.dsa.graph.directedgraph;

public class GraphTest {
    public static void main(String[] args) {

        Graph g = new Graph(5);
        g.addVertex('A');
        g.addVertex('B');
        g.addVertex('C');
        g.addVertex('D');
        g.addVertex('E');

        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,3);
        g.addEdge(2,3);
        g.addEdge(2,4);

        g.depthFirstTraversal();

    }
}
