package main.java.grafo.search;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Caminho {
    private Map<String, String> caminho;

    public Caminho() {
        this.caminho = new HashMap<>();
    }

    void ligar(String anterior, String proximo) {
        this.caminho.put(anterior, proximo);//é usado para associar o valor especificado à chave especificada neste mapa.
    }

    public List<String> gerar(String origem, String destino) {
        List<String> resultado = new ArrayList<>();
        String no = destino;

        while (no != origem && this.caminho.containsKey(no)) {//containsKey é usado para verificar se uma chave específica está sendo mapeada no mapa ou não
            resultado.add(no);
            no = this.caminho.get(no);
        }

        resultado.add(no);
        Collections.reverse(resultado);

        return resultado;
    }
}
