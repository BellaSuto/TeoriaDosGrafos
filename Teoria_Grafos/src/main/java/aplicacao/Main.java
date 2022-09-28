package main.java.aplicacao;

import java.util.List;

import main.java.grafo.core.Grafo;
import main.java.grafo.core.Vertice;
import main.java.grafo.search.BuscaEmLargura;
import main.java.grafo.search.BuscaEmProfundidade;

public class Main {
    public static void main(String[] args) throws Exception {
        Grafo grafo1 = new Grafo();

        grafo1.adicionarVertice("A");
        grafo1.adicionarVertice("B");
        grafo1.adicionarVertice("C");
        grafo1.adicionarVertice("D");
        grafo1.adicionarVertice("E");
        grafo1.adicionarVertice("F");

        grafo1.conectarVertices("A", "B");
        grafo1.conectarVertices("A", "C");
        grafo1.conectarVertices("A", "E");
        grafo1.conectarVertices("C", "F");
        grafo1.conectarVertices("E", "F");
        grafo1.conectarVertices("D", "F");

        List<String> caminho = BuscaEmProfundidade.getInstance().buscar(grafo1);

        System.out.print("Caminho feito por uma busca em profundidade no grafo 1: ");
        for (String passo : caminho) {
            System.out.print(passo + " ");
        }
        caminho = BuscaEmLargura.getInstance().buscar(grafo1);
        System.out.println();
        System.out.print("Caminho feito por uma busca em largura no grafo 1: ");

        for (String passo : caminho) {
            System.out.print(passo + " ");
        }

        System.out.println();
        System.out.println();

        Grafo grafo2= new Grafo();
        grafo2.adicionarVertice("A");
        grafo2.adicionarVertice("B");
        grafo2.adicionarVertice("C");
        grafo2.adicionarVertice("D");

        grafo2.conectarVertices("A", "B");
        grafo2.conectarVertices("B", "C");
        grafo2.conectarVertices("B", "D");
        grafo2.conectarVertices("C", "D");

        List<String> caminho2 = BuscaEmProfundidade.getInstance().buscar(grafo2);

        System.out.print("Caminho feito por uma busca em profundidade no grafo 2: ");
        for (String passo : caminho2) {
            System.out.print(passo + " ");
        }
        caminho2 = BuscaEmLargura.getInstance().buscar(grafo2);
        System.out.println();
        System.out.print("Caminho feito por uma busca em largura no grafo 2: ");

        for (String passo : caminho2) {
            System.out.print(passo + " ");
        }

        System.out.println();

        Grafo grafo3= new Grafo();
        grafo3.adicionarVertice("A");
        grafo3.adicionarVertice("B");
        grafo3.adicionarVertice("C");
        grafo3.adicionarVertice("D");
        grafo3.adicionarVertice("E");

        grafo3.conectarVertices("A", "B");
        grafo3.conectarVertices("A", "D");
        grafo3.conectarVertices("A", "E");
        grafo3.conectarVertices("B", "C");
        grafo3.conectarVertices("B", "D");
        grafo3.conectarVertices("C", "D");
        grafo3.conectarVertices("C", "E");

        System.out.println();
        List<String> caminho3 = BuscaEmProfundidade.getInstance().buscar(grafo3);

        System.out.print("Caminho feito por uma busca em profundidade no grafo 3: ");
        for (String passo : caminho3) {
            System.out.print(passo + " ");
        }
        caminho3 = BuscaEmLargura.getInstance().buscar(grafo3);
        System.out.println();
        System.out.print("Caminho feito por uma busca em largura no grafo 3: ");

        for (String passo : caminho3) {
            System.out.print(passo + " ");
        }

        System.out.println();

        Grafo grafo4= new Grafo();
        grafo4.adicionarVertice("A");
        grafo4.adicionarVertice("B");
        grafo4.adicionarVertice("C");
        grafo4.adicionarVertice("D");

        grafo4.conectarVertices("A", "C");
        grafo4.conectarVertices("A", "D");
        grafo4.conectarVertices("B", "C");
        grafo4.conectarVertices("C", "D");


        System.out.println();
        List<String> caminho4 = BuscaEmProfundidade.getInstance().buscar(grafo4);

        System.out.print("Caminho feito por uma busca em profundidade no grafo 4: ");
        for (String passo : caminho4) {
            System.out.print(passo + " ");
        }
        caminho4 = BuscaEmLargura.getInstance().buscar(grafo4);
        System.out.println();
        System.out.print("Caminho feito por uma busca em largura no grafo 4: ");

        for (String passo : caminho4) {
            System.out.print(passo + " ");
        }

        System.out.println();

        Grafo grafo5 = new Grafo();
        grafo5.adicionarVertice("A");
        grafo5.adicionarVertice("B");
        grafo5.adicionarVertice("C");
        grafo5.adicionarVertice("D");
        grafo5.adicionarVertice("E");

        grafo5.conectarVertices("A", "B");
        grafo5.conectarVertices("A", "C");
        grafo5.conectarVertices("A", "E");
        grafo5.conectarVertices("B", "C");
        grafo5.conectarVertices("B", "D");
        grafo5.conectarVertices("C", "D");
        grafo5.conectarVertices("C", "E");


        System.out.println();
        List<String> caminho5 = BuscaEmProfundidade.getInstance().buscar(grafo5);

        System.out.print("Caminho feito por uma busca em profundidade no grafo 5: ");
        for (String passo : caminho5) {
            System.out.print(passo + " ");
        }
        caminho5 = BuscaEmLargura.getInstance().buscar(grafo5);
        System.out.println();
        System.out.print("Caminho feito por uma busca em largura no grafo 5: ");

        for (String passo : caminho5) {
            System.out.print(passo + " ");
        }

        System.out.println();



    }
}

