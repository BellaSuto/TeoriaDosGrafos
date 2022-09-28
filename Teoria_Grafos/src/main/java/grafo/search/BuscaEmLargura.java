package main.java.grafo.search;

import java.util.*;

import main.java.grafo.core.Grafo;
import main.java.grafo.core.Vertice;

public class BuscaEmLargura {
    private ArrayList<Vertice> vertices;
    private static BuscaEmLargura instance;

    public static BuscaEmLargura getInstance() {
        if (instance == null) {
            return new BuscaEmLargura();
        }

        return instance;
    }

    public List<String> buscar(Grafo grafo) {
        Queue<String> roloDeBarbante = new LinkedList<>();
        List<String> marcados = new ArrayList<>();

        marcados.add(grafo.getVertices().get(0).getRotulo());
        roloDeBarbante.add(grafo.getVertices().get(0).getRotulo());
        while (roloDeBarbante.size() > 0) {
            String verticeAtual = roloDeBarbante.poll();

            for (Vertice u : grafo.getAdjacencias(verticeAtual)) {
                if (!marcados.contains(u.getRotulo())) {
                    marcados.add(u.getRotulo());
                    roloDeBarbante.add(u.getRotulo());
                }
            }
        }

        return marcados;
    }
}