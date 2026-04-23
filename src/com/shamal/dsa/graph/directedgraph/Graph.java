package com.shamal.dsa.graph.directedgraph;

import java.util.Stack;

public class Graph {
    private Vertex [] vertices ;
    private int [][] adjEdge;
    private int vertexCount =0;

       public Graph(int maxNumVertices){
            vertices = new Vertex[maxNumVertices];
            adjEdge = new int[maxNumVertices][maxNumVertices];
        }

    public void addVertex(char data){
        Vertex v = new Vertex(data);
        vertices[vertexCount]=v;
        vertexCount++;
    }

    public void addEdge(int from , int to){

            if(from >= vertexCount || to >= vertexCount){
                throw new IllegalArgumentException("INVALID VERTEX INDEX");
            }
            adjEdge[from][to]=1;
    }

    public void depthFirstTraversal() {

        if (vertexCount == 0) {
            System.out.println("GRAPH IS EMPTY");
            return;
        }

            System.out.print(vertices[0].data + "  ");
            vertices[0].isVisited = true;

            Stack<Integer> s = new Stack<>();
            s.push(0);

            while (!s.isEmpty()) {
                int v = getUnvisitedAdjacentVertex(s.peek());

                if (v == -1) {
                    s.pop();
                } else {
                    System.out.print(vertices[v].data + "  ");
                    vertices[v].isVisited = true;
                    s.push(v);
                }
            }

            for (int i = 0; i < vertexCount; i++) {
                vertices[i].isVisited = false;
            }

    }

    private int getUnvisitedAdjacentVertex(int v){
            int result=-1;
            for(int i = 0; i < vertexCount; i++){
                    if(adjEdge[v][i] == 1 && !vertices[i].isVisited){
                        result = i;
                        break;
                    }
            }
            return result;
    }
}
