public class Main {
    public static void main(String[] args) {

        Dijkstra dijkstra = new Dijkstra();

        Vertice v1 = new Vertice("A");
        Vertice v2 = new Vertice("B");
        Vertice v3 = new Vertice("C");
        Vertice v4 = new Vertice("D");
        Vertice v5 = new Vertice("E");

        v1.addVizinha(new Aresta(3.0, v1,v2));
        v2.addVizinha(new Aresta(1.0, v2,v5));
        v1.addVizinha(new Aresta(2.0, v1,v3));
        v2.addVizinha(new Aresta(3.0, v2,v3));
        v3.addVizinha(new Aresta(2.0, v3,v5));
        v4.addVizinha(new Aresta(1.0, v4,v3));
        v5.addVizinha(new Aresta(2.0, v5,v4));

        dijkstra.processaCaminho(v1);

        System.out.println(dijkstra.getMenorCaminho(v5));


    }
}
