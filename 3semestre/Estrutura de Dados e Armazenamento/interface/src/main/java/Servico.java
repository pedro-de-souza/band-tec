public class Servico implements Tributavel{

    private String descrico;
    private Double preco;

    public Servico(String descrico, Double preco) {
        this.descrico = descrico;
        this.preco = preco;
    }

    public Double getValorTributo() {
        return this.preco * 0.12;
    }

    @Override
    public String toString() {
        return "Servico{" +
                "Descrico='" + descrico + '\'' +
                ", Preco=" + preco +
                '}';
    }
}
