public class DVD extends Produto{

    private String gravadora;

    public DVD(Integer codigo, String nome, Double precoCusto, String gravadora) {
        super(codigo, nome, precoCusto);
        this.gravadora = gravadora;
    }

    public Double getValorVenda() {
        return getValorVenda() * 1.20;
    }

    @Override
    public String toString() {
        return "DVD - " +
                super.toString() +
                "Gravadora: " + gravadora + "\n";

    }
}
