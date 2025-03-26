public class App {
    
    public static void main(String[] args) throws Exception {
        Moeda m1 = new Moeda(NomeMoeda.Dez);
        Moeda m2 = new Moeda(NomeMoeda.Cinquenta);

        Cofrinho cofrinho = new Cofrinho(10);
        cofrinho.insere(m1);
        cofrinho.insere(m2);
        
        System.out.println(cofrinho.getValorTotalCentavos());
        System.out.println(cofrinho.retira());
        
        System.out.println(cofrinho.getValorTotalCentavos());
        System.out.println(cofrinho.getValorTotalReais());

    }
}
