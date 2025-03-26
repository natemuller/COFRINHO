import java.util.Collection;

public class Cofrinho {

    private Moeda[] colecaoMoedas;
    private int qtdMoedasAdicionadas;

    public Cofrinho (int numMaxMoedas) {
        colecaoMoedas = new Moeda[numMaxMoedas];
        qtdMoedasAdicionadas = 0;
    }

    public boolean insere(Moeda moeda) {
        if (qtdMoedasAdicionadas < colecaoMoedas.length) {
            colecaoMoedas[qtdMoedasAdicionadas] = moeda;
            qtdMoedasAdicionadas++;
            return true;
        }
        else {
            return false;
        }
    }

    public Moeda retira() {
        if (qtdMoedasAdicionadas > 0) {
            int posUltimaMoedaAdicionada = qtdMoedasAdicionadas - 1;
            Moeda moedaARetirar = colecaoMoedas[posUltimaMoedaAdicionada];
            colecaoMoedas[posUltimaMoedaAdicionada] = null;
            qtdMoedasAdicionadas--;
            return moedaARetirar;
        }
        else {
            return null;
        }
    }

    public int getQtdMoedas() {
        return qtdMoedasAdicionadas;
    }

    public int getQtdMoedasTipo(NomeMoeda nomeMoeda) {
        for (int i = 0; i < qtdMoedasAdicionadas; i++) {
            if (colecaoMoedas[i].getNomeMoeda() == nomeMoeda) {
                return 1;
            }
        }
        return 0;
    }

    public int getValorTotalCentavos() {

        return 0;
    }

    public double getValorTotalReais() {

        return 0;
    }
}

