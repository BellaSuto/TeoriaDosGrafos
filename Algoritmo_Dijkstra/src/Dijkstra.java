import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Dijkstra {

    public void processaCaminho(Vertice vertice) {
        vertice.setDistanciaMinima(0);
        PriorityQueue<Vertice> filaVertice = new PriorityQueue<>();
        filaVertice.add(vertice);

        while (!filaVertice.isEmpty()) {
            Vertice verticeAux = filaVertice.poll();

            // Visita se existir aresta ligada ao vertice
            for (Aresta e : verticeAux.getVizinho()) {
                Vertice v = e.getVerticeFinal();
                double peso = e.getPeso();
                double distanciaMinima = verticeAux.getDistanciaMinima() + peso;

                if (distanciaMinima < v.getDistanciaMinima()) {
                    filaVertice.remove(v);
                    v.setDistanciaMinima(distanciaMinima);
                    v.setAnterior(verticeAux);
                    filaVertice.add(v);
                }
            }
        }
    }

    public List<Vertice> getMenorCaminho(Vertice trajeto) {
        List<Vertice> listVertice = new ArrayList<>();

        for (Vertice vertice = trajeto; vertice != null; vertice = vertice.getAnterior())
            listVertice.add(vertice);

        Collections.reverse(listVertice);
        return listVertice;
    }
}
