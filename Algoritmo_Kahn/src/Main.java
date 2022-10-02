import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Aresta> arestas = Arrays.asList(
                new Aresta(0,3), new Aresta(0,5),
                new Aresta(1,3), new Aresta(2, 4),
                new Aresta(3,2), new Aresta(3,4),
                new Aresta(3,6), new Aresta(4,6),
                new Aresta(5,4), new Aresta(6,7)
        );
        //numero total de vertices no gráfico
        int n = 8;

        Grafo grafo = new Grafo(arestas,n);

        List<Integer> grafoOrdenado = Grafo.ordenacaoTopologica(grafo, n);
        if(grafoOrdenado != null){
            System.out.println(grafoOrdenado);
        }else {
            System.out.println("Grafo não é um DAG"+"A ordenação topológica não é aplicavél");
        }
    }
}
