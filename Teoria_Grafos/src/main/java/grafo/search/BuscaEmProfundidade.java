package main.java.grafo.search;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Stack;
import main.java.grafo.core.Grafo;
import main.java.grafo.core.Vertice;

public class BuscaEmProfundidade {
    private static BuscaEmProfundidade instance;

    private BuscaEmProfundidade() {
    }

    public static BuscaEmProfundidade getInstance() {
        if (instance == null) {
            return new BuscaEmProfundidade();
        }

        return instance;
    }

    /*public void dfs(Grafo grafo, String origem) {
        //public List<String> buscar(Grafo grafo, String origem) {
        Stack<String> roloDeBarbante = new Stack<String>();
        LinkedHashSet<String> verticesVisitados = new LinkedHashSet<>();
        Caminho caminho = new Caminho();

        roloDeBarbante.push(origem);

        while (!roloDeBarbante.empty()) {
            String v = roloDeBarbante.pop();
            for (Vertice u : grafo.getAdjacencias(v)) {//adjacencia é a aresta
                String rotulo = u.getRotulo();
                if (!verticesVisitados.contains(rotulo)) {//verifica se uma string contém uma sequência de caracteres.Retorna truese os caracteres existirem e falsese não existirem.
                    System.out.print(rotulo + " ");
                    //System.out.println(roloDeBarbante);
                    verticesVisitados.add(rotulo);
                    roloDeBarbante.push(rotulo);
                }*/

/*
   public List<String> buscar(Grafo grafo, String origem, String destino) {
       //boolean[] visitados = new boolean[rotulo];
       Stack<String> roloDeBarbante = new Stack<String>();
       LinkedHashSet<String> verticesVisitados = new LinkedHashSet<>();
       Caminho caminho = new Caminho();

       roloDeBarbante.push(origem);

       while (!roloDeBarbante.empty()) {
           String v = roloDeBarbante.pop();
           for (Vertice u : grafo.getAdjacencias(v)) {//adjacencia é a aresta
               String rotulo = u.getRotulo();
               if (!verticesVisitados.contains(rotulo)) {
                   verticesVisitados.add(rotulo);
                   caminho.ligar(rotulo, v);
                   roloDeBarbante.push(rotulo);
               }
           }
       }

       return caminho.gerar(origem, destino);
   }
   */
    public List<String> buscar(Grafo grafo) {
        Stack<String> roloDeBarbante = new Stack<>();
        List<String> marcados = new ArrayList<>();
        List<String> resultado = new ArrayList<>();

        roloDeBarbante.add(grafo.getVertices().get(0).getRotulo());
        marcados.add(grafo.getVertices().get(0).getRotulo());

        while (roloDeBarbante.size() > 0) {
            String verticeAtual = roloDeBarbante.pop();
            resultado.add(verticeAtual);

            for (Vertice u : grafo.getAdjacencias(verticeAtual)) {
                if (!marcados.contains(u.getRotulo())) {
                    marcados.add(u.getRotulo());
                    roloDeBarbante.add(u.getRotulo());
                }
            }
        }

        return resultado;
    }
}
