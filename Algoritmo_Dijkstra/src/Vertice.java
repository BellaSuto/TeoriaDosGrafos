import java.util.ArrayList;
import java.util.List;

public class Vertice implements Comparable<Vertice> {

    private final String nome;
    private Vertice anterior;
    private List<Aresta> vizinho ;
    private double distanciaMinima = Double.POSITIVE_INFINITY;

    public Vertice(String nome) {
        this.nome = nome;
        this.vizinho = new ArrayList<>();
    }
    public void addVizinha(Aresta aresta){
        this.vizinho.add(aresta);
    }

    public String toString() {
        return this.getNome();
    }

    //Verifica se o vértice tem a distancia menor
    public int compareTo(Vertice vertice) {
        return Double.compare(getDistanciaMinima(), vertice.getDistanciaMinima());
    }

    public String getNome() {
        return nome;
    }

    public Vertice getAnterior() {
        return anterior;
    }

    public void setAnterior(Vertice anterior) {
        this.anterior = anterior;
    }

    public List<Aresta> getVizinho() {
        return vizinho;
    }

    public double getDistanciaMinima() {
        return distanciaMinima;
    }

    public void setDistanciaMinima(double distanciaMinima) {
        this.distanciaMinima = distanciaMinima;
    }
}
