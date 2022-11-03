public class Aresta {

    private double peso;
    private Vertice verticeInicial;
    private Vertice verticeFinal;

    public Aresta(double peso, Vertice verticeInicial, Vertice verticeFinal)
    {
        this.peso = peso;
        this.verticeInicial = verticeInicial;
        this.verticeFinal = verticeFinal;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Vertice getVerticeInicial() {
        return verticeInicial;
    }

    public void setVerticeInicial(Vertice verticeInicial) {
        this.verticeInicial = verticeInicial;
    }

    public Vertice getVerticeFinal() {
        return verticeFinal;
    }

    public void setVerticeFinal(Vertice verticeFinal) {
        this.verticeFinal = verticeFinal;
    }
}
