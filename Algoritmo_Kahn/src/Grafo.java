import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Grafo {

    List<List<Integer>> listaAdjc;
    List<Integer> grauDoVertice;

    Grafo(List<Aresta> arestas, int n) {
        listaAdjc = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            listaAdjc.add(new ArrayList<>());
        }
        grauDoVertice = new ArrayList<>(Collections.nCopies(n, 0));

        // adiciona arestas ao grafo direcionado
        for (Aresta aresta : arestas) {
            int inicio = aresta.getInicio();
            int fim = aresta.getFim();

            listaAdjc.get(inicio).add(fim);

            grauDoVertice.set(fim, grauDoVertice.get(fim) + 1);
        }
    }
    //realiza uma ordenação topologica em uma DAG
    public static List<Integer>ordenacaoTopologica(Grafo grafo, int n){
        List<Integer> elementosOrdenados = new ArrayList<>();
        List<Integer> grauDoVertice = grafo.grauDoVertice;
        //S = conjunto de todas as fontes
        Stack<Integer> S = new Stack<>();
        for (int i = 0; i < n; i++){
            if(grauDoVertice.get(i) == 0){
                S.add(i);
            }
        }
        while (!S.isEmpty()){
            int i = S.pop();
            elementosOrdenados.add(i);
            for (int m: grafo.listaAdjc.get(i)){
                grauDoVertice.set(m, grauDoVertice.get(m) -1);
                if (grauDoVertice.get(m) == 0){
                    S.add(m);
                }
            }
        }
        for (int i =0; i< n; i++){
            if (grauDoVertice.get(i) != 0){
                return null;
            }
        }
        return  elementosOrdenados;
    }
}


